public class Bill {

    private int billId;
    private int customerId;
    private int discount;
    private float billAmount;

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setBillAmount(float billAmount) {
        this.billAmount = billAmount;
    }

    public float getBillAmount() {
        return billAmount;
    }

    public float getDiscount() {
        return discount;
    }

    public int getBillId() {
        return billId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public float discountedBillAmount(){
        return this.getBillAmount() - this.getBillAmount() * this.getDiscount()/100;
    }

    public static void main(String[] args) {
       Bill retailStorageBill = new Bill();

        retailStorageBill.setBillId(1001);
        retailStorageBill.setCustomerId(101);
        retailStorageBill.setDiscount(2);
        retailStorageBill.setBillAmount(199.99f);
        System.out.println(retailStorageBill.getBillId() + " " + retailStorageBill.getCustomerId() + " " + retailStorageBill.discountedBillAmount());

        retailStorageBill.setBillId(1002);
        retailStorageBill.setCustomerId(102);
        retailStorageBill.setDiscount(4);
        retailStorageBill.setBillAmount(210.5f);
        System.out.println(retailStorageBill.getBillId() + " " + retailStorageBill.getCustomerId() + " " + retailStorageBill.discountedBillAmount());
    }


}
