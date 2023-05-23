import java.util.*;
public class loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        for( int j = 0 ; j < 11 ; j++){
            System.out.println(j*x);
        }
        

        for(int i = 0 ; i < 10 ; i++ ){
            System.out.println(i);
        }
    }
}
