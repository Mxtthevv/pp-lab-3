public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(5, 1), 2);
        circles[1] = new Circle(new Point(6, 3), 2);
        circles[2] = new ColoredCircle(new Point(-8, 1), 3, "niebieski");

        for (Circle circle : circles) {
            double area = circle.getArea();
            System.out.println("Pole powierzchni: " + area);

            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                String color = coloredCircle.getColor();
                System.out.println("Kolor koła: " + color);
            }
        }
    }
}
