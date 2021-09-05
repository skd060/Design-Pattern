package Decorator;

public class Rectangular implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangular is drawing");
    }

    @Override
    public void resize() {
        System.out.println("Rectangular is resizing");
    }

    @Override
    public void description() {
        System.out.println("Rectangular is draw and resized");
    }
}
