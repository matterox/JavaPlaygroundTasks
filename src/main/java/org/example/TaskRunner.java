package org.example;

import org.example.tasks.*;

public class TaskRunner {
    private static final TaskRun[] tasksBank = new TaskRun[]{
            new IsUniqueTask(),
            new HighestFrequencyTask(),
            new IsStringMirroredTask(),
            new IsStringRotated(),
    };

    public void runTask(int id) {
        if (id > tasksBank.length || id < 0) throw new IllegalArgumentException();
        printPrettyTaskResults(tasksBank[id]);
    }

    private static void printPrettyTaskResults(TaskRun task) {
        Utils.print(task.getClass().getName() + " results:");
        task.runTask();
        Utils.print("=====================");
    }
}
