package interfaces;

public interface Autochecked {
    default void taskSolvedPrinter() {
        System.out.println("Task solved!");
    }
}
