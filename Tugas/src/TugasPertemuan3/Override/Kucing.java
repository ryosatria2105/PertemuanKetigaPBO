package TugasPertemuan3.Override;

// Subclass
class Kucing extends Hewan {
    @Override
    void bersuara() {
        // Method ini menimpa method bersuara() di Hewan
        System.out.println("Kucing bersuara: Meong!");
    }
}
