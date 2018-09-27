package Modele1;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class numbers {

    public static void main(String[] args) {
        int answ = new Random().nextInt(10);
        Scanner sc=new Scanner(System.in);
        boolean bo=true;
        while (bo){
            System.out.println("введите число");

            String s=sc.nextLine();
            if (s.length()<=10){
               int ch= Integer.parseInt(s);
               if (ch==answ){
                   System.out.println("программа загадало это число");
               }else if(ch>answ){
                   System.out.println("число больше загаданого");
               }else{
                   System.out.println("число меньше загадоного");
               }

            }else {
                System.out.println("вы вышли за придел");
            }
        }


        System.out.print(answ);
    }
}
