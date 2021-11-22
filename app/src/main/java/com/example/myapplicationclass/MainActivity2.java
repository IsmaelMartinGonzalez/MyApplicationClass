package com.example.myapplicationclass;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = findViewById(R.id.textView00);
        Bundle data = getIntent().getExtras();
        tv.setText(data.getString("edt"));
        edt = findViewById(R.id.edit2);
    }

    public void die(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("edt2", edt.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }

    public void die2(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        setResult(RESULT_CANCELED, intent);
        finish();
    }

}