package com.aditya.skilldevelopment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText UserName,PassWord,Email,Mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //new Calldb("username","password","email","mobileno").execute();
        Context context = getApplicationContext();
        SharedPreferences sharedpreferences = getSharedPreferences("MyPREFERENCE", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString("state", "Started");
        editor.commit();

    }

    public void registering(View view) {
        UserName=(EditText) findViewById(R.id.editname);
        PassWord=(EditText) findViewById(R.id.editpass);
        Email=(EditText) findViewById(R.id.editmail);
        Mobile=(EditText)findViewById(R.id.editno);
        String username=UserName.getText().toString();
        String password=PassWord.getText().toString();
        String email=Email.getText().toString();
        String mobileno=Mobile.getText().toString();
        if (username.length() != 0 && password.length() !=0 && email.length() !=0 && mobileno.length() !=0 ) {
            if(password.length()<8 && password.length()<11){
                SharedPreferences sharedpreferences = getSharedPreferences("MyPREFERENCE", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("user", username);
                editor.putString("pass", password);
                editor.putString("state","registered");
                editor.commit();
                Intent in= new Intent(getApplicationContext(),Login.class);
                startActivity(in);
            }
            else{
                Toast.makeText(getApplicationContext(), "password lengt must be 8 character to 10 char", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(getApplicationContext(), "one or more field missing", Toast.LENGTH_LONG).show();
        }
    }

    public void logging(View view) {

        Intent in=new Intent(getApplicationContext(),Login.class);
        startActivity(in);

    }
}

