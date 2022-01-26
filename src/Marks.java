public class Marks {
    int[] arr = new int[5];

    public void storeMarks() {
        arr[0] = 85;
        arr[1] = 83;
        arr[2] = 87;
        arr[3] = 95;
        arr[4] = 90;
    }

    public void display() {
        for (int x:arr){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Marks m = new Marks();
        m.storeMarks();
        m.display();
    }
}
