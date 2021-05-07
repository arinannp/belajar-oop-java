package digitalskola.week10;

// Class DataEngineers merupakan inheritance dari class Employee,
// Sehingga semua attribute dan method dari class Employee juga dimiliki oleh class DataEngineers
public class DataEngineers extends Employee {
    // Inisialisasi class attributes pendapatan dan lembur milik class DataEngineers
    public static int pendapatan = 7000000;
    public static int lembur = 500000;
    // Inisialisasi instance attribute pendapatanTambahan milik class DataEngineers
    public int pendapatanTambahan;

    // Constructor class DataEngineers menerima 2 parameter nama dan usia
    public DataEngineers(String nama, int usia) {
        super(nama, usia);
        this.pendapatanTambahan = 0;
    }

    // Constructor class DataEngineers menerima 3 parameter nama, usia dan pendapatanTambahan
    public DataEngineers(String nama, int usia, int pendapatanTambahan) {
        super(nama, usia);
        this.pendapatanTambahan = pendapatanTambahan;
    }
    // Class DataEngineers bisa memiliki 2 constructor dengan parameter berbeda yang merupakan konsep overloading

    // Melakukan overriding pada method summary sehingga saat objek dari class DataEngineers dibuat,
    // Maka tidak akan me-refer lagi method summary() pada class Employee
    @Override
    public void summary() {
        System.out.println(this.nama + " usia " + this.usia + " tahun bekerja di Perusahaan " + perusahaan);
        System.out.println("Memiliki total gaji " + (DataEngineers.pendapatan + DataEngineers.lembur));
    }

    // Melakukan overriding pada method summary dengan parameter tambahanProyek, sehingga saat objek dari class DataEngineers dibuat,
    // Maka tidak akan me-refer lagi method summary(int tambahanProyek) pada class Employee
    @Override
    public void summary(int tambahanProyek) {
        System.out.println(this.nama + " bekerja di Perusahaan " + perusahaan + " sebagai Data Engineer");
        System.out.println("Memiliki total gaji " + (DataEngineers.pendapatan + DataEngineers.lembur + this.pendapatanTambahan + tambahanProyek));
    }
}
