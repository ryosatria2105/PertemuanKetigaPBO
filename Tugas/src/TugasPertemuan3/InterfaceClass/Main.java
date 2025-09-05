package TugasPertemuan3.InterfaceClass;

public class Main {
    public static void main(String[] args) {
        // Buat objek pesawat
        Pesawat pesawat = new Pesawat();

        // Panggil method dari interface
        pesawat.jalan();
        pesawat.hidupkanMesin();
        pesawat.terbang();
    }
}
