package StudiKasus2;

public class Main {

    public static void main(String[] args) {
        Bitcoin btc = new Bitcoin();

         // Data dari Uang
        btc.setFungsi("Alat tukar, penyimpanan nilai");
        btc.setBentuk("Fisik / Digital");

        // Data dari UangDigital
        btc.setPlatform("Blockchain, E-Money, M-Banking, dll");
        btc.setKeunggulan("Transaksi lebih cepat, praktis, tanpa fisik");
        btc.setRisiko("Keamanan, butuh koneksi internet");
        btc.setTeknologi("Desentralisasi, Server Bank, dll");

        // Data dari Bitcoin
        btc.setNamaMataUang("Bitcoin");
        btc.setSimbol("BTC");
        btc.setAsal("Global (Decentralized)");
        btc.setSupplyLimited("Ya, cuma ada 21 juta BTC");
        btc.setPeriodeHalving("4 tahun");
        btc.setAlgoritma("SHA-256");
        btc.setTahunDibuat(2009);

        // tambahan baru
        btc.setSupplyMaksimal("21 Juta BTC");
        btc.setMarketCap("Terbesar di Dunia Kripto");
        btc.setKelebihan("Desentralisasi, Limited Supply, Aman tanpa perantara pemerintah"
                + "");

        // Output
        System.out.println("=== Uang ===");
        System.out.println("Fungsi          : " + btc.getFungsi());
        System.out.println("Bentuk          : " + btc.getBentuk());

        System.out.println("\n=== Uang Digital ===");
        System.out.println("Platform        : " + btc.getPlatform());
        System.out.println("Keunggulan      : " + btc.getKeunggulan());
        System.out.println("Risiko          : " + btc.getRisiko());
        System.out.println("Teknologi       : " + btc.getTeknologi());

        System.out.println("\n=== Bitcoin ===");
        System.out.println("Nama Mata Uang  : " + btc.getNamaMataUang());
        System.out.println("Simbol          : " + btc.getSimbol());
        System.out.println("Asal            : " + btc.getAsal());
        System.out.println("Supply Limited  : " + btc.getSupplyLimited());
        System.out.println("Periode Halving : " + btc.getPeriodeHalving());
        System.out.println("Algoritma       : " + btc.getAlgoritma());
        System.out.println("Tahun Dibuat    : " + btc.getTahunDibuat());
        System.out.println("Supply Maksimal : " + btc.getSupplyMaksimal());
        System.out.println("Market Cap      : " + btc.getMarketCap());
        System.out.println("Kelebihan       : " + btc.getKelebihan());
    }
}