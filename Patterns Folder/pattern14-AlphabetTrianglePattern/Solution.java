import java.util.*;

class Solution {
    public void pattern14(int n) {
        for (int i = 0; i < n; i++) {
          for (char ch='A';ch<='A'+i;ch++) {
            System.out.print(ch+" ");
        }  
        System.out.println();
      } 
    }
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();

      Solution obj = new Solution();
      obj.pattern14(n);

  }
}