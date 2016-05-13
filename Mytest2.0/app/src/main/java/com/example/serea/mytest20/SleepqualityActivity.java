package com.example.serea.mytest20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Serea on 2016/5/10.
 */
public class SleepqualityActivity extends Activity{
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sleepquality_main);

        button1=(Button)findViewById(R.id.buttonback);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SleepqualityActivity.this,PillowactivityActivity.class);
                startActivity(intent);
            }
        });
    }
}

