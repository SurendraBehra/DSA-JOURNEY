import java.util.Scanner;
class Solution {
    public int largestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > largest){
               largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int result = obj.largestElement(nums);
        System.out.println(result);
    }
}