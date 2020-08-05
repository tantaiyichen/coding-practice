package com.destiny;

import java.util.Scanner;

/**
 * @Author: Caiqin
 * @Date: 2020/8/5 10:09
 * @Description: 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
public class Practice05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("请输入月数：");
        int otherMonth,month = scanner.nextInt();
        System.out.println("==================");
        int firstMonth = 1,secondMonth = 1;
        System.out.println("第1个月的兔子对数："+firstMonth);
        System.out.println("第2个月的兔子对数："+secondMonth);
        for (int i=3;i<=month;i++){
            otherMonth=secondMonth;
            secondMonth=firstMonth+secondMonth;
            firstMonth=otherMonth;
            System.out.println("第"+i+"个月的兔子对数："+secondMonth);
        }
    }
}
