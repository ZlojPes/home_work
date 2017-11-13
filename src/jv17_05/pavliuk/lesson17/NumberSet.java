package jv17_05.pavliuk.lesson17;

import java.util.*;
import java.util.regex.*;

public class NumberSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("\\d+");
        System.out.println("Type several numbers through comma:");
        String input = sc.nextLine();
        Matcher m = p.matcher(input);
        while (m.find()) {
            set.add(Integer.parseInt(m.group()));
        }
        System.out.println(set);
    }
}
