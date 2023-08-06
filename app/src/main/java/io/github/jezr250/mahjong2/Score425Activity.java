package io.github.jezr250.mahjong2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Score425Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_425);
    }

    public void goToFuCalc4Activity(View view) {
        Intent intent = new Intent(this, FuCalc4Activity.class);
        startActivity(intent);
    }
}