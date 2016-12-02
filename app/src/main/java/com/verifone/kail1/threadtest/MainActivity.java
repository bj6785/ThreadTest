package com.verifone.kail1.threadtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)  findViewById(R.id.mytext);
        Button button = (Button) findViewById(R.id.change_button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.change_button: {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        tv.setText("Hello Hell!!");
                    }
                }).start();
                break;
            }
            default:
                break;
        }
    }
}
