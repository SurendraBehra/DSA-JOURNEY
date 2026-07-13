import java.util.Scanner;
class Solution {
    public int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > largest){
               secondLargest =largest;
               largest = nums[i];
            }
            else if(nums[i]>secondLargest && nums[i]!=largest){
                secondLargest =nums[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int result = obj.secondLargestElement(nums);
        System.out.println(result);
    }
}