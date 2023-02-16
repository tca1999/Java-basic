package chapter05程序控制结构;

public class continue_跳转控制语句 {
    public static void main(String[] args) {
//        continue的基本使用
        int i=1;
        while (i<=4){
            i++;
            if (i==2){
                continue;
            }
            System.out.println(i);//3 4 5
        }
//        continue的细节
        lable1:
        for (int i1 = 0;i1<4;i1++){
            lable2:
            for (int j = 0;j<10;j++){
                if (j==2){
//                    continue lable1;//j=0 1  4次
                    continue lable2;//j=0 1 3 4 5 6 7 8 9
//                    continue;//j=同上

                }
                System.out.println(j);
            }
        }
    }
}
