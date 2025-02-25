public class TransposeMatrix { //Membuat kelas yang akan menstransposisi matriks
    public static int[][] transposeMatrix(int[][] matrix) { //Mendefinisikan metode TM YG mnrima sebuah mtriks sbgai input dan mengembalikan matriks hasil trsnposisi
        int rows = matrix.length; //Mengambil jumlah baris dari matriks
        int cols = matrix[0].length; // mengambil jumlah kolom dari matriks
        int[][] transposed = new int[cols][rows]; // Membuat matriks baru untuk hasil transposisi di balik (baris menjadi kolom,kolom jadi baris)

        for (int i = 0; i < rows; i++) { //
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j]; //memindahkan elemen dari (i,j) matriks asli ke posisi (j,i)di matriks hasil
            }
        }
        return transposed; // mengembalikan matriks yang sudah di transposisi ke fungsi yang memanggil
    }

    public static void main(String[] args) { //menjalankan kode program
        int[][] matrix = { //membuat matriks awal berukuran 3x3
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] result = transposeMatrix(matrix); //memanggil fungsi TM untuk menstransposisikan matriks awal
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " "); // menampilkan angka di layar
            }
            System.out.println(); //pindah ke baris baru setelah mencetak satu baris matriks
        }
    }
}