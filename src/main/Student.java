package main;

import abstractClasses.Person;
import abstractClasses.Task;
import interfaces.Autochecked;

public class Student extends Person {
    private static int taskSolvedByAllStudentsCount = 0;
    private int taskSolvedCount;
    private Mentor mentor;
    private boolean finishedAllTasks;

    public Student(String name, int age, Mentor mentor) {
        super(name, age);
        this.mentor = mentor;
        this.taskSolvedCount = 0;
    }

    public void solveTasks(int tasksNumber, Task[] tasks) {
        // the student begins solving tasks from the last solved task last time
        for (int i = taskSolvedCount; i < taskSolvedCount + tasksNumber; i++) {
            if (i < tasks.length) {
                solveTask(tasks[i]);
            } else {
                break;
            }
        }
        if (taskSolvedCount == tasks.length) {
            System.out.println("All tasks have been completed!");
            finishedAllTasks = true;
        } else {
            System.out.println("Not all the tasks are solved yet");
        }
    }

    private void solveTask(Task task) {
        if (task instanceof Autochecked) {
            System.out.println("Task solved, checked by Autochecked");
        } else {
            while (true) {
                if (mentor.checkCode(task))
                    break;
            }
        }
        taskSolvedCount++;
        taskSolvedByAllStudentsCount++;

    }

    public static int getTaskSolvedByAllStudentsCount() {
        return taskSolvedByAllStudentsCount;
    }

    public int getTaskSolvedCount() {
        return taskSolvedCount;
    }

    public void setTaskSolvedCount(int taskSolvedCount) {
        this.taskSolvedCount = taskSolvedCount;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public boolean isFinishedAllTasks() {
        return finishedAllTasks;
    }

    public void setFinishedAllTasks(boolean finishedAllTasks) {
        this.finishedAllTasks = finishedAllTasks;
    }
}
