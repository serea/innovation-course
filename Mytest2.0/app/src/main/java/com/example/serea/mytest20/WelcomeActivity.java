package com.example.serea.mytest20;

import android.app.Activity;
import android.content.Intent;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Serea on 2016/5/10.
 */
public class WelcomeActivity extends Activity{
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            Intent intent=new Intent(WelcomeActivity.this,Page1Activity.class);
            startActivity(intent);
            WelcomeActivity.this.finish();
        }
    };
}
