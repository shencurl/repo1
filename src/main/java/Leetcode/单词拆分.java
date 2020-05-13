package Leetcode;

import java.util.HashSet;
import java.util.List;

/**
 * dp[i]表示字符串前i个字符能被单词拼凑出，要使整个字符串被拼凑出，需要满足dp[s.length]被拼凑出，而dp[s.length]只需要在[0-s.length)找到一个d[j]为true，剩下的(j-s.le
 * ngth)在字典中能找到即可。
 *
 */
public class 单词拆分 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        HashSet<String> DictSet=new HashSet<>(wordDict);
        for (int i=1;i<=s.length();i++){
            for (int j=0;j<i;j++){
                if (dp[j]&&DictSet.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
