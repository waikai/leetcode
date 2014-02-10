public class Solution {
    public int search(int[] A, int target) {
        int len = A.length();
        int i = 0;
        while(A[i] < A[i+1]){
            if(i < len -2){
                i++;
            }else{
                break;
            }
        }
        i = i+1;
        if(target < A[0]){
            helper(i+1, len -1, target, A);
        }else if(target = A[0]){
            return 0;
        }else{
            helper(0, i, targer, A);
        }
    }
    public int helper(int start, int end, int target, int[] A){
        int mid =  (start + end)/2;
        if(start > end || start < 0 || end < 0 ) return -1;
        if(A[mid] < target){
            helper(mid +1, end, target, A);
        }else if(A[mid] == target){
            return mid;
        }else{
            helper(0, mid -1, target, A);
        }

}
