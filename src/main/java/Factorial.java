public class Factorial {

    public static Long Factorial(int x) {

        if (x == 0) {
            return 1L;
        }
        return x * Factorial(x-1);
    }

}
