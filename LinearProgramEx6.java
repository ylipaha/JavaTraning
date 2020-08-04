public class LinearProgramEx6 {
    public static void main(String[] args) {
        double x = 2;
        double y = 4;

        boolean z = IsPointInsideArea(x, y, true);
        System.out.println(z);

        z = IsPointInsideArea(x, y, false);
        System.out.println(z);
    }

    public static boolean IsPointInsideArea(double x, double y, boolean isBorderIncluded) {
        boolean isInsideArea;

        if (isBorderIncluded) {
            boolean isInFirstRectangle = (x >= -4) && (y >= -3) && (x <= 4) && (y <= 0);
            boolean isInSecondRectangle = (x >= -2) && (y >= 0) && (x <= 2) && (y <= 4);
            isInsideArea = isInFirstRectangle || isInSecondRectangle;
        } else {
            boolean isInFirstRectangle = (x > -4) && (y > -3) && (x < 4) && (y < 0);
            boolean isInSecondRectangle = (x > -2) && (y > 0) && (x < 2) && (y < 4);
            boolean IsOnLine = (x > -2) && (y == 0) && (x < 2);
            isInsideArea = isInFirstRectangle || isInSecondRectangle || IsOnLine;
        }
        return isInsideArea;
    }
}