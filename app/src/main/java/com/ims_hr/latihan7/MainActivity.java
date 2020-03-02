package com.ims_hr.latihan7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText E_Panjang;
    EditText E_Lebar;
    EditText E_Password;
    Button B_Hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inisial();
        Listen_B_Hitung();
    }

    private void Inisial() {
        E_Panjang = findViewById(R.id.editText_Main_Panjang);
        E_Lebar = findViewById(R.id.editText_Main_Lebar);
        E_Password = findViewById(R.id.editText_Main_Password);
        B_Hitung = findViewById(R.id.button_Main_Hitung);
    }

    private void Listen_B_Hitung() {
        B_Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Password = E_Password.getText().toString();
                if(!Password.equals("1234")) {
                    Toast.makeText(MainActivity.this, "Password anda salah", Toast.LENGTH_SHORT).show();
                    return;
                }
                Integer Panjang = Integer.parseInt(E_Panjang.getText().toString());
                Integer Lebar = Integer.parseInt((E_Lebar.getText().toString()));
                Integer Luas = Panjang * Lebar;
                Integer Kell = 2 *(Panjang + Lebar);
                String Pesan = "Luas persegi adalah: " + Luas + " dan keliling persegi adalah: " + Kell;
                Toast.makeText(MainActivity.this, Pesan, Toast.LENGTH_LONG).show();
            }
        });
    }

}
