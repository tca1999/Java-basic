package 作业.chaptere14集合;


import java.util.ArrayList;
@SuppressWarnings({"all"})
public class HomeWork01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NewsPaper("新闻一：新冠确诊病例超千万，数百万印度信徒赴恒河“圣渔”引民众担心"));
        arrayList.add(new NewsPaper("新闻二：男子突然想起2个月前钓的鱼还在网兜了，捞起来看赶紧放生"));
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            StringBuffer s = new StringBuffer(arrayList.get(i).toString());
            s.replace(15,s.length(),"...");
            System.out.println(s);
        }
    }
}
class NewsPaper{
    private String title;
    private String context;

    public NewsPaper(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return title;
    }
}

