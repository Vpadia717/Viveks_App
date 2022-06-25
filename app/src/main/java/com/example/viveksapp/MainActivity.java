package com.example.viveksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText txt;
    TextInputLayout body_txt;
    TextView txtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        txt = findViewById(R.id.editText);
        body_txt = findViewById(R.id.body);
        txtv = findViewById(R.id.text2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = txt.getText().toString();
                if (!validateData()) {
                    return;
                }
                txtv.setText("You have entered : '" + s + "'");
            }
        });
    }

    private boolean validateData() {
        String val = Objects.requireNonNull(body_txt.getEditText()).getText().toString().trim();

        if (val.isEmpty()) {
            body_txt.setError("Field cannot be empty");
            return false;
        } else if (val.length() > 20) {
            body_txt.setError("You have reached character limit");
            return false;
        } else {
            body_txt.setError(null);
            body_txt.setErrorEnabled(false);
            return true;
        }

    }
}