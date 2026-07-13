import java.util.*;

class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size()-1; i++) { 
           if(nums.get(i) > nums.get(i+1)){
               return false;
           }
        }
     return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
          nums.add(sc.nextInt());    
        }

        Solution obj = new Solution();
        boolean result = obj.isSorted(nums);
        System.out.println(result);
    }    
}
