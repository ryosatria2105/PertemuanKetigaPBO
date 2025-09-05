package TugasPertemuan3.Override;

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        hewan1.bersuara(); // Panggil method dari Hewan

        Kucing kitty = new Kucing();
        kitty.bersuara(); // Override -> method Kucing yang jalan
    }
}
