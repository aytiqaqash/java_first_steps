class Person2 {
    private String name;
    private static int age;
    static {
//        name = "john"; // line 1
    }

    Person2() {
        age = 20; // line 2
    }

    public int getAge() {
        return age; //line 3
    }
}

public class Account2 {
    public static void main(String[] args) {
        System.out.println(new Person2().getAge());
    }
}