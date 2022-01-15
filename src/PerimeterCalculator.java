public class PerimeterCalculator {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setBreadth(5);
        rect.setLength(4);
        System.out.println(rect.calculatePerimeter());
    }
}