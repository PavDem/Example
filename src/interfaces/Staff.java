package interfaces;

import main.Student;

public interface Staff {
    void helpStudent(Student student);

    default void giveMoreMaterials() {
        System.out.println("https://habr.com/ru/post/463125/");
    }
}
