public class TicTacToe { //Membuat kelas bernama TicTacToe
    public static void main(String[] args) { //Metode utama yang akan dijalankan pertama kali
        char[][] papan = new char[3][3]; //Membuat array 2D ukuran 3x3 untuk menyimpan simbol permainan ('X', 'O', atau '-').

        // Inisialisasi papan kosong
        for (int i = 0; i < 3; i++) { //Mengakses setiap baris dari papan
            for (int j = 0; j < 3; j++) { //Mengakses setiap kolom dalam baris i
                papan[i][j] = '-'; // Mengisi seluruh papan dengan simbol '-' untuk menandakan bahwa kotak masih kosong.
            }
        }

        // Simulasi beberapa langkah
        papan[0][0] = 'X'; //Pemain pertama meletakkan 'X' di baris 0, kolom 0
        papan[1][1] = 'O'; //Pemain kedua meletakkan 'O' di baris 1, kolom 1
        papan[2][2] = 'X'; //Pemain pertama kembali meletakkan 'X' di baris 2, kolom 2

        // Tampilkan papan
        System.out.println("Status Papan:"); //Menampilkan teks sebelum mencetak papan
        tampilkanPapan(papan); //Memanggil metode tampilkanPapan untuk mencetak isi papan
    }

    public static void tampilkanPapan(char[][] papan) { //Metode ini digunakan untuk mencetak papan permainan.
        for (int i = 0; i < 3; i++) { // Mengakses setiap baris papan
            for (int j = 0; j < 3; j++) { //Mengakses setiap elemen dalam baris
                System.out.print(papan[i][j] + " "); //Mencetak setiap elemen di baris i, dipisahkan dengan spasi
            }
            System.out.println(); //Pindah ke baris baru setelah mencetak satu baris lengkap
        }
    }
}
