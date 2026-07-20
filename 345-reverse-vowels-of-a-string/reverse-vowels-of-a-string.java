class Solution {
    public String reverseVowels(String s) {
        String vowel= "aeiouAEIOU";
         char[] arr=s.toCharArray();
        int left=0;
        int right =s.length()-1;
    while(left<right){
        char l=arr[left];
        char r=arr[right];
        if(vowel.indexOf(l)==-1){
            left++;
            continue;
        }
        if(vowel.indexOf(r)==-1){
            right--;
            continue;
        }
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        left++;
        right--;
    }
        return new String(arr);
    }
}