class SumOfMultiples {
    static sumMul(n, m) {
        if (m <= n | m<0 | n < 0) return "INVALID"
        long sum  = n
        long add = n
        while ((add+n) <= m) {
            add += n
            sum += add
        }
        return sum
    }

    static void main(String[] args) {
        assert sumMul(0, 0) == 'INVALID'
        assert sumMul(2, 9) == 20
        assert sumMul(70, 623308) == 627670552
        assert sumMul(4, -7) == 'INVALID'
    }
}