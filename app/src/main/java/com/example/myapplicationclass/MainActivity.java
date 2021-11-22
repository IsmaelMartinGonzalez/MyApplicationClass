package com.example.myapplicationclass;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt = findViewById(R.id.edit);
        tv = findViewById(R.id.textView2);
    }

    public void canvia(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("edt", edt.getText().toString());
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 0) {
            if (resultCode == RESULT_OK) {
                assert data != null;
                if (data.hasExtra("edt2")) {
                    tv.setText(data.getStringExtra("edt2"));
                }
            } else if (requestCode==RESULT_CANCELED){
                tv.setText("Han cancelado");
            }else {
                tv.setText("F");
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}