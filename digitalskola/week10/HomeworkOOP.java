package digitalskola.week10;

public class HomeworkOOP {
    public static void main(String[] args) {
        // Membuat objek/instantiation dari class Employee dan class DataEngineers
        Employee pegawai = new Employee("Rando", 25);
        DataEngineers juniorDE = new DataEngineers("Susandi", 27);
        DataEngineers seniorDE = new DataEngineers("Kiki", 31, 15000000);

        // Memanggil class/static method alamatPerusahaan dari 2 class berbeda tetapi memiliki inheritance
        Employee.alamatPerusahaan();
        DataEngineers.alamatPerusahaan();

        // Memanggil instance/non-static method deskripsi dari 2 class berbeda tetapi memiliki inheritance
        pegawai.deskripsi();
        juniorDE.deskripsi();
        seniorDE.deskripsi();

        // Konsep overloading dengan objek pegawai pada instance method summary pada class Employee
        pegawai.summary();
        pegawai.summary(250000);

        // Konsep overloading dan overriding dengan objek juniorDE pada instance method summary pada class DataEngineers
        juniorDE.summary();
        juniorDE.summary(300000);

        // Konsep overloading dan overriding dengan objek seniorDE pada instance method summary pada class DataEngineers
        seniorDE.summary();
        seniorDE.summary(500000);
    }
}
