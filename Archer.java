package OOPGame;

public  abstract class Archer extends PlayerCharacter {
    private int numberOfArrows;

    public Archer(String name, int age, int numberOfArrows, int currentLevel) { //int currentLevel
        super(name, age, currentLevel); //apelam metoda din playercharacter
        this.numberOfArrows = numberOfArrows;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    public void attack() {
        this.numberOfArrows--;
        System.out.println("Attacking with arrows. Number of arrows left: " + this.numberOfArrows);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void leveUp() {
        int level = getCurrentLevel();
        level++;
        setCurrentLevel(level);
        numberOfArrows += 100;
    }
}
