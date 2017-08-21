/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author lucif
 */
public class Rectangle {
    private float length;
    private float width;
    private double area;
    private double perimeter;

    public Rectangle(float length, float width, double area, double perimeter) {
        this.length = length;
        this.width = width;
        this.area = area;
        this.perimeter = perimeter;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public Rectangle() {
    }
    
    
}
