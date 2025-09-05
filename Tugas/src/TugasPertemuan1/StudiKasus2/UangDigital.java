package StudiKasus2;

public class UangDigital extends Uang {

    private String platform;
    private String keunggulan;
    private String risiko;
    private String teknologi;

    // Setter
    protected void setPlatform(String platform) {
        this.platform = platform;
    }

    protected void setKeunggulan(String keunggulan) {
        this.keunggulan = keunggulan;
    }

    protected void setRisiko(String risiko) {
        this.risiko = risiko;
    }

    protected void setTeknologi(String teknologi) {
        this.teknologi = teknologi;
    }

    // Getter
    public String getPlatform() {
        return platform;
    }

    public String getKeunggulan() {
        return keunggulan;
    }

    public String getRisiko() {
        return risiko;
    }

    public String getTeknologi() {
        return teknologi;
    }
}
