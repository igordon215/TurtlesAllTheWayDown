public class GCD {

    public static Long getGCD1(Long x, Long y) {

        if (y == 0) {
            return x;
        }
        return getGCD1(y, x % y);

    }

    public static Long getGCD2(Long x, Long y) {

        Long counter = 0L;
        if (y == 0) {
            return x;
        }

        for (int i = 1; i <= x; i++) {

            if ((x % i == 0) && (y % i == 0)) {

                counter++;
            }
        }

        return counter;
    }

}
