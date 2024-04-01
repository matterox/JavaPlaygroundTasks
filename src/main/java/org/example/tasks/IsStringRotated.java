package org.example.tasks;

import org.example.Utils;

public class IsStringRotated implements TaskRun {
    @Override
    public void runTask() {
//        console.log(isStringRotated('javascript', 'scriptjava')) // -> true
//        console.log(isStringRotated('javascript', 'iptjavascr')) // -> true
//        console.log(isStringRotated('javascript', 'java')) // -> false

        Utils.print(isStringRotated("javascript", "scriptjava")); // -> true
        Utils.print(isStringRotated("javascript", "iptjavascr")); // -> true
        Utils.print(isStringRotated("javascript", "java")); // -> false
    }

    private Boolean isStringRotated(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i ++) {
            String movedString = a.substring(i) + a.substring(0, i);
            if (b.equals(movedString)) return true;
        }

        return false;
    }
}
