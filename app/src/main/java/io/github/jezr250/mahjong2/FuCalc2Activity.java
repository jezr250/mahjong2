package io.github.jezr250.mahjong2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.content.Intent;
import android.widget.CheckBox;
import android.widget.Toast;

public class FuCalc2Activity extends AppCompatActivity {

    private TextView textViewTotalFu;
    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
    private RadioGroup radioGroup3;
    private RadioGroup radioGroup4;
    private RadioGroup radioGroup5;
    private RadioGroup radioGroup6;
    private RadioGroup radioGroup7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fu_calc2);

        textViewTotalFu = findViewById(R.id.textViewTotalFu);
        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup3 = findViewById(R.id.radioGroup3);
        radioGroup4 = findViewById(R.id.radioGroup4);
        radioGroup5 = findViewById(R.id.radioGroup5);
        radioGroup6 = findViewById(R.id.radioGroup6);
        radioGroup7 = findViewById(R.id.radioGroup7);
    }

    public void calculateTotalFu(View view) {
        int totalFu = 0;

        //
        int selectedRadioButtonId1 = radioGroup1.getCheckedRadioButtonId();
        if (selectedRadioButtonId1 == R.id.radioButtonMenRon) {
            totalFu += 30;
        } else if (selectedRadioButtonId1 == R.id.radioButtonSeven) {
            totalFu += 25;
        } else if (selectedRadioButtonId1 == R.id.radioButtonBasic) {
            totalFu += 20;
        }

        // タンキ・カンチャン・ペンチャンの符の値を計算
        int selectedRadioButtonId2 = radioGroup2.getCheckedRadioButtonId();
        if (selectedRadioButtonId2 == R.id.radioButtonTanki) {
            totalFu += 2;
        } else if (selectedRadioButtonId2 == R.id.radioButtonKanchan) {
            totalFu += 2;
        } else if (selectedRadioButtonId2 == R.id.radioButtonPenchan) {
            totalFu += 2;
        }

        //　役牌アタマの時の符の値を計算
        CheckBox checkBox = findViewById(R.id.checkBox);
        if (checkBox.isChecked()) {
            totalFu += 2;
        }

        //　ツモアガリの時の符の値を計算
        CheckBox anotherCheckBox = findViewById(R.id.anotherCheckBox);
        if (anotherCheckBox.isChecked()) {
            totalFu += 2;
        }

        // 中張牌のポンの符の値を計算
        int selectedRadioButtonId3 = radioGroup3.getCheckedRadioButtonId();
        if (selectedRadioButtonId3 == R.id.radioButtonPon2A) {
            totalFu += 2;
        } else if (selectedRadioButtonId3 == R.id.radioButtonPon2B) {
            totalFu += 4;
        } else if (selectedRadioButtonId3 == R.id.radioButtonPon2C) {
            totalFu += 6;
        } else if (selectedRadioButtonId3 == R.id.radioButtonPon2D) {
            totalFu += 8;
        }

        // 中張牌の暗刻　/　１・９、字牌のポンの符の値を計算
        int selectedRadioButtonId4 = radioGroup4.getCheckedRadioButtonId();
        if (selectedRadioButtonId4 == R.id.radioButtonAnkoPon1) {
            totalFu += 4;
        } else if (selectedRadioButtonId4 == R.id.radioButtonAnkoPon2) {
            totalFu += 8;
        } else if (selectedRadioButtonId4 == R.id.radioButtonAnkoPon3) {
            totalFu += 12;
        } else if (selectedRadioButtonId4 == R.id.radioButtonAnkoPon3) {
            totalFu += 16;
        }

        // １・９、字牌の暗刻の符の値を計算　/　中張牌の明カンの符の値を計算
        int selectedRadioButtonId6 = radioGroup5.getCheckedRadioButtonId();
        if (selectedRadioButtonId6 == R.id.radioButtonAnkoB1) {
            totalFu += 8;
        } else if (selectedRadioButtonId6 == R.id.radioButtonAnkoB2) {
            totalFu += 16;
        } else if (selectedRadioButtonId6 == R.id.radioButtonAnkoB3) {
            totalFu += 24;
        } else if (selectedRadioButtonId6 == R.id.radioButtonAnkoB4) {
            totalFu += 32;
        }

        // 中張牌の暗カンの符の値を計算　/　１・９、字牌の明カンの符の値を計算
        int selectedRadioButtonId8 = radioGroup6.getCheckedRadioButtonId();
        if (selectedRadioButtonId8 == R.id.radioButtonAnkanA1) {
            totalFu += 16;
        } else if (selectedRadioButtonId8 == R.id.radioButtonAnkanA2) {
            totalFu += 32;
        } else if (selectedRadioButtonId8 == R.id.radioButtonAnkanA3) {
            totalFu += 48;
        }

        // １・９、字牌の暗カンの符の値を計算
        int selectedRadioButtonId10 = radioGroup7.getCheckedRadioButtonId();
        if (selectedRadioButtonId10 == R.id.radioButtonAnkanB1) {
            totalFu += 32;
        } else if (selectedRadioButtonId10 == R.id.radioButtonAnkanB2) {
            totalFu += 64;
        } else if (selectedRadioButtonId10 == R.id.radioButtonAnkanB3) {
            totalFu += 96;
        }

        // 25の時は25のまま、それ以外は1の位を切り上げる処理
        if (totalFu == 25) {
            textViewTotalFu.setText("25");
        } else {
            totalFu = (totalFu + 9) / 10 * 10;
            textViewTotalFu.setText(String.valueOf(totalFu));
        }
    }

    public void goToScore2Activity(View view) {
        String totalFuText = textViewTotalFu.getText().toString();
        int totalFu;

        if (totalFuText.isEmpty()) {
            totalFu = 0; // もし入力が空なら0を代入する
        } else {
            try {
                totalFu = Integer.parseInt(totalFuText);
            } catch (NumberFormatException e) {
                // 数値に変換できない場合はエラーとして処理
                Toast.makeText(this, "入力に誤りがあります", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        if (totalFu == 20) {
            Intent intent = new Intent(this, Score220Activity.class);
            startActivity(intent);
        } else if (totalFu == 25) {
            Intent intent = new Intent(this, Score225Activity.class);
            startActivity(intent);
        } else if (totalFu == 30) {
            Intent intent = new Intent(this, Score230Activity.class);
            startActivity(intent);
        } else if (totalFu == 40) {
            Intent intent = new Intent(this, Score240Activity.class);
            startActivity(intent);
        } else if (totalFu == 50) {
            Intent intent = new Intent(this, Score250Activity.class);
            startActivity(intent);
        } else if (totalFu == 60) {
            Intent intent = new Intent(this, Score260Activity.class);
            startActivity(intent);
        } else if (totalFu == 70) {
            Intent intent = new Intent(this, Score270Activity.class);
            startActivity(intent);
        } else if (totalFu == 80) {
            Intent intent = new Intent(this, Score280Activity.class);
            startActivity(intent);
        } else if (totalFu == 90) {
            Intent intent = new Intent(this, Score290Activity.class);
            startActivity(intent);
        } else if (totalFu == 100) {
            Intent intent = new Intent(this, Score2100Activity.class);
            startActivity(intent);
        } else if (totalFu == 110) {
            Intent intent = new Intent(this, Score2110Activity.class);
            startActivity(intent);
        } else {
            // If the input does not match any of the expected values, show an error message
            Toast.makeText(this, "入力に誤りがあります", Toast.LENGTH_SHORT).show();
        }
    }
    public void goToYakuActivity(View view) {
        Intent intent = new Intent(this, YakuActivity.class);
        startActivity(intent);
    }
}
