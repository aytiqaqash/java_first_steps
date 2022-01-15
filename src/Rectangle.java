public class Rectangle {
    private int length;
    private int breadth;

    public int calculatePerimeter() {
        return 2 * (this.getLength() + this.getBreadth());
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.setLength(5);
        rec.setBreadth(3);
        System.out.println(rec.calculatePerimeter());
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


