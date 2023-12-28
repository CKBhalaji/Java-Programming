public class Constructor {
    private int id;
    private String name;
    public Constructor() {
        System.out.println("No arguments constructor called");
    }
    public Constructor(int id) {
        this.id = id;
        System.out.println("Default constructor with id parameter called");
    }
    public Constructor(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Parameterized constructor with id and name parameters called");
    }
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        obj1.display();
        Constructor obj2 = new Constructor(101);
        obj2.display();
        Constructor obj3 = new Constructor(102, "John");
        obj3.display();
    }
}
