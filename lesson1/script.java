import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.print("Привет!");
        byte nums = 2;
        int a = 12345;
        long b = 999999999;
        float num = 5.5f;
        System.out.print(nums);
        System.out.print("\n");
        System.out.print(num);
        char symbol = 'a';
        boolean q = true;
        String g = "\nПривет, братан!=" + q + "\n";
        System.out.print(g);

        Scanner num2 = new Scanner(System.in);
        String i = num2.nextLine();
        //num2.nextInt(), nextDouble
        System.out.print("\n" + i);
    }
}