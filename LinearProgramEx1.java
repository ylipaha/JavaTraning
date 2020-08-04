public class LinearProgramEx1 {
    public static void main(String[] args) {
        double z = getFunctionValue(14.2, 4.6, 1.7);
        System.out.println(z);
        double y = getFunctionValue(14.4, 7.6, 6.7);
        System.out.println(y);
        double x = getFunctionValue(1.2, 21.6, 5.7);
        System.out.println(x);
    }

    public static double getFunctionValue(double a, double b, double c) {
        double z = ((a - 3) * b / 2) + c;
        return z;
    }
}

