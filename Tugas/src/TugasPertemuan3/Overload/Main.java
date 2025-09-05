package TugasPertemuan3.Overload;

public class Main{
    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();

        // Panggilan method overload
        System.out.println("2 + 3 = " + calc.tambah(2, 3));
        System.out.println("2 + 3 + 4 = " + calc.tambah(2, 3, 4));
        System.out.println("2.5 + 3.7 = " + calc.tambah(2.5, 3.7));
    }
}
