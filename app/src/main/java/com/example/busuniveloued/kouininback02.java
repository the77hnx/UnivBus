package com.example.busuniveloued;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kouininback02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kouininback02);

    }
    public void opencbackActivity(View view) {
        Intent intent = new Intent(this, kouininsituation.class);
        startActivity(intent);
    }
}