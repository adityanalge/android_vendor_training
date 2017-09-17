package com.aditya.skilldevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Carpeenter extends AppCompatActivity {
    ListView listView;
    Bundle savedInstanceState;
    int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpeenter);
        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[] { "HAMMER",
                "SCREW DRIVER",
                "CHISEL",
                "LEVEL",
                "JACK PLANE",
        };



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                int itemPosition     = position;
                String  itemValue    = (String) listView.getItemAtPosition(position);
                choose(itemPosition);

            }

        });
    }

    public void choose(int position){
        switch (position){
            case 0:{
                Intent in=new Intent(getApplicationContext(),Hammer.class);
                startActivity(in);break;
            }
            case 1:{
                setContentView(R.layout.activity_screw_driver);n=1;break;
            }
            case 2:{
                setContentView(R.layout.activity_chisel);n=1;break;
            }
            case 3:{
                setContentView(R.layout.level);n=1;break;
            }
            case 4:{
                setContentView(R.layout.activity_jack);n=1;break;
            }
        }
    }

    @Override
    public void onBackPressed() {
        if(n!=0) {
            finish();
            Intent in = getIntent();
            startActivity(in);
        }
        else{
            finish();
            Intent in=new Intent(getApplicationContext(),HardSkills.class);
            startActivity(in);
        }
    }
}

