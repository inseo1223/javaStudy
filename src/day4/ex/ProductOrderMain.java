package day4.ex;
import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String[] args) {
        //ProductOrder p1 = new ProductOrder("두부",2000,2);
        //ProductOrder p2 = new ProductOrder("김치",5000,1);
        //ProductOrder p3 = new ProductOrder("콜라",1500,2);
        ProductOrder[] products = new ProductOrder[3];
        products[0] = creat("두부",2000,2);
        products[1] = creat("김치",5000,1);
        products[2] = creat("콜라",1500,2);
        
        print(products);
        totalprint(products);
        
    }   
        static ProductOrder creat(){
            Scanner sc = new Scanner(System.in);
            ProductOrder p = new ProductOrder();
            System.out.print("상품명 :");
            p.productName = sc.next();
            System.out.print("가격 :");
            p.price = sc.nextInt();
            System.out.print("상품 개수 :");
            p.quantity = sc.nextInt();
            return p;
        }
        static ProductOrder creat(String productName, int price, int quantity){
            ProductOrder p = new ProductOrder();
            p.productName=productName;
            p.price=price;
            p.quantity=quantity;
            return p;
        }
        static void print(ProductOrder[] p){
            for(ProductOrder product: p)
                System.out.println("상품명: "+product.productName+ ", 가격:"+ product.price + ", 수량: "+product.quantity );
        }
        static void totalprint(ProductOrder[] p){
            int totalprice =0;
            for(ProductOrder product: p)
                totalprice +=product.price;

            System.out.println("총 결제 금액: "+totalprice);
        }
}
