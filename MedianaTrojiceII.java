import java.util.Scanner;
// import java.util.Vector;

public class MedianaTrojice {
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int maks(int a, int b) {
        return (a > b) ? a : b;
    }
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        int a = ns.nextInt();
        int b = ns.nextInt();
        int c = ns.nextInt();

        System.out.println(a+b+c - min(a,min(b,c)) - maks(a,maks(b,c)));
    }
}

