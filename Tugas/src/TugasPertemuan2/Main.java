package TugasPertemuan2;

public class Main {
    public static void main(String[] args) {
        // Buat objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("Ryo", 20);

        // Tes method dari Organisasi
        System.out.println();
        mhs.rapat();
        mhs.kegiatan();
        mhs.laporan();

        // Tes method dari Barista
        System.out.println();
        mhs.buatKopi();
        mhs.sajikanKopi();
        mhs.bersihMeja();

        // Tes method dari Driver Ojol
        System.out.println();
        mhs.terimaOrder();
        mhs.antarPenumpang();
        mhs.selesaiOrder();
    }
}
