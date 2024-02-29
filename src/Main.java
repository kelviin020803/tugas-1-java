import java.util.Scanner;

public class main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            // tampilan login
            System.out.println("Pilih jenis login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("masukkkan pilihan :");
            int pilihan = scanner.nextInt();

            // Memproses pilihan login
            switch (pilihan) {
                case 1:
                    isLoggedIn = loginAdmin();
                    break;
                case 2:
                    isLoggedIn = loginMahasiswa();
                    break;
                default:
                    System.out.println("Pilihan yang anda pilih tidak tersedia !");
            }

            // Keluar dari loop jika login berhasil
            if (isLoggedIn) {
                System.out.println("Login telah berhasil!");
                break;
            }
        }

        // Tampilkan menu utama
        // ...
    }

    private static boolean loginAdmin() {
        // input username dan password
        System.out.print("Masukkan username: ");
        String username = scanner.next();
        System.out.print("Masukkan password: ");
        String password = scanner.next();

        // Memvalidasi username dan password
        return "admin".equals(username) && "password".equals(password);
    }

    private static boolean loginMahasiswa() {
        // inputan NIM
        System.out.print("Masukkan NIM: ");
        String nim = scanner.next();

        // Memvalidasi panjang NIM
        if (nim.length() != 15) {
            System.out.println("Panjang NIM tidak valid!");
            return false;
        }

        // Memproses login
        return true;
    }
}