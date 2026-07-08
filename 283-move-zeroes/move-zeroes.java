class Solution {
    public void moveZeroes(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
               
                nums[a]=nums[i];
                a++;
            }
            
        }
        for(int i =a; i<nums.length;i++){
            nums[i]=0;
        }
       
        
    }
}

// class Solution {
//     public void moveZeroes(int[] nums) {
//         int size=nums.length;
//         List<Integer> list= new ArrayList<>();
//         for(int i= 0;i<nums.length;i++){
//             if(nums[i]!=0){
//                 list.add(nums[i]);
//                 size--;
//             }

//         }
//         for(int i=0;i<size;i++){
//             list.add(0);
//         }
//         for(int i=0;i<nums.length;i++){
//             nums[i]=list.get(i);
//         }
        
//     }
// }

