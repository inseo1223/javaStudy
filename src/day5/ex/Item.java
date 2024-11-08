package day5.ex;

public class Item {
    private String name;
    private int price;
    Item(String name, int price){
        this.name =  name;
        this.price = price;
    }
    int getPrice(){
        return price;
    }
    void print(){
        System.out.println("이름: " +name+ ", 가격: " + price);
    }
}

class Book extends Item{
    private String author;
    private String number;
    Book(String name, int price, String author, String number){
        super(name, price);
        this.author = author;
        this.number=number;
    }
    @Override
    void print(){
        super.print();
        System.out.println("- 저자: " +author+ ", 넘버: " + number);
    }
    
}
class Album extends Item{
    private String author;
    Album(String name, int price, String author){
        super(name, price);
        this.author = author;
    }
    @Override
    void print(){
        super.print();
        System.out.println("- 아티스트: " +author);
    }
    
}
class Movie extends Item{
    private String supervision;
    private String actor;
    Movie(String name, int price, String supervision, String actor){
        super(name, price);
        this.supervision = supervision;
        this.actor = actor;
    }
    @Override
    void print(){
        super.print();
        System.out.println("- 감독: " +supervision + ", 배우: "+ actor);
    }
}