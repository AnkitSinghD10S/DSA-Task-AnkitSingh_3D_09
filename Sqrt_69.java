public class Sqrt_69 {
    public int mySqrt(int x) {
        long ans = 0;
        long start = 0;
        long end = x;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;
            if (square == x) {
                ans = (int) mid;
                break;
            } else if (square > x)
                end = mid - 1;
            else {
                start = mid + 1;
                ans = mid;
            }
        }
        return (int) ans;
    }
}
