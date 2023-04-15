import java.util.Scanner;

public class harmonicalNumberfind {
    public static void main (String[] args){
        double result=0.0, i=1;
        int Num;
        Scanner Input=new Scanner(System.in);
        System.out.println("enter a number:");
        Num=Input.nextInt();
        do {
            //Harmonical serial numbers: (1 + 1/2 + 1/3 + .... + 1/n)
            result+=(1/i);
            i++;
        } while (i<=Num);
        System.out.println("result is:" + result);
    }
}
