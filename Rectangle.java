package INFO5100.Excerise3;

import INFO5100.Exercise2.Shape;

import java.io.Serializable;

public class Rectangle implements Serializable {

    int length ;
    int width;
    String color;
    public Rectangle() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
