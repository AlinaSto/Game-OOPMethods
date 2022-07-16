package OOPGame;

public abstract class PlayerCharacter {
    private String name;
    private int age;
    int currentLevel;

    public PlayerCharacter(String name, int age, int currentLevel) {
        this.name = name;
        this.age = age;
        this.currentLevel = currentLevel;
    }

    public void run() {
        System.out.println("run");
    }

    public void speak() {
        System.out.println("My name is " + this.name + " and I am " + this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;

    }

    public abstract void attack();
    //  System.out.println("Attacking");
    public abstract void levelUp();


    public abstract void leveUp();
}
