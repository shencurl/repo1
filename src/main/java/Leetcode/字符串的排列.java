package Leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class 字符串的排列 {
    Set<String> result = new HashSet<>();
    public String[] permutation(String s) {
        if(s == null) return new String[]{};
        boolean[] visited = new boolean[s.length()];
        process(s, "", visited);
        return result.toArray(new String[result.size()]);
    }

    private void process(String s, String letter, boolean[] visted) {
        if (s.length() == letter.length()) {
            result.add(letter);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (visted[i]) continue;
            visted[i] = true;
            process(s, letter + String.valueOf(temp), visted);
            visted[i] = false;
        }
    }

}
