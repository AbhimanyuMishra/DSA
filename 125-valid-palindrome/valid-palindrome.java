// class Solution {
//     public boolean isPalindrome(String s) {
//         StringBuilder result=new StringBuilder();
//         for( int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(!Character.isLetterOrDigit(ch)){
//                 continue;
//             }
//             ch=Character.toLowerCase(ch);
//             result.append(ch);
//         }
//      String ans=result.toString();
//     result.reverse();
//     String rev= result.toString();
    
//     return rev.equals(ans);
        
//     }        
// }

class Solution {
    public boolean isPalindrome(String s) {
       int left=0;
       int right=s.length()-1;
       while(left<right){
        if(!Character.isLetterOrDigit(s.charAt(left))){
            left++;
            continue;
        }
        if(!Character.isLetterOrDigit(s.charAt(right))){
            right--;
            continue;
        }
        char l=Character.toLowerCase(s.charAt(left));
        char r=Character.toLowerCase(s.charAt(right));
        if(l!=r){
            return false;
        }
        left++;
        right--;
       }
     
      return true;  
    }        
}