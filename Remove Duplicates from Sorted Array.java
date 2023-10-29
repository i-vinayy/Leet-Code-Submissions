import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int count= 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);
                System.out.println("count:"+count);
                System.out.println("i:"+i);
                nums[count++]=i;
                
            }
        }
       
        return count;

        
    }
}
