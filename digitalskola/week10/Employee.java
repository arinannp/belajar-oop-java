package digitalskola.week10;

public class Employee {
    // Variabel perusahaan, pendapatan dan lembur adalah class attributes yang bisa diakses oleh static dan non-static method
    public static String perusahaan = "E-Commerce";
    public static int pendapatan = 5000000;
    public static int lembur = 250000;
    // Variabel nama dan usia adalah instance attributes yang hanya bisa diakses oleh non-static method/instance method
    public String nama;
    public int usia;

    // Constructor class Employee menerima 2 parameter nama dan usia
    public Employee(String nama, int usia) {
        // Constructor digunakan untuk inisialisasi value, yang di inisiate saat melakukan instantiation
        this.nama = nama;
        this.usia = usia;
    }

    // Method alamatPerusahaan merupakan static method/class method (tidak bisa akses instance attributes)
    public static void alamatPerusahaan() {
        System.out.println("Karyawan bekerja di Perusahaan " + Employee.perusahaan + " yang beralamat di Jalan Astangkuri Jakarta");
    }

    // Method deskripsi merupakan non-static method/instance method milik class Employee
    public void deskripsi() {
        System.out.println(this.nama + " bekerja di Perusahaan " + Employee.perusahaan + " dengan usia " + this.usia + " tahun");
    }

    // Method summary merupakan non-static method/instance method milik class Employee
    public void summary() {
        System.out.println(this.nama + " usia " + this.usia + " tahun bekerja di Perusahaan " + Employee.perusahaan);
        System.out.println("Memiliki total gaji " + (Employee.pendapatan + Employee.lembur));
    }

    // Method summary merupakan non-static method/instance method milik class Employee yang menerima parameter tambahanProyek
    public void summary(int tambahanProyek) {
        System.out.println(this.nama + " usia " + this.usia + " tahun bekerja di Perusahaan " + Employee.perusahaan);
        System.out.println("Memiliki total gaji " + (Employee.pendapatan + Employee.lembur + tambahanProyek));
    }
    // Method summary() dan summary(int tambahanProyek) merupakan konsep overloading
}