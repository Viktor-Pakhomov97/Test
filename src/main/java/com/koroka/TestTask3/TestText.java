package com.koroka.TestTask3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TestText {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        Map<Integer, String> integerToStringMap = new HashMap<Integer, String>();
        TreeSet<Integer> intSet = new TreeSet<Integer>();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String a = sc.next();
        for (int i = 0; i < m+1; i++) {
            text.add(sc.nextLine());
        }
        for (String str_i : text) {
            intSet.add(findMatches(str_i, a));
            integerToStringMap.put(findMatches(str_i, a), str_i);
        }
        for (Integer int_i : intSet) {
            System.out.println(integerToStringMap.get(int_i));
        }
    }
    public static int findMatches(String str, String findStr) {
        Pattern p = Pattern.compile(findStr);
        Matcher m = p.matcher(str);
        int count = 0;
        while (m.find()) {
            count += 1;
        }
        return count;
    }
}
