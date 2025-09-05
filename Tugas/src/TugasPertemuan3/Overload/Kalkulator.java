package TugasPertemuan3.Overload;

class Kalkulator {
    // Method penjumlahan dengan 2 parameter
    int tambah(int a, int b) {
        return a + b;
    }

    // Overload: method sama "tambah" tapi dengan 3 parameter
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Overload: method sama "tambah" tapi dengan tipe data berbeda
    double tambah(double a, double b) {
        return a + b;
    }
}
