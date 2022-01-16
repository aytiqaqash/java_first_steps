class Bank {
    public static void main(String[] args) {
        int[] phone = new int[3];   // primitive type array
        phone[0] = 7120686;
        phone[1] = 7120687;       // inserting element in an array
        phone[2] = 7120684;

        int count = 1;
        for(int i = 0; i < phone.length; ++i) {   // traversing an array
            System.out.println("phone number " + count + ": " + phone[i]);
            ++count;
        }

        Customer[] customer = new Customer[2]; //Reference type Array
        Customer customer1 = new Customer("Anil", "Acc12345");
        Customer customer2 = new Customer("Ajay", "Acc12346");
        customer[0] = customer1; //storing in the array
        customer[1] = customer2;
        for(int i=0;i<customer.length;i++){ //traversing the array
            Customer customeObject = customer[i]; //retrieving customer Object
            String name = customeObject.displayCustomerName();
            System.out.println("the customer name is..."+name);

        }
    }
}

class Customer{
    private String name;
    private String customerId;

    Customer(String uname, String ucustomerId){
        name = uname;
        customerId = ucustomerId;
    }

    public String displayCustomerName(){
        return name;
    }
}