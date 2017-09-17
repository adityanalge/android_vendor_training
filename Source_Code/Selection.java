package com.aditya.skilldevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }

    public void Soft(View view) {
        Toast.makeText(getApplicationContext(),"You selected Soft skills",Toast.LENGTH_SHORT).show();
        Intent in= new Intent(getApplication(),SoftSkills.class);
        startActivity(in);
    }
    @Override
    public void onBackPressed() {
        return;
    }
    public void hard(View view) {
        Toast.makeText(getApplicationContext(),"You selected Hard skills",Toast.LENGTH_SHORT).show();
        Intent in= new Intent(getApplication(),HardSkills.class);
        startActivity(in);
    }

}
