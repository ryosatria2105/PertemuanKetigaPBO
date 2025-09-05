package TugasPertemuan3.AbstractClass;

// Abstract class paling umum
public abstract class MakhlukHidup {
    // Method abstract -> harus diimplementasi di subclass
    abstract void bernapas();
    abstract void bergerak();

    // Method non-abstract -> langsung bisa dipakai
    void info() {
        System.out.println("Ini adalah makhluk hidup.");
    }
}
