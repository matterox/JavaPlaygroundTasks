package org.example.tasks;

import org.example.Utils;

public class IsStringMirroredTask implements TaskRun {
    @Override
    public void runTask() {
        Utils.print(isStringMirrored("javascript", "tpircsavaj")); // -> true
        Utils.print(isStringMirrored("javascript", "scriptjava")); // -> false
        Utils.print(isStringMirrored("script", "tpircs")); // -> true
        Utils.print(isStringMirrored("javascript", "java")); // -> false
    }

    private Boolean isStringMirrored(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(a.length() - 1 - i)) return false;
        }
        return true;
    }
}
