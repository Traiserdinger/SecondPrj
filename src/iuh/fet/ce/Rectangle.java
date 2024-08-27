package iuh.fet.ce;
/*
 * @description: Chuong trinh nhan dien ve chieu dai va chieu rong cua 1 hình chu nhat va tinh chu vi va dien tich no
 * @author: Nguyen Duc Trung
 * @version 1.0
 * @created 27-Aug-2024 15:28 PM
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
    }
    /**
     * Description: Set the length and width of the rectangle
     * @param length The length of Rectangle
     * @param width The width of Rectangle
     * @throws IllegalArgumentException if length or width is less than 0
     */
    public Rectangle(double length, double width){
        if(length<0){
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        if(width<0){
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        else{
            this.length=length;
            this.width=width;
        }
    }
    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    /**
     * Description: Set the length of the rectangle
     * @param newVal The length of Rectangle
     * @throws IllegalArgumentException if length is less than 0
     */
    public void setLength(double newVal){
        if(newVal<0){
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        else{
            this.length=newVal;
        }
    }

    /**
     * Description: Set the width of the rectangle
     * @param newVal The width of Rectangle
     * @throws IllegalArgumentException if width is less than 0
     */
    public void setWidth(double newVal){
        if(newVal<0){
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        else{
            this.width=newVal;
        }
    }

    public double getArea(){
        return getLength()*getWidth();
    }

    public double getPerimeter(){
        return 2*(getLength()+getWidth());
    }
}
