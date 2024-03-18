import java.util.Scanner;

public class Women extends Human {
    static Character averageWomanCharacter = new Character("medium",
            "medium", "medium",
            "sanguine", "extravert");
    static Appearance averageWomanAppearance = new Appearance("blue", "medium",
            "medium", "pale", "classic", "7/10");

    public static void main(String[] args) {
        enteredIncorrectValue();
    }

        public static void enteredIncorrectValue () {
            System.out.println("If you want to read information about average woman body - enter 1." +
                    "\nIf you want to read information about average woman character - enter 2." +
                    "\nIf you want to read information about average woman appearance - enter 3.");
            try {
                Scanner scanner = new Scanner(System.in);
                int userChoice = scanner.nextInt();
                if (userChoice == 1) {
                    System.out.println("\nAverage woman body:" +
                            "\nNumber of legs - " + humanBody.getNumberOfLegs() +
                            "\nNumber of hands - " + humanBody.getNumberOfHands() +
                            "\nNumber of eyes - " + humanBody.getNumberOfEyes() +
                            "\nBody type - " + humanBody.getBodyType());
                } else if (userChoice == 2) {
                    System.out.println("\nAverage woman character:" +
                            "\nSense of humor - " +
                            averageWomanCharacter.getSenseOfHumor() +
                            "\nIntelligence - " + averageWomanCharacter.getIntelligence() +
                            "\nCreativity level - " + averageWomanCharacter.getCreativityLevel() +
                            "\nTemperament - " + averageWomanCharacter.getTemperament() +
                            "\nPersonality type - " + averageWomanCharacter.getPersonalityType());
                } else if (userChoice == 3) {
                    System.out.println("\nAverage woman appearance:" +
                            "\nEyes color - " + averageWomanAppearance.getEyesColor() +
                            "\nNose size - " + averageWomanAppearance.getNoseSize() +
                            "\nLip thickness - " + averageWomanAppearance.getLipThickness() +
                            "\nSkin tone - " + averageWomanAppearance.getSkinTone() +
                            "\nHair style - " + averageWomanAppearance.getHairStyle() +
                            "\nAppearance assessment - " + averageWomanAppearance.getAppearanceAssessment());
                } else {
                        System.out.println("You've entered incorrect number.");
                    }
            } catch (Exception e) {
                System.out.println("Only numbers can be entered.");
                enteredIncorrectValue();
            }
        }
    }

