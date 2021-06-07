package com.example.appdoctruyen_master;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ManNoiDungTruyen extends AppCompatActivity {

    TextView txtTenTruyen,txtNoidung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_noi_dung_truyen);

        txtNoidung = findViewById(R.id.NoiDung);
        txtTenTruyen = findViewById(R.id.TenTruyen);
        Intent intent = getIntent();
       String tenTruyen = intent.getStringExtra("tentruyen");
       String noidung = intent.getStringExtra("noidung");

       txtTenTruyen.setText(tenTruyen);
       txtNoidung.setText(noidung);

       txtNoidung.setMovementMethod(new ScrollingMovementMethod());

    }
}