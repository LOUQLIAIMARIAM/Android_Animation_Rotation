package com.example.animation4;

import static android.view.animation.AnimationUtils.loadAnimation;
import static com.google.android.material.animation.AnimationUtils.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.TextView;

import com.google.android.material.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Animation anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        anim = loadAnimation(this,R.anim.rotation);

        text.setAnimation(anim);

    }
}