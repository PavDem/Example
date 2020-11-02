package main;

import abstractClasses.Person;
import abstractClasses.Task;
import interfaces.Autochecked;
import interfaces.Staff;

import java.util.Random;

public class Mentor extends Person implements Staff {
    private boolean isMentorInGoodMood;
    private Random random;

    public Mentor(String name, int age) {
        super(name, age);
        this.isMentorInGoodMood = true;
        this.random = new Random();
    }

    @Override
    public void helpStudent(Student student) {
        System.out.println("You are doing great " + student.getName());
    }

    public boolean checkCode(Task task) {
        int mood = this.random.nextInt(5000);
        if (mood < 1000) {
            System.out.println("I'm in bad mood, send task " + task.getNumber() + " later");
            return false;
        }
        System.out.println("Task " + task.getNumber() + " checked by mentor");
        return true;
    }
}
