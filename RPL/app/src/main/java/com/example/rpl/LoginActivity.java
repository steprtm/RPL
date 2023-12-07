package com.example.rpl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText etEmail, etPassword;
    private Button btnLogin, btnLoginAsGuest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Inisialisasi tampilan
        etEmail = findViewById(R.id.editTextEmail);
        etPassword = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.buttonLogin);
        btnLoginAsGuest = findViewById(R.id.buttonLoginAsGuest);

        // Memberi aksi pada tombol login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                // Lakukan verifikasi login sesuai kebutuhan Anda
                // Misalnya, Anda dapat membandingkan email dan password dengan yang disimpan di server
                // Jika login berhasil, lakukan navigasi ke halaman berikutnya
                // Contoh navigasi ke MainActivity:
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Menutup activity login agar tidak dapat kembali ke halaman login
            }
        });

        // Memberi aksi pada tombol login as guest
        btnLoginAsGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Jika tombol login as guest ditekan, lakukan aksi yang sesuai
                // Misalnya, navigasi ke halaman utama tanpa verifikasi login
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Menutup activity login agar tidak dapat kembali ke halaman login
            }
        });
    }
}
