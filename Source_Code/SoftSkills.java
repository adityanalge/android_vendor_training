package com.aditya.skilldevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SoftSkills extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soft_skills);
    }

    public void greetings(View view) {
        Intent in=new Intent(getApplicationContext(),communication.class);
        startActivity(in);
    }

    public void bodyl(View view) {
        setContentView(R.layout.activity_body);
    }

    public void gesture(View view) {
        setContentView(R.layout.activity_gestures);
    }

    public void disci(View view) {
        setContentView(R.layout.activity_discipline);
    }
}
