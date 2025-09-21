public class TimeRangeChecker {

    // ある時刻(0時～23時)が、指定した時間の範囲内に含まれるかどうかを調べる
    public boolean isTimeInRange(int time, int start, int end) {
        if (start == end) {
            return true;
        } else if (start < end) {
            return time >= start && time < end;
        } else {
            return time >= start || time < end;
        }
    }

}