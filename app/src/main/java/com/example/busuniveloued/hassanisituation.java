package com.example.busuniveloued;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hassanisituation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hassanisituation);

    }
    public void opencbackActivity(View view) {
        Intent intent = new Intent(this, baladiyat.class);
        startActivity(intent);
    }
    public void opencgo01Activity(View view) {
        Intent intent = new Intent(this, hassanigo01.class);
        startActivity(intent);
    }
    public void opencgo02Activity(View view) {
        Intent intent = new Intent(this, hassanigo02.class);
        startActivity(intent);
    }
    public void opencback01Activity(View view) {
        Intent intent = new Intent(this, hassaniback01.class);
        startActivity(intent);
    }
    public void opencback02Activity(View view) {
        Intent intent = new Intent(this, hassaniback02.class);
        startActivity(intent);
    }
    public void opencback03Activity(View view) {
        Intent intent = new Intent(this, hassaniback03.class);
        startActivity(intent);
    }
}