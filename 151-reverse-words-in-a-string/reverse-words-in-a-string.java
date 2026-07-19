// class Solution {
//     public String reverseWords(String s) {
        
//         String[] words = s.trim().split("\\s+");
//         for(int i=0;i<words.lenght/2;i++){
//            String t= words[i];
//             words[i]=words[words.length-1-i];
//             words[words.length-1-i]=t;
//         }
//         String res=String.join(" ",words);
//         return res;
//     }
// }
class Solution {
    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");

        for (int i = 0; i < words.length / 2; i++) {

            String temp = words[i];

            words[i] = words[words.length - 1 - i];

            words[words.length - 1 - i] = temp;
        }

        return String.join(" ", words);
    }
}