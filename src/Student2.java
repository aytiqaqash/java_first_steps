public class Student2 extends Person1 {
    void Print() {
        System.out.println("student name" + name);
    }

    Student2() {
        System.out.println("In Student class");
    }

    int id;

    public static void main(String[] args) {
        Person1 person = null;
        person = new Student2();
        person.name = "abc";
        person.Print();
    }
}