package TugasPertemuan3.AbstractClass;

// Kucing = class konkret (bukan abstract) -> wajib implementasi semua method
public class Kucing extends Mamalia {
    private String nama;

    public Kucing(String nama) {
        this.nama = nama;
    }

    @Override
    void bernapas() {
        System.out.println(nama + " bernapas dengan paru-paru.");
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan berjalan dan berlari.");
    }

    @Override
    void bersuara() {
        System.out.println(nama + " bersuara: Meong!");
    }

    @Override
    void menyusui() {
        System.out.println(nama + " menyusui anaknya.");
    }

    void info() {
        System.out.println("Nama kucing: " + nama);
    }
}
