package Leetcode;

public class 字符数组 {
 /*   public String replaceSpace(String s) {
        String sr=s.replaceAll(" ","%20");
        return sr;
    }*/

    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == ' ')
                res.append("%20");
            else
                res.append(c);
        }
        return res.toString();
    }
}
