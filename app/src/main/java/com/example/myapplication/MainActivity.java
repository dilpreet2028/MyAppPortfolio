package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void spotifyBtn(View view){
        createToast("Spotify Streamer");
    }
    public void scoresBtn(View view){
        createToast("Football Scores");
    }
    public void libraryBtn(View view){
        createToast("Library");
    }
    public void buildItBtn(View view){
       createToast("Build It Bigger");
    }
    public void xyzBtn(View view){
        createToast("XYZ Reader");
    }
    public void capstoneBtn(View view){
        createToast("Capstone");
    }

    private void createToast(String name){
          Toast.makeText(MainActivity.this, "This button will launch my "+name+" app!", Toast.LENGTH_SHORT).show();
    }

}
