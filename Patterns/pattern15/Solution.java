import java.util.*;

class Solution {
    public void pattern15(int n) {
        for (int i = n; i >= 0; i--) {
          for (char ch= 'A';ch<'A'+i;ch++) {
            System.out.print(ch+" ");
        }  
        System.out.println();
      } 
    }
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();

      Solution obj = new Solution();
      obj.pattern15(n);

  }
}