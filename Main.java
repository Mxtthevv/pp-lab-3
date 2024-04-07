public class Main {
    public static void main(String[] args) {

        Circle[] circles = new Circle[4];
        
        Point center1 = new Point(5, 3);
        Circle circle1 = new Circle(center1, 6);
        circles[0] = circle1;

        Point center2 = new Point(7, 2);
        ColoredCircle coloredCircle = new ColoredCircle(center2, 3, "niebieski");
        circles[1] = coloredCircle;

        for (Circle circle : circles) {
            double area = circle.getArea();
            System.out.println("Area: " + area);

            if (circle instanceof ColoredCircle) {

                String color = ((ColoredCircle) circle).getColor();
                System.out.println("Color: " + color);
            }
        }
    }
}
