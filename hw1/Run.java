package hw1;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("홍길동", 20,178.2,70.0,1,"정보시스템공힉과");
        students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new Student("강동원", 23, 167.0, 45.0, 4, "정보통신학과");
        for(Student student : students){
            System.out.println(student);
        }
        System.out.println("===========================================================================================");

        scanEmployee();

    }
    static void scanEmployee(){
        int count=0;
        Scanner scanner = new Scanner(System.in);
        Employee[] office = new Employee[10];
        while(true){
            System.out.print("이름 : ");
            String name = scanner.next();
            System.out.print("나이 : ");
            int age = scanner.nextInt();
            System.out.print("키 : ");
            double height = scanner.nextDouble();
            System.out.print("몸무계 : ");
            double weight = scanner.nextDouble();
            System.out.print("급여 : ");
            int salary = scanner.nextInt();
            System.out.print("부서 : ");
            String dept = scanner.next();
            office[count] = new Employee(name, age, height, weight, salary, dept);
            count++;

            System.out.print("계속 추가하시겠습니다?(y/n) : ");
            String res = scanner.next();
            if(res.equals("y"))
                continue;
            else{
                int countt = 0;
                System.out.println((count) + "명의 정보를 출력합니다.");
                for(Employee employee : office){
                    System.out.println(employee);
                    countt++;
                    if(countt == count) {
                        System.out.println("프로그램을 종료합니다.");
                        break;

                    }
                }return;

            }
        }
    }
}
