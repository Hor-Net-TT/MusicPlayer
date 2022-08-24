package com.example.musicplayer;

import android.os.Bundle;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton button1;
    Boolean Condition = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(){
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(v -> {
            if (Condition){
                button1.setImageResource(R.drawable.play);
            }

            else{
                button1.setImageResource(R.drawable.pause);
            }
        });
    }
}