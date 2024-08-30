package com.example.lab1randomnumber;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    private TextView edt_number;
    private Button btn_random;
    Random random =new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        loadView();
        btn_random.setOnClickListener(view -> {
            int res = random.nextInt(6) + 1;
            edt_number.setText(res+"");

        });
    }
    private void loadView(){
        edt_number = findViewById(R.id.edt_number);
        btn_random = findViewById(R.id.btn_random);
    }
}