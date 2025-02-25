public class SistemNilai { //menjelaskan nama file
    public static void main(String[] args) { //metode utama tempat program di mulai
        // Data siswa
        String[] namaSiswa = {"Ani", "Budi", "Cici", "Dodi", "Edi"}; // menyimpan nama siswa
        int[][] nilai = { // menyimpan nilai siswa dalam benruk array dus dimensi
            {80, 85, 90}, // Nilai Ani
            {75, 70, 85}, // Nilai Budi
            {85, 80, 88}, // Nilai Cici
            {90, 85, 95}, // Nilai Dodi
            {70, 75, 80}  // Nilai Edi
        };
        String[] mapel = {"Matematika", "Bahasa Inggris", "IPA"}; // menyimpan nama mapel

        // Menghitung rata-rata per siswa
        System.out.println("Rata-rata nilai per siswa:"); //mencetak judul hasil rata-rata nilai siswa
        for (int i = 0; i < nilai.length; i++) { //mengulang setiap siswa
            double total = 0; //varaiabel untuk mentotal nilai
            for (int n : nilai[i]) { //Menjumlahkan semua nilai siswa i
                total += n; 
            }
            double rataSiswa = total / nilai[i].length; // Menghitung rata-rata nilai
            System.out.printf("%s: %.2f\\n", namaSiswa[i], rataSiswa); //Mencetak hasil rata-rata dengan format 2 angka di belakang koma
        }

        // Menghitung rata-rata per mata pelajaran
        System.out.println("\\nRata-rata nilai per mata pelajaran:");
        for (int j = 0; j < nilai[0].length; j++) { //Mengulang setiap mata pelajaran
            double total = 0;
            for (int i = 0; i < nilai.length; i++) { // Menjumlahkan nilai semua siswa pada mata pelajaran j
                total += nilai[i][j];
            }
            double rataMapel = total / nilai.length; //Menghitung rata-rata nilai untuk mata pelajaran j
            System.out.printf("%s: %.2f\\n", mapel[j], rataMapel); //Mencetak hasil rata-rata mata pelajaran
        }
    }
}
