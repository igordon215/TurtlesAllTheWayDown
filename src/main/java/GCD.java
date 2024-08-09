public class GCD {

    public static Long getGCD(Long x, Long y) {

        if (y == 0) {
            return x;
        }
        return getGCD(y, x % y);

    }
}
