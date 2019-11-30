package com.example.widgets_dwelb2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import static com.example.widgets_dwelb2.R.id.editText;

public class MainActivity extends AppCompatActivity {

    TextView changeText;
    TextView changeTextCB;
    Button changeButton;
    CheckBox changeBox;
    TextView changeTextS;
    Switch changeSwitch;
    SeekBar changeBar;
    TextView changeTextSB;
    TextView changeTextET;
    Button buttonUpdate;
    EditText editText;
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView changeTextRG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeText = findViewById(R.id.textViewB);
        changeButton = findViewById(R.id.button);

        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                changeText.setText("Button Has Been Clicked");

            }
        });

        changeTextCB = findViewById(R.id.textViewCB);
        changeBox = findViewById(R.id.checkBox);

        changeBox.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();
                if (checked) {
                    changeTextCB.setText("This Checkbox is: Clicked");
                } else {
                    changeTextCB.setText("This Checkbox is: Not Clicked");
                }
            }
        });

        changeTextS = findViewById(R.id.textViewS);
        changeSwitch = findViewById(R.id.switch1);

        changeSwitch.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                boolean checked = ((Switch) v).isChecked();
                if (checked) {
                    changeTextS.setText("This Switch is: On");
                } else {
                    changeTextS.setText("This Switch is: Off");
                }
            }
        });

        changeBar = findViewById(R.id.seekBar);
        changeTextSB = findViewById(R.id.textViewSB);

        changeBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override

            public void onProgressChanged(SeekBar changeBar, int progress, boolean fromUser) {
                changeTextSB.setText(progress + " %");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        changeTextET = findViewById(R.id.textViewET);
        buttonUpdate = findViewById(R.id.buttonUpdate);
        editText = findViewById(R.id.editText);

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                changeTextET.setText(editText.getText());

            }
        });

        radioGroup = findViewById(R.id.radioGroup);
        changeTextRG = findViewById(R.id.textViewRG);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radio1:
                        changeTextRG.setText("#1 isSelected");
                        break;
                    case R.id.radio2:
                        changeTextRG.setText("#2 isSelected");
                        break;
                    case R.id.radio3:
                        changeTextRG.setText("#3 isSelected");
                        break;
                }
            }
        });

    }
}
