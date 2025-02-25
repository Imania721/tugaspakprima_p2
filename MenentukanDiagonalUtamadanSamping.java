public class MenentukanDiagonalUtamadanSamping { //membuat kelas dengan nama tersebut
    public static void main(String[] args) { // mendeklarasikan metode utama yang akan di eksekusi
        int[][] matriks = { // mendeklarasikan array 2 dimensi berukuran 3x3
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = matriks.length; // mengambil ukuran baris dari matriks 

        System.out.println("Matriks:"); // Mencetak matriks sebagai label  
        for (int i = 0; i < n; i++) { //2perulangan for digunakan untuk menampilkan isi matriks
            for (int j = 0; j < n; j++) {
                System.out.print(matriks[i][j] + " "); //mencetak elemen matriks di baris yang sama
            }
            System.out.println(); // berpindah ke baris baru setelah mencetak satu baris matriks
        }

        System.out.print("Diagonal Utama: "); // Menentukan diagonal utama dan diagonal samping
        for (int i = 0; i < n; i++) { //
            System.out.print(matriks[i][i] + " ");
        }

        System.out.println(); // berpindah ke baris baru setelah mencetak satu baris matriks
        System.out.print("Diagonal Samping: ");
        for (int i = 0; i < n; i++) { 
            System.out.print(matriks[i][n - 1 - i] + " "); ////menampilkan elemen diagonal samping yang berada di baris i dan kolom n-1-i
        }
    }
}
