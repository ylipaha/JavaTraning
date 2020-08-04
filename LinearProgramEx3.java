public class LinearProgramEx3 {
    public static void main(String[] args) {
        double a = getFunctionValue(1, 1);
        System.out.print(a);
    }

    public static double getFunctionValue(double x, double y) {
        double c = Math.cos(x) - Math.sin(y);
        if (c == 0) {
            throw new ArithmeticException("Знаменатель не должен быть равен нулю");
        }
        double a = ((Math.sin(x) + Math.cos(y)) / c * Math.tan(x * y));
        return a;
    }
}

