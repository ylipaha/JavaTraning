import java.util.concurrent.TimeUnit;

public class LinearProgramEx5 {
    public static void main(String[] args) {
        long seconds = 93;
        System.out.println(getFormattedString(seconds));
    }

    public static String getFormattedString(long seconds) {
        long ms = TimeUnit.SECONDS.toMillis(seconds);
        long hour = seconds / 3600,
                min = seconds / 60 % 60,
                sec = seconds / 1 % 60;
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }
}


