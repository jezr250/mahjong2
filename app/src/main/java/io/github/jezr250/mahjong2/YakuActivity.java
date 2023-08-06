package io.github.jezr250.mahjong2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.content.Intent;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class YakuActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button decisionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yaku);

        spinner = findViewById(R.id.spinnerYaku);
        decisionButton = findViewById(R.id.buttonDecision);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.yaku_array,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        // Spinnerの選択リスナーを設定
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // 選択された項目に応じて決定ボタンのクリックリスナーを設定
                setDecisionButtonClickListener(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // 何もしない
            }
        });
    }

    // 決定ボタンのクリックリスナーを設定するメソッド
    private void setDecisionButtonClickListener(int position) {
        decisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 選択された項目に応じて遷移先のクラスを決定して遷移
                switch (position) {
                    case 0:
                        // 1役の場合の遷移処理
                        Intent intent1 = new Intent(YakuActivity.this, FuCalcActivity.class);
                        startActivity(intent1);
                        break;
                    case 1:
                        // 2役の場合の遷移処理
                        Intent intent2 = new Intent(YakuActivity.this, FuCalc2Activity.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        // 3役の場合の遷移処理
                        Intent intent3 = new Intent(YakuActivity.this, FuCalc3Activity.class);
                        startActivity(intent3);
                        break;
                    case 3:
                        // 4役の場合の遷移処理
                        Intent intent4 = new Intent(YakuActivity.this, FuCalc4Activity.class);
                        startActivity(intent4);
                        break;
                    case 4:
                        // 5役の場合の遷移処理
                        Intent intent5 = new Intent(YakuActivity.this, ScoreManganActivity.class);
                        startActivity(intent5);
                        break;
                    case 5:
                        // 6役の場合の遷移処理
                        Intent intent6 = new Intent(YakuActivity.this, ScoreHanemanActivity.class);
                        startActivity(intent6);
                        break;
                    case 6:
                        // 7役の場合の遷移処理
                        Intent intent7 = new Intent(YakuActivity.this, ScoreHanemanActivity.class);
                        startActivity(intent7);
                        break;
                    case 7:
                        // 8役の場合の遷移処理
                        Intent intent8 = new Intent(YakuActivity.this, ScoreBaimanActivity.class);
                        startActivity(intent8);
                        break;
                    case 8:
                        // 9役の場合の遷移処理
                        Intent intent9 = new Intent(YakuActivity.this, ScoreBaimanActivity.class);
                        startActivity(intent9);
                        break;
                    case 9:
                        // 10役の場合の遷移処理
                        Intent intent10 = new Intent(YakuActivity.this, ScoreBaimanActivity.class);
                        startActivity(intent10);
                        break;
                    case 10:
                        // 11役の場合の遷移処理
                        Intent intent11 = new Intent(YakuActivity.this, ScoreSanbaiActivity.class);
                        startActivity(intent11);
                        break;
                    case 11:
                        // 12役の場合の遷移処理
                        Intent intent12 = new Intent(YakuActivity.this, ScoreSanbaiActivity.class);
                        startActivity(intent12);
                        break;
                    case 12:
                        // 11役の場合の遷移処理
                        Intent intent13 = new Intent(YakuActivity.this, ScoreYakumanActivity.class);
                        startActivity(intent13);
                        break;

                }
            }
        });

    }
    public void goToMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}





