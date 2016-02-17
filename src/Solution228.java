import java.util.ArrayList;
import java.util.List;

/*
 * Given a sorted integer array without duplicates, return the summary of its ranges.
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 * 
 */
public class Solution228 {
    public static void main(String[] args) {
        int[] input = { 0, 1, 3 };

        List<String> result = summaryRanges(input);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> rangeList = new ArrayList<>();

        int numsLength = nums.length;

        if (numsLength == 1) {
            String range = "" + nums[0];
            rangeList.add(range);
        }
        else if (numsLength >= 2) {
            int rangeStart = nums[0];
            int rangeEnd = nums[0];
            int curr = nums[0];
            int prev = nums[0];

            String range = "";

            for (int i = 1; i < numsLength; i++) {
                prev = curr;
                curr = nums[i];
                rangeEnd = prev;

                if (prev + 1 != curr) {
                    if (rangeStart == rangeEnd) {
                        range = rangeStart + "";
                        rangeList.add(range);
                    }
                    else {
                        range = rangeStart + "->" + rangeEnd;
                        rangeList.add(range);
                    }
                    rangeStart = curr;
                }

                if (i == numsLength - 1) {
                    if (rangeStart == curr) {
                        range = rangeStart + "";
                        rangeList.add(range);
                    }
                    else {
                        range = rangeStart + "->" + curr;
                        rangeList.add(range);
                    }
                }
            }
        }

        return rangeList;
    }
}