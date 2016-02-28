package com.map.traveller.travellertheapp;

/**
 * Created by Raviiii on 03-01-2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {

    MediaPlayer ourSong;
    @Override
    protected void onCreate(Bundle TravellerTheApp) {
        // TODO Auto-generated method stub
        super.onCreate(TravellerTheApp);
        setContentView(R.layout.splash);
        ourSong = MediaPlayer.create(Splash.this, R.raw.song);
        ourSong.start();

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);

                }catch(InterruptedException e) {
                    e.printStackTrace();
                }finally{
                    Intent openStartingPoint = new Intent("com.example.map.traveller.travellertheapp.MENU");
                    startActivity(openStartingPoint);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        ourSong.release();
        finish();
    }
}
