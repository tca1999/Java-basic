package chapter14集合.Collection.List;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings({"all"})
public class 课堂练习02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book1("红楼梦","曹雪芹",100));
        list.add(new Book1("西游记","吴承恩",10));
        list.add(new Book1("水浒传","施耐庵",9));
        list.add(new Book1("三国演绎","罗贯中",80));
        list.add(new Book1("西游记","吴承恩",10));
        bull(list);
        for (Object o : list) {
            System.out.println(o);
        }
    }
    public static void bull(List list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1- i; j++) {
                Book1 book = (Book1) list.get(j);
                Book1 book1 = (Book1)list.get(j + 1);
                if (book.getPrice() > book1.getPrice()){
                    list.set(j,book1);
                    list.set(j+1,book);
                }
            }
        }
    }
}
class Book1{
    String name;
    String author;
    double price;

    public Book1(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "名称：'" + name + '\'' +
                ", 价格：'" + price + '\'' +
                ", 作者：" + author;
    }
}