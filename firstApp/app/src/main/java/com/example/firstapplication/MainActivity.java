package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.id.);
        textView = findViewById(R.id.textView);

    }

    public void countpRessed(View view){
        System.out.println("count clicked");
        count++;
        textView.setText("count is "+count);

        if(count < 4){
            Intent intent = new Intent(this, About.class);
                startActivity(intent);
        }

    }
}