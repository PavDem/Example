package main;

import abstractClasses.Task;
import interfaces.Autochecked;

public class Test extends Task implements Autochecked {
    private String[] answers;

    public Test() {
        super();
        this.answers = new String[]{"a", "b", "c"};
    }
}
