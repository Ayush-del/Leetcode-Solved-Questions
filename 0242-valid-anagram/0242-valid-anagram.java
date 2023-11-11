class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()){
        //     return false;
        // }
       
        // Map<Character,Integer> map = new HashMap<>();
        // for(int i = 0;i<s.length();i++){
        //      int temp = map.getOrDefault(map,0);
        //      temp++;
        //      map.put(s.charAt(i),temp);
            
        // }
        // for(int j =0;j<t.length();j++){
        //     if(map.get(t.charAt(j)) != null && map.get(t.charAt(j))>0){
        //         int temp = map.get(t.charAt(j));
        //         map.put(t.charAt(j),temp-1);
        //     }
        //     else{
        //         return false;
        //     }
            
        // }
        // return false;
        

        s = s.toLowerCase();
        t = t.toLowerCase();

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            return true;
        }
        return false;

    }
}