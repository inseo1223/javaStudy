package day3;

public class PeopleMain{
    public static void main(String[] args) {
        People p1 = new People();
        p1.unitPeople("john",20,1);
        People p2 = new People();
        p2.unitPeople("lee",21,2);
        People p3 = new People();
        p3.unitPeople("july",22,3);
        
        People[] peoples = {p1,p2,p3};
        for(People p:peoples){
            p.print();
        }
    }
}