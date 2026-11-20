
import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> ans = new ArrayList<>();

        int i = 0;
        int n = intervals.length; // n is total no of intervals

        // Step 1: Add intervals before newInterval 

        // Intervals[i][1] : end 
        // Intervals[i][0] : start
        
        // ending pt of interval < then start of new the add 
        while(i < n && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i]);
            i++;
        }

        // yaha tak sb left wale added
        // Step 2: Merge overlapping intervals
        while(i < n && intervals[i][0] <= newInterval[1]) {
            // eg:
            // interval = [3,8]
            // newInterval = [6,7]; if start of int <= end of newInterval then overlap

            // start of newInterval will be min from start of all overlapping interval
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);

            // start of newInterval will be max from start of all overlapping interval
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);

            i++;
        }
        
        // Add merged newInterval
        ans.add(newInterval);

        // Step 3: Add remaining intervals(right ones)
        while(i < n) {
            ans.add(intervals[i]);
            i++;
        }

        // method return type is array but ans is ArrayList 
        return ans.toArray(new int[ans.size()][2]); // ans.size means jitne interval he 
        // 2 is col(start and end)  
        // no need to write 2 :
        //toArray() khud ArrayList ke existing intervals ko copy kar leta ha
    }
}
