package io.github.jezr250.mahjong2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openPrivacyPolicy(View view) {
        Intent intent = new Intent(this, PrivacyPolicyActivity.class);
        startActivity(intent);
    }
    public void onStartButtonClicked(View view) {
        Intent intent = new Intent(this, YakuActivity.class);
        startActivity(intent);
    }
}