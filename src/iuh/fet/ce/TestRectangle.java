package iuh.fet.ce;

import java.util.Scanner;
/*
 * @description: Class de chay chuong trinh nhap chieu dai, chieu rong cua hinh chu nhat va tinh chu vi, dien tich
 * @author: Nguyen Duc Trung
 * @version 1.0
 * @created 27-Aug-2024 15:28 PM
 */

public class TestRectangle {
    /**
     * Description: Receive the length and width as input and calculate the perimeter and area of the rectangle.
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double l,w;
            System.out.println("Enter the length of the rectangle: ");
            try {
                l = sc.nextDouble();
                Rectangle r1 = new Rectangle(l,1);
                r1.setWidth(1);
            }catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }
            System.out.println("\nEnter the width of the rectangle: ");
            try {
                w = sc.nextDouble();
                Rectangle r1 = new Rectangle(1,w);
                r1.setLength(1);
            }catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }
            Rectangle r1 = new Rectangle(l, w);
            System.out.println("Area: " + r1.getArea());
            System.out.println("\nPerimeter: " + r1.getPerimeter());
        }
}
