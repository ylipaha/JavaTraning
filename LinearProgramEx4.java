public class LinearProgramEx4 {
    public static void main(String[] args) {
        double R = 123.456;
        double x = swapNumbers_1(R);
        double y = swapNumbers_2(R);
        System.out.println(x);
        System.out.println(y);
    }

    public static double swapNumbers_1(double R) {
        String s = Double.toString(R);
        String x = s.substring(4, 7) + "." + s.substring(0, 3);
        return Double.parseDouble(x);
    }
    public static double swapNumbers_2(double R) {
        double a = (int) R;
        double c = a / 1000;
        double b = R - a;
        double n = b * 1000;
        double y = n + c;
        y = y * 1000;
        int u = (int) Math.round(y);
        y = (double)u / 1000;
        return y;
    }
}

