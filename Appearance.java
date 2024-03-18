public class Appearance {
    private String eyesColor;
    private String noseSize;
    private String lipThickness;
    private String skinTone;
    private String hairStyle;
    private String appearanceAssessment;

    public Appearance() {
        this.eyesColor = "Light blue";
        this.noseSize = "Medium";
        this.lipThickness = "Thin";
        this.skinTone = "Pale";
        this.hairStyle = "Crew cut";
        this.appearanceAssessment = "Medium";
    }
    public Appearance(
            String eyesColor, String noseSize, String lipThickness,
            String skinTone, String hairStyle, String appearanceAssessment) {
        this.eyesColor = eyesColor;
        this.noseSize = noseSize;
        this.lipThickness = lipThickness;
        this.skinTone = skinTone;
        this.hairStyle = hairStyle;
        this.appearanceAssessment = appearanceAssessment;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public String getNoseSize() {
        return noseSize;
    }

    public String getLipThickness() {
        return lipThickness;
    }

    public String getSkinTone() {
        return skinTone;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public String getAppearanceAssessment() {
        return appearanceAssessment;
    }
}
