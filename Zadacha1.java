package llab5;

public class Zadacha1 {
        public static int recursion(int n) {
        int N=n;
        if (N==1) {
            return 1;
        }
        while (N!=0) {
            System.out.print(n + ",");
            N=N-1;
        }
        return recursion((n-1));
        }
        public static void main(String[] args) {
            System.out.print(recursion(8));
        }
}
