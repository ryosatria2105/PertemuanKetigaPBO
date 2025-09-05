
public class Mobil extends Kendaraan {

    private int jumlahRoda = 4;
    private String bahanBakar = "Bensin / solar / listrik / hybrid / gas";
    private String kapasitasPenumpang = "2-5 orang";
    private String transmisi = "Manual/Automatic";
    private int jumlahPintu = 4;

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public String getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public String getTransmisi() {
        return transmisi;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

}
