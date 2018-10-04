package com.example.altaf.camscannerlicense;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private Button regbtn;
    private Button logbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_welcome );

        regbtn = (Button)findViewById( R.id.welcome_reg_btn );
        logbtn = (Button)findViewById( R.id.welcome_login_btn );
        regbtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg_intent =new Intent(WelcomeActivity.this,RegisterActivity.class);
                startActivity(reg_intent);
            }
        } );
        logbtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log_intent =new Intent(WelcomeActivity.this,LoginActivity.class);
                startActivity(log_intent);
            }
        } );
    }
}
