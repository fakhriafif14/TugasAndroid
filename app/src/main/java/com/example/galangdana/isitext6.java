package com.example.pahlawankita505;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class isitext6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isitext6);

        // Inisialisasi TextView untuk menampilkan biografi Kapitan Pattimura
        TextView textKapitanPattimura = findViewById(R.id.isitext6);
        textKapitanPattimura.setText("Kapitan Pattimura, yang memiliki nama asli Thomas Matulessy, adalah seorang pahlawan nasional Indonesia yang dikenal karena perannya dalam memimpin perlawanan rakyat Maluku melawan penjajahan Belanda pada tahun 1817. Ia lahir pada 8 Juni 1783 di Hualoy, Pulau Seram, Maluku, dan berasal dari suku Maluku yang dikenal memiliki semangat juang yang kuat.\n\n" +
                "Latar Belakang Perlawanan\n" +
                "Pada awal abad ke-19, Hindia Belanda (Indonesia) berada di bawah kekuasaan penjajah Belanda, yang memaksa rakyat setempat untuk bekerja sebagai buruh paksa (kerja rodi) dan memberikan berbagai hasil bumi kepada Belanda melalui sistem monopoli. Kehidupan rakyat Maluku sangat tertekan oleh kebijakan-kebijakan ini. Ketidakpuasan masyarakat Maluku mencapai puncaknya ketika pemerintah kolonial Belanda mulai mengabaikan hak-hak mereka dan terus menindas rakyat.\n\n" +
                "Kapitan Pattimura mengorganisir perlawanan bersama dengan sejumlah pemimpin adat dan tokoh masyarakat lainnya. Salah satu peristiwa penting dalam perjuangan ini adalah Penyerangan Benteng Duurstede di Pulau Saparua, yang terjadi pada 16 Mei 1817. Dalam penyerangan ini, pasukan Pattimura berhasil merebut benteng yang dikuasai oleh Belanda dan menewaskan Residen Van den Berg, salah satu pemimpin kolonial Belanda.\n\n" +
                "Pertempuran yang Sengit\n" +
                "Setelah keberhasilan awal, Belanda segera mengirimkan pasukan tambahan untuk menghadapi perlawanan rakyat Maluku. Meskipun pasukan Pattimura dan rakyat Maluku berjuang keras, mereka menghadapi kesulitan karena jumlah senjata dan logistik yang terbatas. Akhirnya, pada akhir tahun 1817, Pattimura ditangkap oleh Belanda setelah seorang pengkhianat memberikan informasi tentang tempat persembunyiannya.\n\n" +
                "Eksekusi dan Warisan\n" +
                "Kapitan Pattimura dijatuhi hukuman mati oleh pemerintah kolonial Belanda dan dieksekusi di tiang gantungan pada 16 Desember 1817. Meskipun gugur, semangat juang dan keberaniannya menjadi inspirasi bagi generasi berikutnya dalam perjuangan melawan penjajah.\n\n" +
                "Pada tahun 1973, Pemerintah Indonesia secara resmi memberikan gelar Pahlawan Nasional kepada Kapitan Pattimura sebagai penghormatan atas jasa-jasanya dalam melawan penjajahan Belanda. Hingga kini, Pattimura dianggap sebagai simbol perlawanan rakyat Maluku terhadap penindasan dan ketidakadilan.\n\n" +
                "Sumber:\n" +
                "1. Kementerian Pendidikan dan Kebudayaan RI. Sejarah Kapitan Pattimura\n" +
                "2. Ensiklopedia Nasional Indonesia (Buku Referensi)");
    }
}
