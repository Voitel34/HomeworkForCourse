package com.example.homework;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    public static String TEXT_FOR_TRANSFER = "TEXT";

    private TextView mText2;
    private Button mButton2;
    private View.OnClickListener mButtonToSearch = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/#q=" + mText2.getText().toString()));
            startActivity(browser);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        mText2 = findViewById(R.id.text_output);
        mButton2 = findViewById(R.id.button2);

        Bundle bundle = getIntent().getExtras();
        mText2.setText(bundle.getString(TEXT_FOR_TRANSFER));

        mButton2.setOnClickListener(mButtonToSearch);
    }
}
