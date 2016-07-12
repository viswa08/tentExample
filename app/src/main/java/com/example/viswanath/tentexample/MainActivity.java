package com.example.viswanath.tentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onAnswer(View view){
        Toast.makeText(getApplicationContext(),"Roaster can't do that yet, it's a male!",Toast.LENGTH_LONG).show();


    }

    public void aClick(View view) {
        Intent i = new Intent(this, Bacon.class);
        startActivity(i);
    }
}
