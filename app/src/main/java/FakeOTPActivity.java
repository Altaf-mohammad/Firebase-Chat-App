package com.example.altaf.camscannerlicense;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

public class FakeOTPActivity extends AppCompatActivity {

    private TextInputLayout otp;
    private Button otp_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_fake_otp );



        otp = (TextInputLayout) findViewById( R.id.otp );
        otp_btn = (Button) findViewById( R.id.otp_btn );

        final String code = otp.getEditText().getText().toString();

        otp_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                    Intent fakeotpintent = new Intent( FakeOTPActivity.this, MainActivity.class );
                    startActivity( fakeotpintent );
                    finish();



            }
            });
        }
    }






