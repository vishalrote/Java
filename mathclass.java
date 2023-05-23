import java.util.Scanner;

public class mathclass {
    public static void main(String[] ars){
        // double x = 3.14;
        // double y = 10;

        // double z = Math.max(x, y);
        // double s = Math.sqrt(y);

        // System.out.println(z);
        // System.out.println(s);
        /*
         * Project on calculating Hypotenuse of a triangle
         */

         double x;
         double y;
         double z;

         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter side x");
         x = scanner.nextDouble();
         System.out.println("Enter side y");
         y = scanner.nextDouble();
        scanner.close();
         z = Math.sqrt((x*x) + (y*y));

         System.out.print("The Hypotenuse is : " + z);




    }
}
