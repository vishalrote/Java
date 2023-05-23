import java.util.Scanner;

public class bitmanupulation {
    public static void main(String[] args){

        //GetBit : Shifting(Bitmask) and AND operation
        int n =5;
        int pos = 2;
        int bitmask = 1<<pos;
        System.out.println(bitmask);

        if((bitmask & n)==0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }


        //setbit : shifting and OR 
        int newnumber = bitmask | n;
        System.out.println(newnumber);

        //clearbit : shifting and AND with NOT(~n)
        int notbitmask = ~(bitmask);
        int newnumber1 = notbitmask & n;
        System.out.println(newnumber1);

        //updatebit : for 0 (clearbit) => shift and AND with NOT
        //            for 1 (setbit) => shift and OR
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        sc.close();

        if (oper == 1){
            //setbit
            int newnumber2 = bitmask | n;
            System.out.println(newnumber2);

        }
        else{
            //clearbit
            int notbitmask1 = ~(bitmask);
            int newnumber2 = notbitmask1 & n;
            System.out.println(newnumber2);
        }

    }
}
