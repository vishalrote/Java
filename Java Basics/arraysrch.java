import java.util.Scanner;

public class arraysrch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0 ; i<n ; i++){
            num[i] = sc.nextInt();
        }
        

        for (int i = 0 ; i<n ; i++){
            System.out.println(num[i]);
        }
        
        int x = sc.nextInt();
        for(int i = 0 ; i < num.length ; i++){
            if (num[i]==x){
                System.out.println("x found at index : " + i);
        
            }
    
        }
        sc.close();
    }
}
