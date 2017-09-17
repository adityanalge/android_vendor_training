package com.aditya.skilldevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class HardSkills extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_skills);
    }

    public void carpenter(View view){
        Intent in= new Intent(getApplication(),Carpeenter.class);
        startActivity(in);
    }

    public void painter(View view){
        Intent in=new Intent(getApplicationContext(),Painter.class);
        startActivity(in);

    }

    public void plumer(View view){
        Intent in=new Intent(getApplicationContext(),Plummer.class);
        startActivity(in);

    }

    public void elecric(View view) {
        Intent in=new Intent(getApplicationContext(),Electric.class);
        startActivity(in);
    }
}
