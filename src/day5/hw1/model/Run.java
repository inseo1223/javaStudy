package hw1.model;

public class Run{
    public static void main(String[] args) {
        Student s1 = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        Student s2 = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        Student s3 = new Student("강동원", 23, 167.0, 45.0, 4, "정보통신공학과");
        Student[] students = {s1, s2, s3};

        for(Student s:students){
            System.out.println(s);
        }

        Employee[] office = new Employee[10];
    }
}