package TugasPertemuan2;
public class Manusia {
    private String nama;
    private int usia;

    // Constructor
    public Manusia(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama; //this
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia; //this
    }
}

