//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // (1). Testing Circle:
        Circle circle1 = new Circle(4.5);
        System.out.printf("Area: %.2f\n", circle1.calculateArea());
        System.out.printf("Circumference: %.2f\n", circle1.calculateCircumference());

        Circle circle2 = new Circle();
        circle2.setRadius(8.6);
        System.out.println("Radius: " + circle2.getRadius());
        System.out.printf("Area: %.2f\n", circle2.calculateArea());
        System.out.printf("Circumference: %.2f\n", circle2.calculateCircumference());

        System.out.println("*************************");
        // (2). Test Rectangle:
        Rectangle rectangle1 = new Rectangle(4.5, 8.5);
        System.out.printf("Area: %.2f\n", rectangle1.calculateArea());
        System.out.printf("Perimeter: %.2f\n", rectangle1.calculateCircumference());

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setHeight(9);
        rectangle2.setWidth(3.5);
        System.out.println("Height: " + rectangle2.getHeight() + "\nWidth: " + rectangle2.getWidth());
        System.out.printf("Area: %.2f\nPerimeter: %.2f\n", rectangle2.calculateArea(), rectangle2.calculateCircumference());

        System.out.println("************************");
        Triangle triangle1 = new Triangle(6, 3);
        System.out.printf("Area: %.2f \nPerimeter: %.2f\n", triangle1.calculateArea(), triangle1.calculateCircumference());

        Triangle triangle2 = new Triangle();
        triangle2.setHeight(8);
        triangle2.setBase(4);
        System.out.println("Height: " + triangle2.getHeight() + "\nBase: " + triangle2.getBase());
        System.out.printf("Area: %.2f \nPerimeter: %.2f", triangle2.calculateArea(), triangle2.calculateCircumference());
        


    }
}