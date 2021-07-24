import java.util.Scanner;

public class BirthdayCakeCandleManager {
    public int birthdayCakeCandles(int[] candles){
        int tallestCandle = Integer.MIN_VALUE;
        int numberOfTallestCandles = 0;
        for (int candle : candles) {
            if (candle > tallestCandle) {
                tallestCandle = candle;
                numberOfTallestCandles = 1;
            } else if (candle == tallestCandle) {
                numberOfTallestCandles++;
            }
        }
        return numberOfTallestCandles;
    }

    public static void main(String[] args) {
        System.out.println("Enter the total number of candles:");
        final Scanner scanner = new Scanner(System.in);
        final int numberOfCandles = scanner.nextInt();
        int[] candles = new int[numberOfCandles];
        System.out.println("Enter the heights of the candles, space-separated:");
        for (int i = 0; i < candles.length; i++) {
            candles[i] = scanner.nextInt();
        }
        System.out.println(new BirthdayCakeCandleManager().birthdayCakeCandles(candles));
        scanner.close();
    }
}