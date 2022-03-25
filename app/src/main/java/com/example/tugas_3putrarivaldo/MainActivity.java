package com.example.tugas_3putrarivaldo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_depan);

    }

    public void clickRS(View view) {
        //icon RS di tekan
        Intent i = new Intent(this, RS.class);
        startActivity(i);
    }
}

