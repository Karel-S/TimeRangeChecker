public class TimeRangeChecker {

    private static final int MIN_HOUR = 0;
    private static final int MAX_HOUR = 23;

    // ある時刻(0時～23時)が、指定した時間の範囲内に含まれるかどうかを調べる
    public static boolean isTimeInRange(int time, int start, int end) {
        if (start == end) {
            return true;
        } else if (start < end) {
            return time >= start && time < end;
        } else {
            return time >= start || time < end;
        }
    }

    // 時間が範囲内にあることを確認
    public static boolean isValidHour(int hour) {
        return hour >= MIN_HOUR && hour <= MAX_HOUR;
    }

    public static int getMinHour() {
        return MIN_HOUR;
    }

    public static int getMaxHour() {
        return MAX_HOUR;
    }

}