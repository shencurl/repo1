package Leetcode;

public class 表示数值的字符串 {
    //正则表达式
    public boolean isNumber(String s) {
        String str="^[+|-]?((\\d+\\.?)|(\\d*\\.\\d+))([E|e][+|-]?\\d+)?$";
        return s.trim().matches(str);
    }

}
