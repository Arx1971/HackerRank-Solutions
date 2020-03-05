package two_strings;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String args[]) {

    }

    static String twoStrings(String s1, String s2) {

        boolean checkString = false;

        Set<Character> str1 = new HashSet<>();

        for (Character ch : s1.toCharArray())
            str1.add(ch);

        for (Character ch : s2.toCharArray())
            if (str1.contains(ch))
                checkString = true;


        return checkString == true ? "YES" : "NO";

    }

}
