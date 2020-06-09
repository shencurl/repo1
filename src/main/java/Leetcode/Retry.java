package Leetcode;

public class Retry {
    //break retry 跳到retry处，且不再进入循环
    //continue retry 跳到retry处，且再次进入循环
    public static void main(String[] args) {
        int count = 0;
        retry:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                count++;
                if (count == 3) {
                    break retry;
                }
                System.out.print(count + " ");
            }
        }
        continueRetry();
    }

    private static void continueRetry() {
        int i = 0;
        retry:
        for (; ; ) {
            System.out.println("start");
            for (; ; ) {
                i++;
                if (i == 3)
                    continue retry;
                System.out.println("end");
                if (i == 4)
                    break retry;
            }
        }
    }
}
