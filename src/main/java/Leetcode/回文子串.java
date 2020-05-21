package Leetcode;

public class 回文子串 {
    public int countSubstrings(String s) {
        int count=0;
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                if (palindrome(s.substring(i,j+1)))count++;
            }
        }
        return count;
    }
    private boolean palindrome(String s){
        int i=0,j=s.length()-1;
        while (i<j){
            if (s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else return false;
        }
        return true;
    }
}
//    public int countSubstrings(String s) {
//        //使用中心扩展法
//        //如果回文子串长度为奇数, 则其中心分别为s[0], s[1], ... s[s.length()-1]
//        //如果回文子串长度为偶数, 则其中心为空
//        int strLen = s.length();
//
//        int total = 0;
//        for(int i = 0; i < strLen ; i++){
//            //首先判断长度为奇数的回文子串
//            int left = i;
//            int right = i;
//            while(left >= 0 && right < strLen && s.charAt(left) == s.charAt(right)){
//                total++;
//                left--;
//                right++;
//            }
//            //判断长度为偶数的回文子串
//            left = i;
//            right = i+1;
//            while(left >= 0 && right < strLen && s.charAt(left) == s.charAt(right)){
//                total++;
//                left--;
//                right++;
//            }
//        }
//        return total;
//    }