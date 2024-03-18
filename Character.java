public class Character {
    private String senseOfHumor;
    private String intelligence;
    private String creativityLevel;
    private String temperament;
    private String personalityType;

    public Character() {
        this.senseOfHumor = "Medium";
        this.intelligence = "Medium";
        this.creativityLevel = "Medium";
        this.temperament = "Extravert";
    }

    public Character(String senseOfHumor) {
        this.senseOfHumor = senseOfHumor;
    }

    public Character(String senseOfHumor, String intelligence, String creativityLevel, String temperament,
                     String personalityType) {
        this.senseOfHumor = senseOfHumor;
        this.intelligence = intelligence;
        this.creativityLevel = creativityLevel;
        this.temperament = temperament;
        this.personalityType = personalityType;
    }

    public String getSenseOfHumor() {
        return senseOfHumor;
    }

    public String getIntelligence() {
        return intelligence;
    }

    public String getCreativityLevel() {
        return creativityLevel;
    }

    public String getTemperament() {
        return temperament;
    }

    public String getPersonalityType() {
        return personalityType;
    }
}
