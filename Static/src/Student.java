public class Student {
    private int id;
    private String name;
    private static String college = "HELLO";

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}
