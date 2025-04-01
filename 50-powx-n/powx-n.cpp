class Solution {
public:
      double myPow(double x, int n) {
        if (n == 0) return 1;  // Base case
        if (n < 0) {
            x = 1 / x;         // Convert negative exponent
            if (n == INT_MIN) { // Handle edge case (overflow)
                return x * myPow(x, -(n + 1));
            }
            n = -n;
        }
        
        double half = myPow(x, n / 2);
        return (n % 2 == 0) ? half * half : half * half * x;
    }
};
