package main;

import abstractClasses.Task;
import interfaces.Autochecked;

public class DragAndDrop extends Task implements Autochecked {
    private String[][] variants;

    public DragAndDrop() {
        super();
        this.variants = new String[][]{{"java", "kotlin"}, {"python", "html/css"}, {"frontend", "backend"}};
    }
}
