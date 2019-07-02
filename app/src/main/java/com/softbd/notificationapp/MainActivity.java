package com.softbd.notificationapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TITLE = "TITLE";
    private static final String CONTENT = "CONTENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView titleTV = findViewById(R.id.titleTV);
        TextView contentTV = findViewById(R.id.contentTV);

        SharedPreferences preferences = getSharedPreferences("notificationDetails", MODE_PRIVATE);
        titleTV.setText(preferences.getString(TITLE, ""));
        contentTV.setText(preferences.getString(CONTENT, ""));

    }

    /*@Override
    protected void onDestroy() {
        super.onDestroy();
        @SuppressLint("CommitPrefEdits") SharedPreferences.Editor editor = mPreferences.edit();
        editor.clear();
        editor.apply();
        titleTV.setText("");
        contentTV.setText("");
    }*/
}
