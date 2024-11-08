package day3;

public class People {
    String name;
    int age;
    int grade;

    public void unitPeople(String name, int age, int grade){
        this.name =name;
        this.age=age;
        this.grade=grade;
    }
    

    public void print(){
        System.out.println("이름: "+ name + ", 나이: "+ age + ", 학년: "+grade);
    }
}
