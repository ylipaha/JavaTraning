public class LinearProgramEx2 {
    public static void main(String[] args) {
        double x = getFunctionValue(0, 3, 2);
        System.out.print(x);
    }

    public static double getFunctionValue(double a, double b, double c) {
        if (a == 0) {
            throw new ArithmeticException("Значение а должно быть !=0, a = " + a );
        }
        if (b == 0) {
            throw new ArithmeticException("Значение b должно быть !=0, b = " + b );
        }
        double z = (b * b) + 4 * a * c;
        if (z < 0) {
            throw new ArithmeticException("Подкоренное выражение <0, z = " + z );
        } else {
            return (b + Math.sqrt(z)) / (2 * a) - a * a * a * c + (1 / (b * b));
        }
    }
}