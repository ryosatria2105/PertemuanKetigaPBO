public class Main {
    public static void main(String[] args) {
        MclarenSenna mclaren = new MclarenSenna();
        
        System.out.println("=== Kendaraan (Umum) ===");
        System.out.println("Jenis Kendaraan : " + mclaren.getJenisKendaraan());
        System.out.println("Fungsi         : " + mclaren.getFungsi());
        System.out.println("Sumber Tenaga  : " + mclaren.getSumberTenaga());

        System.out.println("\n=== Mobil (Turunan Kendaraan) ===");
        System.out.println("Jumlah Roda          : " + mclaren.getJumlahRoda());
        System.out.println("Bahan Bakar          : " + mclaren.getBahanBakar());
        System.out.println("Kapasitas Penumpang  : " + mclaren.getKapasitasPenumpang());
        System.out.println("Transmisi            : " + mclaren.getTransmisi());
        System.out.println("Jumlah Pintu         : " + mclaren.getJumlahPintu());

        System.out.println("\n=== McLaren Senna (Turunan Mobil) ===");
        System.out.println("Nama Kendaraan   : " + mclaren.getNama());
        System.out.println("Kecepatan Max    : " + mclaren.getKecepatanMax() + " km/h");
        System.out.println("Berat            : " + mclaren.getBerat() + " kg");
        System.out.println("Tahun Produksi   : " + mclaren.getTahunProduksi());
        System.out.println("Horse Power      : " + mclaren.getHorsePower() + " HP");
        System.out.println("Harga            : $" + mclaren.getHarga());
        System.out.println("Fitur Spesial    : " + mclaren.getFiturSpesial());
        System.out.println("Produksi Limited : " + mclaren.getProduksiLimited());
    }
}


       