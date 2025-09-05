package TugasPertemuan2;

class Mahasiswa extends Manusia implements Organisasi, Barista, DriverOjol {

    // Constructor subclass
    public Mahasiswa(String nama, int usia) {
        super(nama, usia); // super
    }

    // Implementasi Organisasi
    public void rapat() {
        System.out.println(getNama() + " menghadiri rapat organisasi kampus.");
    }
    public void kegiatan() {
        System.out.println(getNama() + " aktif mengikuti kegiatan kampus.");
    }
    public void laporan() {
        System.out.println(getNama() + " membuat laporan organisasi setiap akhir kegiatan.");
    }

    // Implementasi Barista
    public void buatKopi() {
        System.out.println(getNama() + " membuat kopi untuk pelanggan.");
    }
    public void sajikanKopi() {
        System.out.println(getNama() + " menyajikan kopi ke meja pelanggan.");
    }
    public void bersihMeja() {
        System.out.println(getNama() + " membersihkan meja setelah pelanggan pergi.");
    }

    // Implementasi DriverOjol
    public void terimaOrder() {
        System.out.println(getNama() + " bekerja sebagai driver ojol.");
    }
    public void antarPenumpang() {
        System.out.println(getNama() + " sedang mengantar penumpang ke tujuan.");
    }
    public void selesaiOrder() {
        System.out.println(getNama() + " menyelesaikan order pelanggan.");
    }
}
