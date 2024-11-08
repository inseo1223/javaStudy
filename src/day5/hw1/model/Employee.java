package hw1.model;

public class Employee extends Person{
    int salary;
    String dept;
    Employee(){}
    Employee(String name, int age, double height,double weight, int salary, String dept){
        super(age, height, weight);
        this.salary=salary;
        this.dept=dept;
    }
    String toString(){return "name: " + name + ", age: " + age + ", height:" + height +", weight:"+ weight + ", salary:" + salary + ", dept:" + dept;}
}