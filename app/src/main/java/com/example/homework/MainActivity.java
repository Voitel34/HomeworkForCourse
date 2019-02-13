package com.example.homework;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mInputText;
    private Button mInputButton;
    private View.OnClickListener mInputButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String s1 = mInputText.getText().toString();
            if (!isInputValid()){
                Toast.makeText(getApplicationContext(), s1, Toast.LENGTH_LONG).show();
            }
        }
    };
    private boolean isInputValid (){
        return TextUtils.isEmpty(mInputText.getText());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInputText = findViewById(R.id.input_edit);
        mInputButton = findViewById(R.id.input_button);
        mInputButton.setOnClickListener(mInputButtonClickListener);
    }
}
