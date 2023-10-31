public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int element : nums) {
            if (element != val) {
                nums[i] = element;
                ++i;
            }
        }

        return i + 1;
    }
