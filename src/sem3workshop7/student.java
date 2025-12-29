package sem3workshop7;

public class student {

    private String name;
    private int age;

    // Constructor
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        student s = new student("Sapana", 20);
        s.display();
    }
}
