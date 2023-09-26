package BT2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Diện tích của hình tròn với bán kính 3.5 là: " +StaticMethod.calCircleArea(3.5));
        System.out.println("Diện tích của hình tròn với bán kính 6 là: " +StaticMethod.calCircleArea(6));
        System.out.println("Diện tích hình tam giác có các cạnh là (3,4,5) là: "+StaticMethod.calTriangleArea(3,4,5));
        System.out.println("Diện tích hình tam giác có các cạnh là (4.5,7,6) là: "+StaticMethod.calTriangleArea(4.5,7,6));
        System.out.println("Diện tích của hình chữ nhật có kích thước (2.5,6) là:" + StaticMethod.calRectangleArea(2.5,6));
        System.out.println("Diện tích của hình chữ nhật có kích thước (4,7) là:" + StaticMethod.calRectangleArea(4,7));
    }
}
