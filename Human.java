import java.util.Scanner;

public class Human {
    int userChoice;
    private Character characterInstance;
    private Appearance appearanceInstance;
    private Body bodyInstance;

    static Body humanBody = new Body("2", "2", "2", "mesomorphic");


    public Human() {
        this.characterInstance = new Character();
        this.appearanceInstance = new Appearance();
        this.bodyInstance = new Body();
    }
    public Human(Character character, Appearance appearance, Body body) {
        this.characterInstance = character;
        this.appearanceInstance = appearance;
        this.bodyInstance = body;
    }

    public Character getCharacterInstance() {
        return this.characterInstance;
    }

    public Appearance getAppearanceInstance() {
        return this.appearanceInstance;
    }

    public Body getBodyInstance() {
        return bodyInstance;
    }

//    public static void enteredIncorrectValue() {
//        try {
//            Scanner scanner = new Scanner(System.in);
//            int userChoice = scanner.nextInt();
//        } catch (Exception e) {
//            System.out.println("Only numbers can be entered.");
//            enteredIncorrectValue();
//        }
//    }

}
