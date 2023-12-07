package com.example.rpl;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi tampilan
        ImageView imageViewProfile = findViewById(R.id.imageViewProfile);
        Button buttonHome = findViewById(R.id.buttonHome);
        Button buttonSearch = findViewById(R.id.buttonSearch);
        Button buttonAccount = findViewById(R.id.buttonAccount);
        Button buttonSettings = findViewById(R.id.buttonSettings);

        // Tambahkan logika sesuai kebutuhan Anda
        // Contoh: Setelah tombol Home ditekan, lakukan sesuatu
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Logika untuk tombol Home
            }
        });

        // Tambahkan logika sesuai kebutuhan Anda
        // Contoh: Setelah tombol Search ditekan, lakukan sesuatu
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Logika untuk tombol Search
            }
        });

        // Tambahkan logika sesuai kebutuhan Anda
        // Contoh: Setelah tombol Account ditekan, lakukan sesuatu
        buttonAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Logika untuk tombol Account
            }
        });

        // Tambahkan logika sesuai kebutuhan Anda
        // Contoh: Setelah tombol Settings ditekan, lakukan sesuatu
        buttonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Logika untuk tombol Settings
            }
        });
    }
}
