
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        int mid = l + (r - l)  / 2 ;
        int answer = 1;
        
        while (l < r) {
            mid = l + (r - l) / 2;
            
            if (isBadVersion(mid)) {
                r = mid;
                answer = mid;
                
            } else {
                l = mid + 1;
                answer = r;
            }
        }
        
        return answer;
    }

    public static void main(String args[]) {
        Day1 day1 = new Day1();
        System.out.println("Hello");
        System.out.println(day1.firstBadVersion(7));
    }
}

class VersionControl {

    public boolean isBadVersion(int x) {
        return true;
    }
}
