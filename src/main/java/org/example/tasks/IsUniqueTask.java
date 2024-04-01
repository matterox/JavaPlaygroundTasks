package org.example.tasks;

import org.example.Utils;

import java.util.HashSet;

public class IsUniqueTask implements TaskRun {
    @Override
    public void runTask() {
//        console.log(isUnique('abcdef')) // -> true
//        console.log(isUnique('1234567')) // -> true
//        console.log(isUnique('abcABC')) // -> true
//        console.log(isUnique('abcadef')) // -> false

        Utils.print(isUnique("abcdef"));
        Utils.print(isUnique("1234567"));
        Utils.print(isUnique("abcABC"));
        Utils.print(isUnique("abcadef"));
    }

    private Boolean isUnique(String inputString) {
        HashSet<Character> newSet = new HashSet<>();
        for (int i = 0; i < inputString.length(); i++) {
            Character ch = inputString.charAt(i);
            if (newSet.contains(ch)) return false;
            else newSet.add(ch);
        }
        return true;
    }
}
