class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = 0;
        for(int num:nums){
            if(!set.contains(num-1)){
                int count = 0;
                int temp = num;
                while(set.contains(temp)){
                    count++;
                    set.remove(temp);
                    temp++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
