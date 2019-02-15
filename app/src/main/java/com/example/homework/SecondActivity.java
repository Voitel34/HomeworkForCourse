package com.example.homework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    public static String TEXT_FOR_TRANSFER = "TEXT";

    private TextView mText2;
    private Button mButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        mText2 = findViewById(R.id.text_output);
        mButton2 = findViewById(R.id.button2);

        Bundle bundle = getIntent().getExtras();
        mText2.setText(bundle.getString(TEXT_FOR_TRANSFER));
    }
}
