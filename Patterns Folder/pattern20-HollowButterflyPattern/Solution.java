import java.util.Scanner;

class Solution {
    public void pattern7(int n) {
      for (int i=0;i<n;i++) {
        //stars
        for (int j = 0; j <=i; j++) {
            System.out.print("*");
        }
        //space
         for (int s = 2; s <2*(n-i); s++) {
            System.out.print(" ");
         }
         //stars
        for (int j = 0; j <=i; j++) {
            System.out.print("*");
        }
        System.out.println();
      }

       for (int i=n-2;i>=0;i--) {
        //stars
        for (int j = 0; j <=i; j++) {
            System.out.print("*");
        }
        //space
         for (int s = 2; s <2*(n-i); s++) {
            System.out.print(" ");
         }
         //stars
        for (int j = 0; j <=i; j++) {
            System.out.print("*");
        }
        System.out.println();
      }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution obj = new Solution();
        obj.pattern7(n);
    }
}