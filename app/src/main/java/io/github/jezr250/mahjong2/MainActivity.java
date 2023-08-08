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
        // ここにプライバシーポリシーへのリンク先の処理を記述します
        // 例えば、ブラウザを開いてプライバシーポリシーページに移動する場合:
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://jezr250.github.io/mjPrivacyPolicy/src/"));
        startActivity(intent);
    }
    public void onStartButtonClicked(View view) {
        Intent intent = new Intent(this, YakuActivity.class);
        startActivity(intent);
    }
}