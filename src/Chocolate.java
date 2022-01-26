public class Chocolate {

    private int barCode, weight, cost;
    private String name;

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBarCode() {
        return barCode;
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Chocolate(int barCode, int weight, int cost, String name ){
        this.setBarCode(barCode);
        this.setCost(cost);
        this.setName(name);
        this.setWeight(weight);
    }

    public static void main(String[] args) {
        Chocolate ch = new Chocolate(101,12,10, "Cadbury");
        System.out.println(ch.getBarCode() + " - " + ch.getCost() + " - " + ch.getWeight() + " - " + ch.getName());
    }
}

