package main;
import abstractClasses.Task;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Task[] tasks = createTasks();
        Student[] students = createStudents();


        while (Student.getTaskSolvedByAllStudentsCount() < tasks.length * students.length) {
            for (int i = 0; i < students.length; i++) {
                if (!students[i].isFinishedAllTasks()) {
                    int tasksAmount = random.nextInt(tasks.length);
                    students[i].solveTasks(tasksAmount, tasks);
                }
            }
        }
    }

    public static Task[] createTasks() {
        Task[] tasks = new Task[30];
        Random random = new Random();
        for (int i = 0; i < tasks.length; i++) {
            Task task = null;
            int rand = random.nextInt(3);
            switch (rand) {
                case 0: {
                    task = new Test();
                    break;
                }
                case 1: {
                    task = new DragAndDrop();
                    break;
                }
                case 2: {
                    task = new Code();
                    break;
                }
            }
            task.setNumber(i);
            tasks[i] = task;
        }
        return tasks;
    }

    public static Student[] createStudents() {
        Mentor mentor1 = new Mentor("Mentor1", 30);
        Mentor mentor2 = new Mentor("Mentor2", 25);
        Mentor mentor = null;
        Student[] students = new Student[10];
        Random random = new Random();
        for (Integer i = 0; i < students.length; i++) {
            int rand = random.nextInt(2);
            String name = "name " + i.toString();
            switch (rand) {
                case 0: {
                    mentor = mentor1;
                    break;
                }
                case 1: {
                    mentor = mentor2;
                }

            }
            students[i] = new Student(name, 20 + i, mentor);
        }
        return students;
    }
}



