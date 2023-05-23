import java.util.*;

public class switchs {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        switch (num) {
            case 1:
                System.out.print("1 is pressed");
                break;

            case 2:
                System.out.print("2 is pressed");
                break;
        }
    }
}
