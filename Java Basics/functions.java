import java.util.Scanner;

public class functions {
    public static void PrintMyName(String name){
        System.out.println(name);
        return;
    }

public static int SumOfTwoNumbers(int a , int b){
    int sum = a + b;
    return sum;
}

public static int productOfTwoNumbers(int a , int b){
    int pro = a * b;
    return pro;
}

public static int Factorial(int a){
    return a*(a-1);
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("a : ");
        int a = sc.nextInt();
        System.out.println("b : ");
        int b = sc.nextInt();
        sc.close();

        System.out.print("The Name Given is ");
        PrintMyName(name);
        int sum = SumOfTwoNumbers(a, b);
        System.out.print(sum);

        System.out.println("Product of two numbers is : " + productOfTwoNumbers(a, b) );
        System.out.print(Factorial(a));
    }
}
