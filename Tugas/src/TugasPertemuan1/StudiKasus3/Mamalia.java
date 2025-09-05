package StudiKasus3;

public class Mamalia extends Hewan {

    private String jenisBulu;
    private String caraBeranak;
    private int jumlahKaki;
    private String sifatUmum;
    private String warnaBuluUmum;

    protected void setJenisBulu(String jenisBulu) {
        this.jenisBulu = jenisBulu;
    }

    protected String getJenisBulu() {
        return jenisBulu;
    }

    protected void setCaraBeranak(String caraBeranak) {
        this.caraBeranak = caraBeranak;
    }

    protected String getCaraBeranak() {
        return caraBeranak;
    }

    protected void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    protected int getJumlahKaki() {
        return jumlahKaki;
    }

    protected void setSifatUmum(String sifatUmum) {
        this.sifatUmum = sifatUmum;
    }

    protected String getSifatUmum() {
        return sifatUmum;
    }

    protected void setWarnaBuluUmum(String warnaBuluUmum) {
        this.warnaBuluUmum = warnaBuluUmum;
    }

    protected String getWarnaBuluUmum() {
        return warnaBuluUmum;
    }

}
