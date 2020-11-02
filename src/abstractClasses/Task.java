package abstractClasses;

public abstract class Task {
    int number;
    String taskContent;

    public Task() {
        this.number = 0;
        this.taskContent = "Very important content";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }
}
