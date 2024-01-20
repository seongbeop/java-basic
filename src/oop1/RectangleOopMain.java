package oop1;

public class RectangleOopMain {

    public static void main(String[] args) {

        RectangleOop rectangle = new RectangleOop();

        rectangle.width = 5;
        rectangle.height = 8;

        //넓이

        System.out.println("넓이 : " + rectangle.calculateArea());
        //둘레
        System.out.println("둘레 : " + rectangle.calculatePerimeter());

        //정사각형 여부
        System.out.println("정사각형 여부 : " + rectangle.isSquare());
    }
}
