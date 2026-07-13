import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n-1; i >0; i--) {
            //spcae
            for (int s = 0; s <n-i; s++) {
                System.out.print(" ");
            }
            int num =6;
            for (int j = 0; j <=i; j++) {
                System.out.print(num-i+" ");
                num++;
            }
            System.out.println();
        }

        for (int i = 0; i <n; i++) {
            //spcae
            for (int s = 0; s<n-i;s++) {
                System.out.print(" ");
            }
            int num =6;
            for (int j = 0; j <=i; j++) {
                System.out.print(num-i+" ");
                num++;
            }
            System.out.println();
        }

    }
}
