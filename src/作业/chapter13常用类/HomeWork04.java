package 作业.chapter13常用类;

public class HomeWork04 {
    public static void main(String[] args) {
        countNum("111111111^&%&*%$%^HAHDGAKSDYASDGflasdjfbasdfhasdf");
    }
    public static void countNum(String str){
        char[] chars = str.toCharArray();
        int count1 = 0;
        int count2 = 0;
        int count3= 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 'a' && chars[i] < 'z'){
                count1++;
            }else if (chars[i] > 'A' && chars[i] < 'Z'){
                count2++;
            }else if (chars[i] > '0' && chars[i] < '9'){
                count3++;
            }
        }
        System.out.println("大写字母个数：" + count2 + " 小写字母个数：" + count1 + " 数字字符个数：" + count3);
    }
}
