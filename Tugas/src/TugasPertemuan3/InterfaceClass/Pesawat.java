package TugasPertemuan3.InterfaceClass;

// Pesawat wajib implementasi semua interface yang diambil
class Pesawat implements Kendaraan, Mesin, BisaTerbang {
    @Override
    public void jalan() {
        System.out.println("Pesawat berjalan di landasan.");
    }

    @Override
    public void hidupkanMesin() {
        System.out.println("Mesin pesawat dihidupkan.");
    }

    @Override
    public void terbang() {
        System.out.println("Pesawat terbang di udara.");
    }
}
