import java.util.Scanner;

public class userinput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Name ?");
        String name = scanner.nextLine();
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.close();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " Years old");
    }
}
