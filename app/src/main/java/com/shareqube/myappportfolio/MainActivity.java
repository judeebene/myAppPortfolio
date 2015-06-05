package com.shareqube.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  spotify_app_btn = (Button) findViewById(R.id.spotify_app_btn_id) ;
        spotify_app_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this , "This Button will launch Spotify  Streamer App", Toast.LENGTH_LONG).show();
            }
        });

        Button  scores_app_btn = (Button) findViewById(R.id.scores_app_btn_id) ;
        scores_app_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this , "This Button will launch Scores App", Toast.LENGTH_LONG).show();
            }
        });

        Button  library_app_btn = (Button) findViewById(R.id.library_app_btn_id) ;
        library_app_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this , "This Button will launch Library App", Toast.LENGTH_LONG).show();
            }
        });

        Button  builtbigger_app_btn = (Button) findViewById(R.id.build_bigger_app_btn_id) ;
        builtbigger_app_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this , "This Button will launch Built it Bigger App", Toast.LENGTH_LONG).show();
            }
        });

        Button  reader_app_btn = (Button) findViewById(R.id.reader_app_btn_id) ;
        reader_app_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this , "This Button will launch XYZ Reader App", Toast.LENGTH_LONG).show();
            }
        });

        Button  myown_app_btn = (Button) findViewById(R.id.my_own_app_btn_id) ;
        myown_app_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this , "This Button will launch Capstone:My Custom App", Toast.LENGTH_LONG).show();
            }
        });

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
