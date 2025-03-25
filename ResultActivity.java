package com.example.slip5q1;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView tvResult = findViewById(R.id.tvResult);
        double power = getIntent().getDoubleExtra("POWER", 0);
        double average = getIntent().getDoubleExtra("AVERAGE", 0);
        tvResult.setText("Power: " + power + "\nAverage: " + average);
    }
}
