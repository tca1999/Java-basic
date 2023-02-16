package chapter13常用类.Arrys类;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class 课堂练习 {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("金瓶梅",90);
        books[2] = new Book("强捻文摘",5);
        books[3] = new Book("java",300);
//        sort01(books);
//        sort02(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Double i1 = (Double)o1;
//                Double i2 = (Double)o2;
//                return (int) (i2 - i1);
//            }
//        });
        sort03(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(books));
    }
    public static void sort03(Book[] books,Comparator c){
        Book book;
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (c.compare(books[j].getName().length(),books[j+1].getName().length()) > 0){
                    book = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = book;
                }
            }
        }
    }
    public static void sort02(Book[] books, Comparator c){
        Book book;
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (c.compare(books[j].getPrice(),books[j+1].getPrice()) > 0){
                    book = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = book;
                }
            }
        }
    }
    public static void sort01(Book[] books){
        Book book;
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (books[j].getPrice() > books[j + 1].getPrice()){
                    book = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = book;
                }
            }
        }
    }
}
class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}