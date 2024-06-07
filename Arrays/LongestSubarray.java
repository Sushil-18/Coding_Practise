import java.util.*;

public class LongestSubarray {

    public int longestSubarray(List<Integer> arr, int num) {
        // int len = arr.size();
        // int i = 0, j = 0;
        // int count = arr.get(i), max = 0;

        // while (j < len - 1) {
        //     if (count == num) {
        //         max = Math.max(max, j - i + 1);
        //     }
        //     if (count < num) {
        //         j++;
        //         count = count + arr.get(j);
        //     } else {
        //         i++;
        //         count = count - arr.get(i);
        //     }
        // }
        // return max;
        //
        int n = arr.size() - 1;
        int left = 0, right = 0; // 2 pointers
        long sum = arr.get(left);
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > num) {
                sum -= arr.get(left);
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == num) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += arr.get(right);
        }

        return maxLen;
    }

    public static void main(String args[]) {
        LongestSubarray obj = new LongestSubarray();

        List<Integer> list = new ArrayList<Integer>();
        int num = 5;

        list.add(2);
        list.add(3);
        list.add(5);
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(1);

        System.out.println(obj.longestSubarray(list, num));
    }
}
