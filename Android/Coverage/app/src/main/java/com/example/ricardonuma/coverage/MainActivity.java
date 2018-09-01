package com.example.ricardonuma.coverage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.hide).setOnClickListener(this);
        text = (TextView) findViewById(R.id.text);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            text.setText("Hello World!");
        } else {
            v.setVisibility(View.GONE);
        }
    }
}