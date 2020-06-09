package Leetcode;

public class 切绳子 {
        public int cuttingRope(int n) {
            //看余数，如果余数为0那么全3米，如果为1有两段要2米，如果为2有一段要2米
            if(n <= 3) return n - 1;
            int a = n / 3, b = n % 3;
            if(b == 0) return (int)Math.pow(3, a);
            if(b == 1) return (int)Math.pow(3, a - 1) * 4;
            return (int)Math.pow(3, a) * 2;
        }
}
