import java.util.*;
class Solution {
    public void pattern5(int n) {
       for (int i = n; i >0; i--) {
        for (int j = 1; j <=i; j++) {
          System.out.print("*");
        }
        System.out.println();
       }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution obj = new Solution();
        obj.pattern5(n);
    }
}