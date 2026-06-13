import java.util.*;

class Solution {
    public void pattern17(int n) {
        for (int i = 0; i <n; i++) {
            // space
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            // characters
            char ch = 'A';
            int breakPoint = (2*i+1)/2;
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print(ch);
                if (j<= breakPoint) ch++;
                else ch--;
            }
            // space
            for (int j = 0; j<n-i-1; j++) {
                System.out.print(" ");
            }
           System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution obj = new Solution();
        obj.pattern17(n);

    }
}