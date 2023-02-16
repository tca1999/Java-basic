package 作业.chapter07面向对象基础;

public class HomeWork03 {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.updatePrice(100.1));
    }
}
class Book{
    public double updatePrice(double price){
        if (price > 150){
            return 150;
        } else if (price > 100) {
            return 100;
        }else {
            return price;
        }
    }
}