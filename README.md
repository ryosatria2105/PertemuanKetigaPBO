# 📖 Tugas PBO - Pertemuan 3 
Project ini dibuat untuk memenuhi tugas Pemrograman Berorientasi Objek (PBO) pada pertemuan ketiga.
Kebutuhan Tugas:
1. Membuat **3 Class Abstract**  
2. Membuat **3 Class Interface**  
3. Membuat contoh **Overload dan Override** (minimal 2 Class)  
4. Minimal terdapat **8 Class** dalam program  
5. Menambahkan deskripsi tugas pada laporan dan README di GitHub

📂 Struktur Project

1. TugasPertemuan3.AbstractClass
-  MakhlukHidup.java → abstract utama
-  Hewan.java → turunan dari abstract
-  M amalia.java → turunan dari abstract
-  Kucing.java → implementasi class
-  Main.java → class utama untuk menjalankan program
  
2. TugasPertemuan3.InterfaceClass
-  BisaTerbang.java → interface utama
-  Kendaraan.java → class implementasi interface
-  Mesin.java → class implementasi interface
-  Pesawat.java → class implementasi interface
-  Main.java → class utama untuk menjalankan program
  
3. TugasPertemuan3.Overload
-  Kalkulator.java → class yang berisi contoh method overloading
-  Main.java → class utama untuk menjalankan program
  
4. TugasPertemuan3.Override
-  Hewan.java → class dengan method dasar
-  Kucing.java → class yang melakukan override method dari Hewan
-  Main.java → class utama untuk menjalankan program

📝 Penjelasan Teori

1. Abstract Class
Abstract class adalah class yang tidak bisa dibuat objek secara langsung, hanya bisa diturunkan ke class lain. Abstract class biasanya digunakan sebagai kerangka dasar yang punya method abstract (belum ada isinya) dan method konkrit (sudah ada isinya). Contoh di project ini yaitu MakhlukHidup sebagai abstract class, lalu diturunkan ke Hewan, Mamalia, dan diimplementasikan di Kucing.

2. Interface
Interface adalah kumpulan kontrak atau aturan dalam bentuk method (tanpa isi) yang harus diimplementasikan oleh class yang menggunakannya. Interface memungkinkan multiple inheritance (satu class bisa mengimplementasi banyak interface). Contoh di project ini yaitu BisaTerbang sebagai interface, lalu diimplementasikan oleh Kendaraan, Mesin, dan Pesawat.

3. Overriding
Overriding adalah kemampuan class child untuk menulis ulang method dari class parent dengan isi yang berbeda. Tujuan overriding: menyesuaikan perilaku method dengan kebutuhan class turunan. Contoh di project ini: Kucing melakukan override method dari Hewan.

4. Overloading
Overloading adalah pembuatan beberapa method dengan nama yang sama tetapi memiliki parameter berbeda (jumlah atau tipe datanya berbeda). Tujuannya membuat kode lebih fleksibel tanpa harus bikin nama method baru. Contoh di project ini: Kalkulator memiliki method tambah dengan parameter berbeda (misalnya tambah(int, int) dan tambah(double, double)).

📝 Kesimpulan

Dari implementasi tugas PBO pertemuan 3 ini dapat disimpulkan bahwa:
1. Abstract class berfungsi sebagai kerangka dasar yang tidak bisa dibuat objek langsung, tetapi harus diturunkan ke class lain.
2. Interface digunakan sebagai kontrak perilaku yang wajib diimplementasikan oleh class, serta mendukung konsep multiple inheritance.
3. Overriding memungkinkan class turunan untuk menulis ulang method dari parent class sesuai kebutuhan
4. Overloading memberikan fleksibilitas dengan membuat beberapa method dengan nama yang sama namun parameter berbeda.
   
Dengan memanfaatkan keempat konsep tersebut, program menjadi lebih terstruktur, reusable, fleksibel, dan mudah dikembangkan sesuai prinsip Object-Oriented Programming (OOP).
   





