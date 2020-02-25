package com.example.httpgetjson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView mWeather;
    Table table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle data = getIntent().getExtras();
        table = (Table) data.getSerializable("weather");

        mWeather = findViewById(R.id.textView);
        mWeather.setText(table.getTest1()+"\n"+table.getTest2()+"\n"+table.getTest3());

    }
}
