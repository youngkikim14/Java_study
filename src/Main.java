import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        for (int i = 1; i < n+1; i++) {
            result += "*";
            System.out.println(result);
        }

        System.out.println(n);
    }
}

