package com.example.busuniveloued;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ghamrasituation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghamrasituation);

    }
    public void opencbackActivity(View view) {
        Intent intent = new Intent(this, baladiyat.class);
        startActivity(intent);
    }
    public void opencgo01Activity(View view) {
        Intent intent = new Intent(this, ghamrago01.class);
        startActivity(intent);
    }
    public void opencgo02Activity(View view) {
        Intent intent = new Intent(this, ghamrago02.class);
        startActivity(intent);
    }
    public void opencback01Activity(View view) {
        Intent intent = new Intent(this, ghamraback01.class);
        startActivity(intent);
    }
    public void opencback02Activity(View view) {
        Intent intent = new Intent(this, ghamraback02.class);
        startActivity(intent);
    }
    public void opencback03Activity(View view) {
        Intent intent = new Intent(this, ghamraback03.class);
        startActivity(intent);
    }
}