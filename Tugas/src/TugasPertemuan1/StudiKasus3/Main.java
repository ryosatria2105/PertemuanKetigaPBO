package StudiKasus3;

public class Main {

    public static void main(String[] args) {
        Kucing kucing = new Kucing();

        // Hewan
        kucing.setJenisHewan("Mamalia, Reptil, Burung, Ikan, Amfibi, Serangga");
        kucing.setCaraBernafas("Paru-paru (Mamalia/Reptil/Burung), Insang (Ikan), Kulit+Paru (Amfibi)");
        kucing.setHabitatUmum("Darat, Air, Udara");

        // Mamalia
        kucing.setJenisBulu("Halus, Tebal, Botak");
        kucing.setCaraBeranak("Melahirkan");
        kucing.setJumlahKaki(4);
        kucing.setSifatUmum("Jinak, liar");
        kucing.setWarnaBuluUmum("Coklat, Putih, Hitam, Abu-abu");

        // Kucing spesifik
        kucing.setRas("Persia");
        kucing.setWarnaBulu("Putih");
        kucing.setSuara("Meow, Mendengkur, Rorrrrr");
        kucing.setBerat(4.5);
        kucing.setTinggi(25);
        kucing.setUmurHidup(6);
        kucing.setSifat("Jinak, Aktif");
        kucing.setCiriKhas("Bulu lembut, ekor panjang");

        // Output per level
        System.out.println("=== Hewan ===");
        System.out.println("Jenis Hewan: " + kucing.getJenisHewan());
        System.out.println("Cara Bernafas: " + kucing.getCaraBernafas());
        System.out.println("Habitat Umum: " + kucing.getHabitatUmum());

        System.out.println("\n=== Mamalia ===");
        System.out.println("Jenis Bulu: " + kucing.getJenisBulu());
        System.out.println("Cara Beranak: " + kucing.getCaraBeranak());
        System.out.println("Jumlah Kaki: " + kucing.getJumlahKaki());
        System.out.println("Sifat Umum: " + kucing.getSifatUmum());
        System.out.println("Warna Bulu Umum: " + kucing.getWarnaBuluUmum());

        System.out.println("\n=== Kucing ===");
        System.out.println("Ras: " + kucing.getRas());
        System.out.println("Warna Bulu: " + kucing.getWarnaBulu());
        System.out.println("Suara: " + kucing.getSuara());
        System.out.println("Berat: " + kucing.getBerat() + " kg");
        System.out.println("Tinggi: " + kucing.getTinggi() + " cm");
        System.out.println("Umur Hidup: " + kucing.getUmurHidup() + " tahun");
        System.out.println("Sifat: " + kucing.getSifat());
        System.out.println("Ciri Khas: " + kucing.getCiriKhas());
    }
}
