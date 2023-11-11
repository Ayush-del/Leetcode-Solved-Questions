// class Solution {
//     public int climbStairs(int n) {
//         if(n == 1){
//             return 1;
//         }
//         if(n == 2){
//             return 2;
        // }
        // Map<Integer,Integer>map = new HashMap<>();
        // int left,right;
        // if(map.containsKey(n-1)){
        //      left = map.get(n-1);
        // }
        // else{
        //         left = climbStairs(n-1);
        //         map.put(n-1,left);
        // }
        // if(map.containsKey(n-2)){
        //      right = map.get(n-2);
        // }
        // else{
        //     right =climbStairs(n-2);
        //     map.put(n-2,right);
        // }
        

        // return left+right;


//         	Map<Integer,Integer> map = new HashMap<>();
		
// 		int left;
// 		if(map.containsKey(n-1)) {
// 			left = map.get(n-1);
// 		}
// 		else {
// 			left = climbStairs(n-1);
// 			map.put(n-1, left);
// 		}
// 		int right;
// 		if(map.containsKey(n-2)) {
// 			right = map.get(n-2);
// 		}
// 		else {
// 			right = climbStairs(n-2);
// 			map.put(n-2,right);
// 		}
		
// 		return left+ right;
//     }
// }

class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairs(n, memo);
    }
    
    private int climbStairs(int n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
        }
        return memo.get(n);
    }
}