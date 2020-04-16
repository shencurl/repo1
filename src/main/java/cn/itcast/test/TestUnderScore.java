package cn.itcast.test;

import java.sql.SQLOutput;

public class TestUnderScore {

    public static void outNumericLiteral(){
        int i=1000_000;
        System.out.println(i);
    }

    public static void main(String[] args) {
        outNumericLiteral();
    }

}
