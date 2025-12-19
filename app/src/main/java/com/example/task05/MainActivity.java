package com.example.task05;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int clickCounted = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn.setText("Click me !");
    }

    public void clicked(View view) {
        clickCounted++;
        if (clickCounted < 6) {
            btn.setText("This is a click number:" + clickCounted);
        } else if (clickCounted == 6) {
            btn.setText("Enough to click. Go to new start!");
            clickCounted = 0;
        }
    }
}