public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Point
        Point center = new Point(5, 6);
        
        // Tworzenie obiektu klasy Circle i inicjowanie go wartościami
        Circle circle = new Circle(center, 9);

        // Wyświetlanie właściwości koła
        System.out.println("Punkty: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promien: " + circle.getRadius());
        System.out.println("Obwod kola: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni kola: " + circle.getArea());
    }
}
