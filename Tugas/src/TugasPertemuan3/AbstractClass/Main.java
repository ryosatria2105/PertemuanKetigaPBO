package TugasPertemuan3.AbstractClass;

public class Main {
    public static void main(String[] args) {
        // Buat objek kucing
        Kucing kitty = new Kucing("Kitty");

        // Panggil method-methodnya
        kitty.info();       // info kucing
        kitty.bernapas();   // implementasi bernapas
        kitty.bergerak();   // implementasi bergerak
        kitty.bersuara();   // suara kucing
        kitty.menyusui();   // khusus mamalia
    }
}
