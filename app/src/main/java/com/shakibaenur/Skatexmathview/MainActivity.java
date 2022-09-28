package com.shakibaenur.Skatexmathview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.shakibaenur.katexmathview.R;

import shakiba.enur.skatexmath.SKatexMathView;

public class MainActivity extends AppCompatActivity {

private SKatexMathView SKatexMathView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SKatexMathView =findViewById(R.id.text1);
        SKatexMathView.setLatex("I afg fgfg fdfd ddff \\\\g g gg fdff fvffff fefw erttrrt m\\\\$$x=\\frac{1+y}{1+2z^2}$$\\\\jhghj\\\\jhghj\\\\jhghj\\\\jhghj\\\\jhghj\\\\jhghj\\\\jhghj\\\\jhghj\\\\jhghj\\\\jhghj\\\\jhghj\\\\jhghj\\\\jhghj\\\\kkkl");
        SKatexMathView.setLatex(" $$x=\\frac{1+y}{1+2z^2}$$");

       // SKatexMathView.setLatex("প্যাকেজসমূহ\ndfhvjbhf dsfhbdshd dsfjbdsbfh dsfhbjd sdfhgsdhf");
    }
}