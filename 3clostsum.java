public class Solution {
    public int threeSumClosest(int[] num, int target) {
        int sol = target;
        int min_diff = Integer.MAX_VALUE;
        Arrays.sort(num);
        for(int i = 0; i < num.length; ++i) {
            int low = i + 1;
            int high = num.length - 1;
            while(low < high) {
                int sum = num[i] + num[low] + num[high];
                if(sum == target)
                    return sum;
                else if(sum > target) {
                    int diff = Math.abs(sum - target);
                    if(diff < min_diff) {
                        min_diff = diff;
                        sol = sum;
                    }
                    high--;
                } else { // sum < target
                    int diff = Math.abs(sum - target);
                    if(diff < min_diff) {
                        min_diff = diff;
                        sol = sum;
                    }
                    low++;
                }
            }
        }
        return sol;
    }
}
