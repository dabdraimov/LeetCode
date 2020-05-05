// My solution
class Solution {
    
    public int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap();
        
        for (int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (count.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}


// Best solution
  public int firstUniqChar(String s) {
        int res = Integer.MAX_VALUE;
        
        for(char c = 'a'; c <= 'z'; c++){
            int index = s.indexOf(c);
            
            if(index != -1 && index == s.lastIndexOf(c))
                res = Math.min(res, index);
        }
        
        return res == Integer.MAX_VALUE ? -1 : res;
    }