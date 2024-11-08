package hw1.model;

public class Student extends Person{
    private int grade;
    private String major;
    Student(){}
    Student(String name, int age, double height, double weight, int grade, String major){
        super(age, height, weight);
        super.name=name;
        this.grade=grade;
        this.major=major;
    }
    String toString(){
        return toString() + ", grade:" + grade + ", major:" + major;
    }
}
