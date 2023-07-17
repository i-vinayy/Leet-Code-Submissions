class Solution {
    public void moveZeroes(int[] arr) {

        int start = 0;
        int n = arr.length;
        int end = 0;

while(end<n){

    if(arr[end]!=0){

    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end++;

    }
    else{
        end++;
    }
   

}

      
    }
}
