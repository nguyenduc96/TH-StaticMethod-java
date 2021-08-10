public class Main {
    public static void main(String args[]) {

        Student s1 = new Student(1, "Đức");
        Student s2 = new Student(2, "Đẹp");
        Student s3 = new Student(3, "Trai");

        s1.display();
        s2.display();
        s3.display();

        Student.change();

        s1.display();
        s2.display();
        s3.display();
    }
}
