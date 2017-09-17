package com.aditya.skilldevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Hammer extends AppCompatActivity {
    int n=0;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hammer);
        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.hammerlist);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Gripping the hammer",
                "Swinging the hammer",
                "WARNING",
        };



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                int itemPosition = position;
                String itemValue = (String) listView.getItemAtPosition(position);
                switch (itemPosition){
                    case 0:setContentView(R.layout.activity_hammergrip);n=1;break;
                    case 1:setContentView(R.layout.activity_hammerswing);n=1;break;
                    case 2:setContentView(R.layout.activity_hammerwarning);n=1;
                }
            }
        });
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
            Intent in=new Intent(getApplicationContext(),Carpeenter.class);
            startActivity(in);
        }
    }
}
