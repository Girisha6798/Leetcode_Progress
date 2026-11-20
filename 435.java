class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // A2Z Q133
        // here we have to return kitne overlap krte he
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int ct = 0;
        int lastEnd = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] >= lastEnd){
                lastEnd = intervals[i][1]; 
                // agar overlap nhi to lastend update
            } else { // if overlap and then count them 
                ct++;
            }
        }
        return ct++;
    }
}