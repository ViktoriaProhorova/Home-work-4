import java.util.Scanner;

public class Men extends Human {
    static Character averageManCharacter = new Character("medium",
            "medium", "medium",
            "phlegmatic", "introvert");
    static Appearance averageManAppearance = new Appearance("gray", "medium",
            "thin", "pale", "classic", "5/10");

    public static void main(String[] args) {
        enteredIncorrectValue();
    }

    public static void enteredIncorrectValue () {
        System.out.println("If you want to read information about average man body - enter 1." +
                "\nIf you want to read information about average man character - enter 2." +
                "\nIf you want to read information about average man appearance - enter 3.");
        try {
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                System.out.println("\nAverage man body:" +
                        "\nNumber of legs - " + humanBody.getNumberOfLegs() +
                        "\nNumber of hands - " + humanBody.getNumberOfHands() +
                        "\nNumber of eyes - " + humanBody.getNumberOfEyes() +
                        "\nBody type - " + humanBody.getBodyType());
            } else if (userChoice == 2) {
                System.out.println("\nAverage man character:" +
                        "\nSense of humor - " +
                        averageManCharacter.getSenseOfHumor() +
                        "\nIntelligence - " + averageManCharacter.getIntelligence() +
                        "\nCreativity level - " + averageManCharacter.getCreativityLevel() +
                        "\nTemperament - " + averageManCharacter.getTemperament() +
                        "\nPersonality type - " + averageManCharacter.getPersonalityType());
            } else if (userChoice == 3) {
                System.out.println("\nAverage man appearance:" +
                        "\nEyes color - " + averageManAppearance.getEyesColor() +
                        "\nNose size - " + averageManAppearance.getNoseSize() +
                        "\nLip thickness - " + averageManAppearance.getLipThickness() +
                        "\nSkin tone - " + averageManAppearance.getSkinTone() +
                        "\nHair style - " + averageManAppearance.getHairStyle() +
                        "\nAppearance assessment - " + averageManAppearance.getAppearanceAssessment());
            } else {
                System.out.println("You've entered incorrect number.");
            }
        } catch (Exception e) {
            System.out.println("Only numbers can be entered.");
            enteredIncorrectValue();
        }
    }
}


