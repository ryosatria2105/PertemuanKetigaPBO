package StudiKasus2;

public class Bitcoin extends UangDigital {

    private String namaMataUang;
    private String simbol;
    private String asal;
    private String supplyLimited;
    private String periodeHalving;
    private String algoritma;
    private int tahunDibuat;

    // tambahan baru
    private String supplyMaksimal;
    private String marketCap;
    private String kelebihan;

    // Setter
    protected void setNamaMataUang(String namaMataUang) {
        this.namaMataUang = namaMataUang;
    }

    protected void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    protected void setAsal(String asal) {
        this.asal = asal;
    }

    protected void setSupplyLimited(String supplyLimited) {
        this.supplyLimited = supplyLimited;
    }

    protected void setPeriodeHalving(String periodeHalving) {
        this.periodeHalving = periodeHalving;
    }
    protected void setAlgoritma(String algoritma) {
        this.algoritma = algoritma;
    }
    protected void setTahunDibuat(int tahunDibuat) {
        this.tahunDibuat = tahunDibuat;
    }
    protected void setSupplyMaksimal(String supplyMaksimal) {
        this.supplyMaksimal = supplyMaksimal;
    }
    protected void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }
    protected void setKelebihan(String kelebihan) {
        this.kelebihan = kelebihan;
    }
    public String getNamaMataUang() {
        return namaMataUang;
    }
    public String getSimbol() {
        return simbol;
    }
    public String getAsal() {
        return asal;
    }
    public String getSupplyLimited() {
        return supplyLimited;
    }
    public String getPeriodeHalving() {
        return periodeHalving;
    }
    public String getAlgoritma() {
        return algoritma;
    }
    public int getTahunDibuat() {
        return tahunDibuat;
    }
    public String getSupplyMaksimal() {
        return supplyMaksimal;
    }
    public String getMarketCap() {
        return marketCap;
    }
    public String getKelebihan() {
        return kelebihan;  }}
