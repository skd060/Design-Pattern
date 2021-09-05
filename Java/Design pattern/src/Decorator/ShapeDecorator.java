package Decorator;

abstract class ShapeDecorator implements Shape  {
    Shape shape;
    ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
}
