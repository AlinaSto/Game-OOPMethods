package OOPGame;

public abstract class Wizard extends PlayerCharacter implements Playable {
    private int power;
   // private int currentLevel;

    public Wizard(String name, int age, int power, int currentLevel) {
        super(name, age, currentLevel);
        this.power = power;
       //this.currentLevel = currentLevel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


    public void attack() {
        System.out.println("Attacking with a power of" + this.power);
    }

    @Override
    public void leveUp() {
        int level = getCurrentLevel() + 1;
        setCurrentLevel(level);
        power += 52;
    }
}