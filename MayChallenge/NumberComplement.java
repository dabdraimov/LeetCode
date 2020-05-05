// My Solution

class Solution {
    public int findComplement(int num) {
        int bits[] = new int[100];
        int reverse[] = new int[100];
        
        int i = 0;
        while (num > 0) {
            bits[i++] = num % 2;
            num = num / 2;
        }
        
        int l = 0;
        for (int j = i - 1; j >= 0; j--) {
            reverse[l++] = (1 - bits[j]);
        }
        int start = 0;
        while (reverse[start] == 0 && start < l) start++;
        
        int result = 0;
        int pw = 1;
        for (int j = l - 1; j >= start; j--) {
            result = result +  pw * reverse[j];
            pw = pw * 2;
        }
        return result;
    }
}

// Best solution 

class Solution {
    public int findComplement(int num) {
        int sum = 1;
        
        while(sum < num) {
            sum = (sum << 1) + 1;
        }
        
        return sum - num;
    }
}

