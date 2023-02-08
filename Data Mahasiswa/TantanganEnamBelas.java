import java.util.Arrays;
class TantanganEnamBelas {
    public static int max_Subarray_Sum_Circular(int[] nums) {
        int n = nums.length;
        int result = nums[0];
        int sum = nums[0];
        for (int i = 1; i < n; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            result = Math.max(result, sum);
        }
        
        int[] right_Sum = new int[n];
        int[] right_Max = new int[n];
        right_Sum[n - 1] = nums[n - 1];
        right_Max[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_Sum[i] = right_Sum[i + 1] + nums[i];
            right_Max[i] = Math.max(right_Sum[i], right_Max[i + 1]);
        }
        
        int left_Sum = 0;
        for (int i = 0; i < n - 2; i++) {
            left_Sum += nums[i];
            result = Math.max(result, left_Sum + right_Max[i + 2]);
        }
        
        return result;
    }
	
	public static void main(String[] args)
	{
		int[] nums1 = { 2, 1, -5, 4, -3, 1, -3, 4, -1 };
		System.out.println("\nOriginal circular array: "+Arrays.toString(nums1));
		System.out.println("The sum of subarray with the largest sum is " + max_Subarray_Sum_Circular(nums1));
		
		int[] nums2 = { 1, -2, 3, 0, 7, 8, 1, 2, -3 };
		System.out.println("\nOriginal circular array: "+Arrays.toString(nums2));
		System.out.println("The sum of subarray with the largest sum is " + max_Subarray_Sum_Circular(nums2));
	}
}