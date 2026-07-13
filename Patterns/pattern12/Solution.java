import java.util.*;

class Solution {
    public void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++) {
            System.out.print(j);
          }
          //space
          for(int s=1;s<2*n-(2*i-1);s++){
            System.out.print(" ");
          }
          //numbers
          for (int j = i; j >= 1; j--) {
            System.out.print(j);
          }
          System.out.println();
        }  
        
    }
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();

      Solution obj = new Solution();
      obj.pattern12(n);

  }
}