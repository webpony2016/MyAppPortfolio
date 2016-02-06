package com.icareu.myappportfolio;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        iniViews();
    }

    private void iniViews() {
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        // Above codes are auto-generated.

        Button btnSpotifyStreamer = (Button)findViewById(R.id.btnSpotifyStreamer);
        Button btnScoresApp = (Button)findViewById(R.id.btnScoresApp);
        Button btnLibraryApp = (Button)findViewById(R.id.btnLibraryApp);
        Button btnBuildItBigger = (Button)findViewById(R.id.btnBuildItBigger);
        Button btnXyzReader = (Button)findViewById(R.id.btnXyzReader);
        Button btnCapstone = (Button)findViewById(R.id.btnCapstone);

        String s = "This button will launch ";
        setButtonClickToast(btnSpotifyStreamer, s + getString(R.string.spotify_streamer));
        setButtonClickToast(btnScoresApp, s + getString(R.string.scores_app));
        setButtonClickToast(btnLibraryApp, s + getString(R.string.library_app));
        setButtonClickToast(btnBuildItBigger, s + getString(R.string.build_it_bigger));
        setButtonClickToast(btnXyzReader, s + getString(R.string.xyz_reader));
        setButtonClickToast(btnCapstone, s + getString(R.string.capstone_my_own_app));
    }

    /**
     * Set the OnClickListener for Buttons to show toast.
     * @param btn Button Object.
     * @param msg The message to be shown.
     */
    private void setButtonClickToast(Button btn, final String msg) {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * Set the OnClickListener for Buttons to start intent.
     * @param btn Button Object.
     * @param intent The intent to be started.
     */
    private void setButtonClickStartIntent(Button btn, final Intent intent) {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Start the Intent
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
