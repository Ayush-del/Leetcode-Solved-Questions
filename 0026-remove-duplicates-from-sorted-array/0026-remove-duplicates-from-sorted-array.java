class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer>set =new LinkedHashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int j = 0;
        for(int i:set){
            nums[j] = i;
            j++;
        }
        return j;
    }
}