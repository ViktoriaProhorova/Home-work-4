public class Body {
    private String numberOfLegs;
    private String numberOfHands;
    private String numberOfEyes;
    private String bodyType;

    public Body() {
        this.numberOfLegs = "2";
        this.numberOfHands = "2";
        this.numberOfEyes = "2";
        this.bodyType = "Mesomorphic";
    }

    public Body(
            String numberOfLegs, String numberOfHands, String numberOfEyes,
            String bodyType) {
        this.numberOfLegs = numberOfLegs;
        this.numberOfHands = numberOfHands;
        this.numberOfEyes = numberOfEyes;
        this.bodyType = bodyType;
    }

    public String getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getNumberOfHands() {
        return  numberOfHands;
    }

    public String getNumberOfEyes() {
        return numberOfEyes;
    }

    public String getBodyType() {
        return bodyType;
    }
}
