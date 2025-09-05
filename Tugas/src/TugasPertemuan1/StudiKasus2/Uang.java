package StudiKasus2;

public class Uang {

    private String fungsi;
    private String bentuk;

    // Setter (protected)
    protected void setFungsi(String fungsi) {
        this.fungsi = fungsi;
    }
    protected void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    // Getter
    public String getFungsi() {
        return fungsi;
    }
    public String getBentuk() {
        return bentuk;
    }
}


