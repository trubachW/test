package Modele1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan=new Scanner(System.in);
        System.out.println("Загадай число от 1 до 100");
        int low=1, hight=100, middle, trueNum=100;
        String k,n="n",y="y";

        for (int i=0; i<7; i++) {
            middle= (low+hight)/2;



//            if (i==6){return;};
            System.out.println("это число больше " + middle + "y/n");
            k = scan.nextLine();


            if (k.equals(y)) {
                low = middle;
            } else {
                hight = middle;
                if (middle<trueNum){trueNum=middle;}
            }
            if (i>=4){System.out.println("твое число"+middle+ "y/n");k = scan.nextLine();
                if (k.equals(y)){System.out.println("я угадал");return;}
            }
        }






    }
}
