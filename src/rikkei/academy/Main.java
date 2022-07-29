package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle(5,"blue");
        System.out.println("bán kính là: " + circle.getRadius());
        System.out.println("Diện tích là:" + circle.getArea());
    }
}