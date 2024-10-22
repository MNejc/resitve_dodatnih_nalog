import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class ZlataSredina {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        

        int k = ns.nextInt();
        Vector<Integer> v = new Vector<Integer>(k*2+1);

        for (int i = 0; i < k*2+1; i++) {
            v.add(ns.nextInt());
        }

        Collections.sort(v);

        System.out.println(v.get(k));
    }
}

