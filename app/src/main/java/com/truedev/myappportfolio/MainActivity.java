package com.truedev.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getString(R.string.capstone_app));

        findViewById(R.id.bScoresApp).setOnClickListener(this);
        findViewById(R.id.bLibraryApp).setOnClickListener(this);
        findViewById(R.id.bBuildBigger).setOnClickListener(this);
        findViewById(R.id.bCapstone).setOnClickListener(this);
        findViewById(R.id.bXYZReader).setOnClickListener(this);
        findViewById(R.id.bSpotify).setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bSpotify:
                Toast.makeText(this, getString(R.string.message_spotify), Toast.LENGTH_SHORT).show();
                break;

            case R.id.bBuildBigger:
                Toast.makeText(this, getString(R.string.buildItBigger), Toast.LENGTH_SHORT).show();
                break;

            case R.id.bCapstone:
                Toast.makeText(this, getString(R.string.capstone_app), Toast.LENGTH_SHORT).show();
                break;

            case R.id.bScoresApp:
                Toast.makeText(this, getString(R.string.scores_app), Toast.LENGTH_SHORT).show();
                break;

            case R.id.bLibraryApp:
                Toast.makeText(this, getString(R.string.library_app), Toast.LENGTH_SHORT).show();
                break;

            case R.id.bXYZReader:
                Toast.makeText(this, getString(R.string.xyz_reader), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
