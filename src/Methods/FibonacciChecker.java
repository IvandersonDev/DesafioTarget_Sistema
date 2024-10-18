package Methods;

public class FibonacciChecker {

    public boolean isFibonacci(int n) {
        int a = 0, b = 1;
        while (b <= n) {
            if (b == n || a == n) {
                return true;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        return false;
    }
}

