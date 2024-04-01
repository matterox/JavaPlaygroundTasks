package org.example.tasks;

import org.example.Utils;

import java.util.HashMap;

public class HighestFrequencyTask implements TaskRun {
    @Override
    public void runTask() {
//        console.log(highestFrequency(['a', 'b', 'c', 'c', 'd', 'e'])) // -> c
//        console.log(highestFrequency(['abc', 'def', 'abc', 'def', 'abc'])) // -> abc
//        console.log(highestFrequency(['abc', 'def'])) // -> abc
//        console.log(highestFrequency(['abc', 'abc', 'def', 'def', 'def', 'ghi', 'ghi', 'ghi', 'ghi' ])) // -> ghi

        Utils.print(highestFrequency(new String[]{"a", "b", "c", "c", "d", "e"})); // -> c
        Utils.print(highestFrequency(new String[]{"abc", "def", "abc", "def", "abc"})); // -> abc
        Utils.print(highestFrequency(new String[]{"abc", "def"})); // -> abc
        Utils.print(highestFrequency(new String[]{"abc", "abc", "def", "def", "def", "ghi", "ghi", "ghi", "ghi" })); // -> ghi
    }

    private String highestFrequency(String[] strings) {
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        String lastFrequentString = strings[0];
        for (String str : strings) {
            Integer strFrequency = frequencyMap.get(str);
            if (strFrequency != null) {
                frequencyMap.put(str, strFrequency + 1);
                lastFrequentString = str;
            } else {
                frequencyMap.put(str, 0);
            }
        }
        return lastFrequentString;
    }
}
