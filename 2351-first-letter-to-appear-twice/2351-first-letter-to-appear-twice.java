class Solution {
    public char repeatedCharacter(String s) {
//         if(s.length()>=2 && s.length()<=100){
//         for(int i = 0;i<s.length();i++){
           
//             if(s.charAt(i) == s.charAt(i+1)){
//                 return s.charAt(i);
//             }
//         }
        
//     }
//     return '0';
    Set<Character> st=new HashSet<>();      
    
    st.add(s.charAt(0));       
    for(int i=1;i<s.length();i++){
        
        if(st.contains(s.charAt(i))) return s.charAt(i);         
        else st.add(s.charAt(i));
    }
    return '0';
}
}