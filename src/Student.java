public class Student {
    private String name;
    private String secondName;
    private Integer age;
    private Integer groupNumber;
    private Integer solvedTaskCount;
    private Integer finishedModulesCount;
    private boolean experience;


    //constructors


    public Student(String name, String secondName, Integer age) {
        this(name, secondName, age, 0, 0, 0, false);
    }

    public Student(String name, String secondName, Integer age, Integer groupNumber, Integer solvedTaskCount, Integer finishedModulesCount, boolean experience) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.groupNumber = groupNumber;
        this.solvedTaskCount = solvedTaskCount;
        this.finishedModulesCount = finishedModulesCount;
        this.experience = experience;
    }

    //methods
    public void doTask() {

    }

    public void askQuestion() {

    }

    public void callSupport() {

    }


    //getters & setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Integer getSolvedTaskCount() {
        return solvedTaskCount;
    }

    public void setSolvedTaskCount(Integer solvedTaskCount) {
        this.solvedTaskCount = solvedTaskCount;
    }

    public Integer getFinishedModulesCount() {
        return finishedModulesCount;
    }

    public void setFinishedModulesCount(Integer finishedModulesCount) {
        this.finishedModulesCount = finishedModulesCount;
    }

    public boolean isExperience() {
        return experience;
    }

    public void setExperience(boolean experience) {
        this.experience = experience;
    }
}
