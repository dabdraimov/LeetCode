class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean used[] = new boolean[magazine.length()];
        
        for (Character ch : ransomNote.toCharArray()) {
            boolean found = false;
            for (int i = 0; i < magazine.length(); i++) {
                if (!used[i] && ch == magazine.charAt(i)) {
                    used[i] = true;
                    found = true;
                    break;
                }
            }
            
            if (!found) return false;
        }
        
        return true;
    }
}