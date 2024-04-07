public class Main {
    public static void main(String[] args) {

        Point center = new Point(5, 6);
        
        ColoredCircle coloredCircle = new ColoredCircle(center, 9, "Niebieski");

        System.out.println("Center: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Radius: " + coloredCircle.getRadius());
        System.out.println("Color: " + coloredCircle.getColor());
        System.out.println("Perimeter: " + coloredCircle.calculatePerimeter());
        System.out.println("Area: " + coloredCircle.getArea());
    }
}
