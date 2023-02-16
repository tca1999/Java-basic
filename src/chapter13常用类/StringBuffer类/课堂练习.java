package chapter13常用类.StringBuffer类;

public class 课堂练习 {
    public static void main(String[] args) {
        System.out.println("第一题");
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        System.out.println(stringBuffer.length());//4 是将null装成字符串
        System.out.println(stringBuffer);//null
//        StringBuffer stringBuffer1 = new StringBuffer(str);
//        System.out.println(stringBuffer1);//空指针异常
        System.out.println("第二题");
        String name = "手机";
        String price = "7123456.59";
        StringBuffer sb = new StringBuffer(price);
        int index = sb.indexOf(".");
        for (int i = index - 3; i > 0; i -= 3) {
            sb = sb.insert(i,",");
        }

        System.out.println(sb);
    }
}
