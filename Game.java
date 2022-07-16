package OOPGame;

public class Game {
    public static void main(String[] args) {
//        PlayerCharacter playerCharacter = new PlayerCharacter("Ann", 15);
//        playerCharacter.speak();
//        System.out.println(playerCharacter.getName());
//        playerCharacter.setAge(25);
//        System.out.println(playerCharacter.getAge());

        Archer archer = new Archer("Olaf", 25, 58,1) {
            @Override
            public void levelUp() {

            }
        };
        archer.attack();
       // System.out.println(archer.getName());

        System.out.println(archer instanceof Archer);
        System.out.println(archer instanceof PlayerCharacter);
        archer.toString();
        System.out.println(archer instanceof Object);
        PlayerCharacter wizard = new Wizard("Ianca", 523, 10, 1) {
            @Override
            public void levelUp() {

            }
        };
        wizard.attack();
      //  PlayerCharacter archer1 = new Archer("Ionus", 41, 100);
      //  archer1.attack();
      //  playerCharacter1.attack(); // java cauta metoda
       // playerCharacter1 = new Archer("lulu", 45, 25);


        doAllPlayerActions(wizard);
        doAllPlayerActions(archer);
    }

    public static void doAllPlayerActions(PlayerCharacter playerCharacter) {
        playerCharacter.speak();
        playerCharacter.attack();
        playerCharacter.run();
        playerCharacter.levelUp();

    }
}
