class twosum {
    public boolean check(int[] nums) {
        int[] queue = nums.clone();
        for (int i = 0; i < nums.length; i++) {
            int target = 0 - nums[i];
            for (int j = i + 1; j < queue.length; j++) {
                if (queue[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}