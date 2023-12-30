class PrintNumbers implements Runnable {
    private static final Object lock = new Object();
    private static int N;
    private static int number = 1;
    private final boolean isEvenThread;
    PrintNumbers(boolean isEvenThread) {
        this.isEvenThread = isEvenThread;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                while ((isEvenThread && (number % 2 == 1)) || (!isEvenThread && (number % 2 == 0))) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (number > N) {
                    break;
                }
                System.out.print(number + " ");
                number++;
                lock.notifyAll();
            }
        }
    }
    public static void main(String[] args) {
        N = 18; 
        Thread oddThread = new Thread(new PrintNumbers(false));
        Thread evenThread = new Thread(new PrintNumbers(true));
        oddThread.start();
        evenThread.start();
    }
}
