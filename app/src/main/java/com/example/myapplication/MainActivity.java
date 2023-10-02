package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
          private TextView tv;
          private EditText et1;
          private EditText et2;
          private Button bu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         tv=findViewById(R.id.CountryName);
        et1=findViewById(R.id.emailinput);
        et2=findViewById(R.id.passwordinput);
    }

    public void ChangeText(View view) {
        int id=view.getId();
        if(id==R.id.loginbutton){
            String login=et1.getText().toString();
            String pasword=et2.getText().toString();
            if(login.isEmpty()){
                et1.setError("your field must be fillup");
            }else if(pasword.isEmpty()){
                et2.setError("password mustbe fillup");
            }else {
                if(login.equals(Constant.USER.EMAIL)&&pasword.equals(Constant.USER.PASSWORD)){
                    Toast.makeText(this, "Welcome", Toast.LENGTH_LONG).show();
                    tv.setText("");
                    et1.setText("");
                }else {
                    Toast.makeText(this, "invaild email or password", Toast.LENGTH_LONG).show();
                }
            }
        }else{
            finish();
        }


    }
}