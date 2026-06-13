import java.util.Scanner;

class Solution {
    public void pattern21(int n) {
      for (int i=0;i<n;i++) {
         for(int j=0;j<n;j++){
          char ch = (i==0|| j==0 || i==n-1 ||j==n-1) ? '*' : ' ';
          System.out.print(ch);
         }
        System.out.println();
      } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution obj = new Solution();
        obj.pattern21(n);
    }
}