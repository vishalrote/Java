public class recursion {
    public static void printnum(int n) {
        if (n == 5) {
            return;
        }
        System.out.println(n);
        printnum(n + 1);
    }

    public static void sumofnum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;

        }

        sum += i;
        sumofnum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        // int n = 5;
        // printnum(n);
        sumofnum(1, 5, 0);
    }
}
