public class ChocolateTester {
    public static void main(String[] args) {
        Chocolate ch = new Chocolate(102,24,50,"Hershey's");
        System.out.println(ch.getBarCode() + " - " + ch.getCost() + " - " + ch.getWeight() + " - " + ch.getName());
    }
}
