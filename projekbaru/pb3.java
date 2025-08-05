package projekbaru;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author PC 12 - LAB R1
 */
public class pb3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // buat objek dari InputStreamReader
        InputStreamReader ireader = new InputStreamReader(System.in);

        // buat objek BufferedReader
        BufferedReader breader = new BufferedReader(ireader);

        System.out.print("Nama Depan: ");
        // membaca inputan user
        String namaDepan = breader.readLine();

        System.out.print("Nama Belakang: ");
        // membaca inputan user
        String namaBelakang = breader.readLine();

        System.out.println("Nama Saya adalah: " + namaDepan + " " + namaBelakang);
    }
}
