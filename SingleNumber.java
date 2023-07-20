import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
			
			
			int key = nums[i];
			Integer value = map.get(key);
			
			
			if(value!=null) {
				map.put(key, value+1);
			}else {
				map.put(key, 1);
			}
			
			
		}
        for(java.util.Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()==1) {
				return entry.getKey();
			}
        }

        return 1;
    }
}
