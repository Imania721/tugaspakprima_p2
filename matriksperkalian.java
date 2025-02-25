public class matriksperkalian {

    public static void main(String[] args) {

        // Bagian 1 : Inisialisasi Matriks
        int[][] matriks1 = {
            { 7, 8, 9 },
            { 4, 2, 3 },
        }; 

        int[][] matriks2 = {
            { 6, 8 },
            { 5, 7 },
            {11, 12 }
        };

        // Bagian 2: Mendapatkan Dimensi Matriks
        int baris_1 = matriks1.length; // Jumlah baris matriks1
        int kolom1 = matriks1[0].length; // Jumlah kolom matriks1
        int baris2 = matriks2.length; // Jumlah baris matriks2
        int kolom2 = matriks2[0].length; // Jumlah kolom matriks2 

        // Bagian 3: Validasi Syarat Perkalian
        if (kolom1 != baris2) {
            System.out.println("Matriks tidak dapat dikalikan. ");
            return; // Menghentikan program jika syarat tidak terpenuhi
        }

        // Bagian 4: Membuat Matriks Hasil
        int[][] hasil = new int[baris_1][kolom2];

        // Bagian 5: Melakukan Perkalian Matriks
        for (int i = 0; i < baris_1; i++) { // Loop untuk baris matriks1
            for (int j = 0; j < kolom2; j++) { // Loop untuk kolom matriks2
                for (int k= 0; k < kolom1; k++) { // Loop untuk iterasi elemen
                    hasil[i][j] += matriks1[i][k] *matriks2[k][j];
                }
            }
        } 

        // Bagian 6: Menampilkan Hasil
        System.out.println("Hasil perkalian matriks "); // Mencetak hasil perkalian matriks
        for (int i = 0; i < baris_1; i++) {
            for (int j= 0; j < kolom2; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println(); // Pindah baris setelah setiap baris matriks ditampilkan
        }
    }
}

       
