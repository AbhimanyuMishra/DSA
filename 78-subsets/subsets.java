class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        sub(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    public void sub(int[] nums, int index,
                    List<Integer> curr,
                    List<List<Integer>> ans) {

        // Base case
        if (index == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // Take the current element
        curr.add(nums[index]);
        sub(nums, index + 1, curr, ans);

        // Backtrack: remove the current element
        curr.remove(curr.size() - 1);

        // Don't take the current element
        sub(nums, index + 1, curr, ans);
    }
}