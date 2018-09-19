package com.example.eddy.teamscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class WinnerActivity extends AppCompatActivity {

    private TextView Winview;
    String winner;
    String diffpoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);

        Winview = findViewById(R.id.winnerView);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        winner = extras.getString("winner");
        diffpoints = extras.getString("diffpoints");
        Winview.setText(winner+" won by "+diffpoints+" points.");


    }
}
