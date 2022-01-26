class Person{
    String name;
    Person(){
        System.out.println("In Person class");
    }
}
class Student extends Person{
    Student(){
        System.out.println("In Student class");
    }
    int id;
    public static void main(String[] a){
        Student ob=new Student(); //Line 1
        ob.name="abc"; //Line 2
        ob.id=123;}
}