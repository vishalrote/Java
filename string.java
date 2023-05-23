import java.util.*;

public class string {
     public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
      //   String name = sc.nextLine();
      //   System.out.println("Your Name is : " + name);
      //   sc.close();

        //concatenation
        String fname = sc.nextLine();
        String lname = sc.nextLine();
        String FullName = fname + " " + lname;
        System.out.println(FullName);


        //length
        System.out.println(FullName.length());

         //charAt
         for(int i = 0 ; i < FullName.length() ; i++){
            System.out.println(FullName.charAt(i));
         }

         //compare
         /*
          * s1 > s2 : +ve value
            s1 = s2 : 0
            s1 < s2 : -ve value
          */
         if(fname.compareTo(lname) == 0){
            System.out.println("Strings are equal");
         }
         else{
            System.out.println("Strings are not equal");
         }

         //substring

         String name1 = fname.substring(0,2 );
         System.out.println(name1);

         //Strings are immmutable

        sc.close();

     }
}
