import java.util.*;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        if (age > 18) {
            System.out.print("Adult");
        } else {
            System.out.print("Not Adult");
        }
    }
}
