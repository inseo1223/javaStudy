package hw1.model;

public class Person {
    protected String name;
    private int age;
    private double height;
    private double weight;
    Person(){ }
    Person(int age, double height, double weight){
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
    String toString(){
        return "name: " + name + ", age: " + age + ", height:" + height +", weight:"+ weight;
    }
}
