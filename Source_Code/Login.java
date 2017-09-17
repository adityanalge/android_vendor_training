package com.aditya.skilldevelopment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPREFERENCE", MODE_PRIVATE);
        String s=pref.getString("state", "not registered");
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
    }
    public void check(View view) {
        EditText UserName=(EditText) findViewById(R.id.checkname);
        EditText PassWord=(EditText) findViewById(R.id.checkpass);
        String username=UserName.getText().toString();
        String password=PassWord.getText().toString();
        if (username.length() != 0 && password.length() !=0 ) {
            SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPREFERENCE", MODE_PRIVATE);
            String cuser=pref.getString("user", "not registered");
            String cpass=pref.getString("pass","not registered");
            if(cuser=="not registered" || cpass=="not registered"){
                Toast.makeText(getApplicationContext(),"PLEASE REGISTER FIRST",Toast.LENGTH_SHORT).show();
                Intent in=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
            else {
                if (username != cuser && password != cpass) {
                    Toast.makeText(getApplicationContext(),"Login successfull",Toast.LENGTH_SHORT).show();
                    Intent in=new Intent(getApplicationContext(),Selection.class);
                    startActivity(in);
                    Intent current=getIntent();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid username/password",Toast.LENGTH_SHORT).show();
                    }
            }
        } else {
            Toast.makeText(getApplicationContext(), "one or more field missing", Toast.LENGTH_LONG).show();
        }

    }
}
