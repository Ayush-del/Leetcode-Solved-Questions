class Solution {
    public int[] productExceptSelf(int[] nums) {
        int temp = 1;
        int temp2 = 1;
        int p = nums.length;
        int [] result = new int[p];
      
        int [] left = new int[p];
        int [] right = new int [p];
        for(int i = 0;i<nums.length;i++){
            left[i] = temp;
            temp = temp * nums[i];
         

            right[p-1-i] = temp2;
            temp2 = temp2 * nums[p-1-i];
       

            
        }
        for(int k = 0;k<nums.length;k++){
               result[k] = right[k] * left[k];
        }
        return result;
       
        
    
    }
}