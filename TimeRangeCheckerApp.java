import java.util.Scanner;

public class TimeRangeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("確認する時間をご入力ください (0–23): ");
        int time = scanner.nextInt();

        System.out.print("開始時間をご入力ください (0–23): ");
        int start = scanner.nextInt();

        System.out.print("終了時間をご入力ください (0–23): ");
        int end = scanner.nextInt();

        if (!TimeRangeChecker.isValidHour(time) ||
            !TimeRangeChecker.isValidHour(start) ||
            !TimeRangeChecker.isValidHour(end)) {
            System.out.println("入力された時間が無効です: " +
                TimeRangeChecker.getMinHour() + " から " + TimeRangeChecker.getMaxHour() + 
                "の間の時間をご入力ください");
        } else {
            boolean result = TimeRangeChecker.isTimeInRange(time, start, end);
            System.out.println("指定した時間の範囲内ですか？ " + result);
        }

        scanner.close();
    }
}