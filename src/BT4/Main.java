package BT4;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();


        student.setName("Nguyễn Văn Khanh");


        student.setClasses("RA-Java");
        System.out.println(student.name);
        System.out.println(student.getClasses());
    }
}
