package BT1;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("MCK");
        System.out.println("giá trị myString ban đầu là: " +myClass.getMyString());
        myClass.setMyString("Wxrdie");
        System.out.println("giá trị myString sau thay dổi là: " + myClass.getMyString());
    }
}
