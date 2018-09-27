package Modele1;

public class haxmati {
    public static void main(String[] args) {
        char[][] a=new char[8][8];
        for (int i=0; i<8; i++){
            for (int g=0; g<8; g++){
                if (i==1 && g==1){
                    a[i][g]='x';
                }
                System.out.print(" ");
                a[i][g]='x';
                System.out.print(a[i][g]);

            }
            System.out.println();
        }

    }
}
