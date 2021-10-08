package Abstrak;

public class SistemDaftarGajiTest {
    public static void main(String[] args) {
        Pegawai[] pegawai = { new GajiPegawai("John", "Smith", "111-11-1111", 800.00),
                new GajiPerJam("Karen", "Price", "222-22-2222", 16.75, 40.0),
                new KomisiPegawai("Sue", "Jones", "333-33-3333", 10000, .06),
                new GajiPlusKomisiPegawai("Bob", "Lewis", "444-44-4444", 5000, .04, 300) };

        for (Pegawai pegawaiSekarang : pegawai)
            System.out.printf("%s%n%s%.2f%n%n", pegawaiSekarang, "Pendapatan :", pegawaiSekarang.getJumlahPembayaran());
    }
}
