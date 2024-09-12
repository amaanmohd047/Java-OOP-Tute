import static example.Message.message;

public class Main {

    public static void main(String[] args) {
        Student Me = new Student(2, "Hl", 90.2);

        System.out.println(Me.rollNo + ", " + Me.name + ", " + Me.marks);

        message();
    }

    static class Student {
        int rollNo;
        String name;
        double marks;
        Student(int rollNo, String name, double marks) {
            this.marks = marks;
            this.rollNo = rollNo;
            this.name = name;
        }
    }
}