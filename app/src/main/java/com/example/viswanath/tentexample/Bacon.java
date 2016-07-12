package com.example.viswanath.tentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

public class Bacon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);
    }
    public void onAnswer1(View view) {
        Toast.makeText(getApplicationContext(), "it's a different guy - NOAH", Toast.LENGTH_LONG).show();
    }
    public void aClick1(View view){
        Intent j = new Intent(this, MainActivity.class);
        startActivity(j);

    }
}
