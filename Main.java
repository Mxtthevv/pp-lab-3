public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8, 2);

        System.out.println("Długość: " + rectangle.getLength());
        System.out.println("Szerokość: " + rectangle.getWidth());
        System.out.println("Pole: " + rectangle.calculateArea());
        System.out.println("Obwód: " + rectangle.calculatePerimeter());
    }
}
