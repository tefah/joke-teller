package com.tefah.jokedisplaylib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    private String joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        Intent i = getIntent();
        joke = i.getStringExtra("joke");
        TextView jokeTextView = (TextView) findViewById(R.id.jokeTextView);
        jokeTextView.setText(joke);
    }
}
