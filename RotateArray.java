class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int rotate = k%n;
        RotateArray(nums, 0, n-1);
        RotateArray(nums, 0, rotate-1);
        RotateArray(nums, rotate, n-1);
        
    }

    public void RotateArray(int [] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
