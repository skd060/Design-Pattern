package Decorator;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle is drawing");
    }

    @Override
    public void resize() {
        System.out.println("Circle is resize");
    }

    @Override
    public void description() {
        System.out.println("Circle is draw and resized");
    }
}
