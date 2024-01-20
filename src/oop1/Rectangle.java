package oop1;

public class Rectangle {

    int width = 5;
    int height = 8;

    static int calculateArea(int width, int height) {
        int area = width * height;
        System.out.println("넓이 : " + area);
        return area;
    }

    static int calculatePerimeter(int width, int height) {
        int perimeter = 2 * (width + height);
        System.out.println("둘레 길이 : " + perimeter);
        return perimeter ;

    }

    static boolean isSquare(int width, int height) {
        boolean square = isSquare(width, height);
        System.out.println("정상각형 여부 : " + square);
        return square;
    }

}
