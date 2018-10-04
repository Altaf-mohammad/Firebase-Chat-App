package com.example.altaf.camscannerlicense;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class SpamActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_spam );

        mToolbar = (Toolbar) findViewById( R.id.spam_appBar );
        setSupportActionBar( mToolbar );
        getSupportActionBar().setTitle("Feedback");
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        button2 = (Button)findViewById( R.id.button2 );
        button2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent butto = new Intent( SpamActivity.this,FakeOTPActivity.class );
                startActivity( butto );
                finish();
            }
        } );

        Fragment fragment = new SettingsScreen();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        if (savedInstanceState == null){
            fragmentTransaction.add( R.id.relativelayout, fragment,"Settings_fragment" );
            fragmentTransaction.commit();
        }else {
            fragment = getFragmentManager().findFragmentByTag("Settings_fragment");
        }
    }

    public static class SettingsScreen extends PreferenceFragment{
        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate( savedInstanceState );
            addPreferencesFromResource( R.xml.settings_screen );
            addPreferencesFromResource( R.xml.settings_screen2);
        }
    }
}
