class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // sort both
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0; 
        int cookie = 0; 

        while(child < g.length && cookie < s.length){
            if(s[cookie] >= g[child]){ // agar satisfy he to child ++
                child += 1;
            }
            cookie += 1; // agr satisfy nhi he s[1] !>= g[1] to s[1] comapres to g[2]
        }
        return child;
    }
}