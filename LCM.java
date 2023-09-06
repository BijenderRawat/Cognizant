class LCM {
    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public long solve(int A, int B) {
        return (long) A * B / gcd(A, B);
    }
}
