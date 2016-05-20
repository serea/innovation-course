package com.example.serea.mytest20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Serea on 2016/5/10.
 */
public class Page1Activity extends Activity{
    private Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1_main);
        //turn to other pages for instance, it should be connect to bluetooth
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Page1Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        button2 = (Button)findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Page1Activity.this,PillowactivityActivity.class);
                startActivity(intent);
            }
        });

    }
}

