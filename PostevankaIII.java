import java.util.Scanner;
// import java.util.Vector;

public class PostevankaIII {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int a = ns.nextInt(), b = ns.nextInt();

        int i = 1;
        while (i*a <= b) {
            System.out.println(a + " * " + i + " = " + (a*i));
            i++;
        }
    }
}

