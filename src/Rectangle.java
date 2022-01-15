public class Rectangle {
    private int length;
    private int breadth;

    public int calculatePerimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.setLength(5);
        rec.setBreadth(3);
        System.out.println(rec.calculatePerimeter(rec.getLength(), rec.getBreadth()));
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }
}


