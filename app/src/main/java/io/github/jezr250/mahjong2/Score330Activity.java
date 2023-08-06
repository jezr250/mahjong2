package io.github.jezr250.mahjong2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Score330Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_330);
    }

    public void goToFuCalc3Activity(View view) {
        Intent intent = new Intent(this, FuCalc3Activity.class);
        startActivity(intent);
    }
}
