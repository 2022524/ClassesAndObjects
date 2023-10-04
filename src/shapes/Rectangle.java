/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author tarqu
 */
public class Rectangle {
    private String colour;
    private boolean isFilled;
    private int height = 5;
    private int width = 7;

    public String getColour() {
        return colour;
    }

    public boolean isIsFilled() {
        return isFilled;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    
    public int getArea() {
        return width * height;
        
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    
}
