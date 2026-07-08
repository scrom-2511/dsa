// https://leetcode.com/problems/powx-n/
// https://takeuforward.org/data-structure/implement-powxn-x-raised-to-the-power-n/

class Solution {
    public static double myPow(double x, int n) {
        long exponent = n;

        if (exponent < 0) {
            exponent = -exponent;
            return 1 / fastPow(x, exponent);
        }

        return fastPow(x, n);
    }

    private static double fastPow(double x, long n) {
        if (n == 0)
            return 1;

        double half = fastPow(x, n / 2);

        if (n % 2 == 0)
            return half * half;

        return x * half * half;
    }
}
