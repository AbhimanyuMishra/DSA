class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder result=new StringBuilder();
        for( int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                continue;
            }
            if(Character.isUpperCase(ch)){
              ch=Character.toLowerCase(ch);
               
            }
            result.append(ch);
        }
     String ans=result.toString();
    result.reverse();
    String rev= result.toString();
    if(rev.equals(ans)){
        return true;
    }
    return false;
        
    }        
}