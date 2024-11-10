package hw1;

public class Person {
    protected String name;
    private int age;
    private double height;
    private double wight;

    public Person(){}
    public Person(int age, double height, double weight){
        this.age = age;
        this.height = height;
        this.wight = weight;
    }
    public String toString(){
        return "name: " + name + ", age: " + age + ", height: " + height + ", weight: " + wight;
    }

}

class Student extends Person{
    private int grade;
    private String major;
    public Student(){};
    public Student(String name, int age, double height, double weight, int grade, String major){
        super(age, height, weight);
        this.name=name;
        this.grade=grade;
        this.major=major;
    }
    public String toString(){
        return super.toString() + " grade: " + grade + ", major: " + major;
    }
}
class Employee extends Person{
    private int salary;
    private String dept;
    public Employee(){};
    public Employee(String name, int age, double height, double weight, int salary, String dept){
        super(age, height, weight);
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }
    public String toString(){
        return super.toString() + " salary: " + salary + ", dept: " + dept;
    }
}