package 作业.chapter13常用类;

import java.util.Arrays;

public class HomeWork01 {
    public static void main(String[] args) {
        String str = "abcdef";
        String reverse = reverse(str, 2, 5);
        System.out.println(reverse);
    }

    public static String reverse(String str, int star, int end) {
        if (!(str != null && star >= 0 && end > star && end < str.length())){
            throw new RuntimeException("参数不正确！");
        }
        StringBuffer stringBuffer = new StringBuffer(str);//将str装成stringbuffer对象
        StringBuffer stringBuffer1 = new StringBuffer();//保存从start开始到end结束的反转
        char[] dist = new char[end - star];//保存start到end的字符串
        stringBuffer.getChars(star,end,dist,0);//取出start到end的字符串
        for (int i = 0; i < dist.length; i++) {
            stringBuffer1.append(dist[dist.length - i- 1]);//添加到心得stringbuffer对象中
        }
        String s = String.valueOf(stringBuffer1);
        stringBuffer.replace(star,end,s);//替换
        return String.valueOf(stringBuffer);
    }
    //老韩讲解
    public static String reverse01(String str,int start,int end){
        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start,j = end;i < j;i++,j--){
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
