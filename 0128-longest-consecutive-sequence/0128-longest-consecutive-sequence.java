// class Solution {
//     public int longestConsecutive(int[] nums) {
        // int l = 0;
        // int cl = 0;
        // int n  = arr.length;
        // Arrays.sort(arr);
        // for(int i = 0;i<n-1;i++){
            
        //     if(arr[i] == arr[i+1]-1){
        //         cl++;
        //     }
        //     if(arr[i]!=arr[i+1]-1) {
        //         l = cl;
        //         cl = 0;
        //     }
        //     if(cl>l){
        //         l = cl;
        //     }
        // }
        // return l;


class Solution {
   public int longestConsecutive(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for(int n : nums) {
                set.add(n);
            }
            int best = 0;
            for(int n : set) {
                if(!set.contains(n - 1)) {  // only check for one direction
                    int m = n + 1;
                    while(set.contains(m)) {
                        m++;
                    }
                    best = Math.max(best, m - n);
                }
            }
            return best;
        }
}