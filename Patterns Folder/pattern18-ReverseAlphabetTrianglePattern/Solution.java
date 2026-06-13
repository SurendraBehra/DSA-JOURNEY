import java.util.*;

class Solution {
    public void pattern18(int n) {
        for (int i = 0; i <n; i++) {
            char ch = 'E';
            for (int j = 0; j <=i; j++) {
                System.out.print((char)(ch-i));
                ch++;
            }
           System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution obj = new Solution();
        obj.pattern18(n);

    }
}