class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String cpdomain : cpdomains){
            String[] parts = cpdomain.split(" ");
            int c = Integer.parseInt(parts[0]);
            String domain = parts[1];
            
            while(true){
                // 1. Add 'c' instead of '1'
                map.put(domain, map.getOrDefault(domain, 0) + c);
                
                // 2. Keep the dot-finding and slicing logic INSIDE the while loop
                int index = domain.indexOf('.');
                if(index == -1){
                    break;
                }
                domain = domain.substring(index + 1);
            }
        }
        
        List<String> res = new ArrayList<>();
        for(String domain : map.keySet()){
            res.add(map.get(domain) + " " + domain);
        }
        return res;
    }
}