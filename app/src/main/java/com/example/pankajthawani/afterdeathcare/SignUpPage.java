package com.example.pankajthawani.afterdeathcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pankajthawani.afterdeathcare.R;

public class SignUpPage extends AppCompatActivity {
    TextView t;
    EditText e1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        t=findViewById(R.id.login);
        e1=findViewById(R.id.otp);
        b1=findViewById(R.id.lgnbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              try {
                  if (Register.number.toString().equals(e1.getText().toString()))
                  {
                      Intent intent=new Intent(SignUpPage.this,Dashboard.class);
                      startActivity(intent);
                  }
                  else
                  {
                      Toast.makeText(SignUpPage.this, "Please enter valid OTP", Toast.LENGTH_SHORT).show();
                  }
              }
              catch (Exception e)
              {
                  e.printStackTrace();
              }
            }
        });
}
}
