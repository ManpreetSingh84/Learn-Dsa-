public class BinomialCoefficient03 {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binomialCoefficient(int n, int r) {
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_n_minus_r = factorial(n - r);

        // Correctly calculate the binomial coefficient
        int result = fac_n / (fac_r * fac_n_minus_r);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(binomialCoefficient(55, 2));
    }
}
