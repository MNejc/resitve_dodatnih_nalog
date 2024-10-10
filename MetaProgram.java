import java.util.Scanner;
// import java.util.Vector;

public class MetaProgram {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        
        int n = ns.nextInt();

        System.out.println("public class Nizi {\n    public static void main(String[] args) {");

        for (int i = 1; i <= n; i++) {
            System.out.print("    ");
            for (int p = 1; p <= i; p++) {
                System.out.print("    ");
            }
            System.out.println("for (char c" + i + " = \'A\'; c" + i + " <= \'Z\';  c" + i + "++) {");
        }

        for (int p = 0; p <= n+1; p++)
            System.out.print("    ");
        System.out.print("System.out.println(\"\"");

        for (int i = 1; i <= n; i++) {
            System.out.print(" + c" + i);
        }
        System.out.println(");");

        for (int i = n; i > 0; i--) {
            System.out.print("    ");
            for (int p = 1; p <= i; p++) {
                System.out.print("    ");
            }
            System.out.println("}");
        }
        System.out.println("    }\n}");
    }
}

