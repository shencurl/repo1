package Leetcode;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class n个数中1出现的次数 {
    /**
     * 累加所有数个位到最高位1出现的次数即使所求，记录高位，低位，当前位，以及当前位的值。
     *
     * @return
     */
    public int countDigitOne(int n) {
        int digit=1,res=0;
        int hight=n/10,cur=n%10,low=0;
        while (hight!=0||cur!=0){
            if (cur==0)res+=hight*digit;
            else if (cur==1)res+=hight*digit+low+1;
            else res+=(hight+1)*digit;
            low+=cur*digit;
            digit*=10;
            cur=hight%10;
            hight/=10;

        }
        return res;
    }
}
