package com.example.android.javajokeandroidlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Flavio on 3/13/2016.
 */
public class JokeActivity extends AppCompatActivity {

    public static final String INTENT_JOKE_KEY = "JOKE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_joke);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
        {
            TextView txtJoke = (TextView)findViewById(R.id.txtJoke);
            txtJoke.setText(bundle.getString(INTENT_JOKE_KEY));
        }
    }

}