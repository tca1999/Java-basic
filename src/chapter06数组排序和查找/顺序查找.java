package chapter06数组排序和查找;

import java.util.Scanner;

public class 顺序查找 {
    public static void main(String[] args) {
//有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏：从键盘中任意输入一个名称，判断数列中是否
//包含此名称【顺序查找】 要求: 如果找到了，就提示找到，并给出下标值。
        String[] strs={"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个名称：");
        String str=sc.next();
        for (int i=0;i<strs.length;i++){
            if (strs[i].equals(str)){
                System.out.println("找到了！下标值为："+i);
                break;
            }
        }
    }
}
