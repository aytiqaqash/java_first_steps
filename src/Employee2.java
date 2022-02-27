/*
    Problem Description: Let us create a performance rating system to calculate the performance of each employee.
    Create an Employee class with an instance variable point: int with private access modifier. Generate getter and setter method of the instance variable.
    Create a class called "PerformanceRating" keep four class variables with constant value and private access modifier: Outstanding: int, Good: int, Average: int, and Poor: int
    Outstanding=5
    Good=4
    Average=3
    Poor=2
    Create a static method to calculate the performance of each employee.
    static int calculatePerformace (Employee employee){ }
    Calculate the performance of each employee based on some business rules:
    Note: The point of each employee should be less than 100.
    If the point is between 80 -100 give outstanding rating.
    If the point is between 60- 79 give good rating.
    If the point is between 50- 59 give average rating.
    If the point is between 1- 49 give poor rating.
    Develop the main class "PerformanceCalculator". Create 3 employee objects, set their point, and calculate their performance rating based on the point they have achieved, and print their respective rating on the console.
*/
public class Employee2 {
    private int point;
    public void setPoint(int point) {
        this.point = point;
    }
    public int getPoint() {
        return point;
    }
}
class PerformanceRating{
    private static final int outstanding = 5;
    private static final int good = 4;
    private static final int average = 3;
    private static final int poor = 2;

    static int calculatePerformace (Employee2 employee){
        if(employee.getPoint() >= 80 && employee.getPoint() <= 100){
            return outstanding;
        }
        if(employee.getPoint() >= 60 && employee.getPoint() <= 79){
            return good;
        }
        if(employee.getPoint() >= 50 && employee.getPoint() <= 59){
            return average;
        }
        if(employee.getPoint() >= 1 && employee.getPoint() <= 49){
            return poor;
        }
        return 0;
    }


    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        emp.setPoint(78);
        System.out.println(PerformanceRating.calculatePerformace(emp));
        Employee2 emp2 = new Employee2();
        emp2.setPoint(35);
        System.out.println(PerformanceRating.calculatePerformace(emp2));
        Employee2 emp3 = new Employee2();
        emp3.setPoint(99);
        System.out.println(PerformanceRating.calculatePerformace(emp3));
    }
}