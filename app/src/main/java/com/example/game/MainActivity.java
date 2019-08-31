package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static com.example.game.R.id.imgRandom;
import static com.example.game.R.id.textScore;


public class MainActivity extends AppCompatActivity {
    private static final Random rgenerador = new Random();
    private static final Integer[] imagenesID = {R.drawable.triangleblue, R.drawable.trianglegreen, R.drawable.trianglered, R.drawable.circleblue, R.drawable.circlegreen, R.drawable.circlered, R.drawable.squareblue, R.drawable.squaregreen, R.drawable.squarered};
    public ImageView iv;
    public Integer imag;
    public int Scores;
    public String figures, colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imag = imagenesID[rgenerador.nextInt(imagenesID.length)];
        iv = findViewById(imgRandom);
        iv.setImageResource(imag);
        botonesAlea();
        evaluateBtnRight();
        evaluateBtnLeft();
        evaluateBtnCenter();
    }

    private void isTriangle() {
        if (imag.equals(R.drawable.triangleblue) || imag.equals(R.drawable.trianglered) || imag.equals(R.drawable.trianglegreen))
            figures = "Triangle";
    }

    private void isSquare() {
        if (imag.equals(R.drawable.squareblue) || imag.equals(R.drawable.squarered) || imag.equals(R.drawable.squaregreen))
            figures = "Square";
    }

    private void isCircle() {
        if (imag.equals(R.drawable.circleblue) || imag.equals(R.drawable.circlered) || imag.equals(R.drawable.circlegreen))
            figures = "Circle";
    }

    private void isBlue() {
        if (imag.equals(R.drawable.triangleblue) || imag.equals(R.drawable.circleblue) || imag.equals(R.drawable.squareblue))
            colors = "Blue";
    }

    private void isGreen() {
        if (imag.equals(R.drawable.squaregreen) || imag.equals(R.drawable.circlegreen) || imag.equals(R.drawable.trianglegreen))
            colors = "Green";
    }

    private void isRed() {
        if (imag.equals(R.drawable.trianglered) || imag.equals(R.drawable.circlered) || imag.equals(R.drawable.squarered))
            colors = "Red";
    }

    public void evaluateBtnLeft() {

        final Button but1;
        but1 = findViewById(R.id.btnLeft);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (but1.getText().equals(colors) || but1.getText().equals(figures)) {
                    Scores = 50;
                } else {
                    Scores = -50;
                }
            }
        });
        TextView tex;
        tex = findViewById(textScore);
        tex.setText(Scores);


    }

    public void evaluateBtnRight() {

        final Button but2;
        but2 = findViewById(R.id.btnRight);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (but2.getText().equals(colors) || but2.getText().equals(figures)) {
                    Scores = 50;
                } else {
                    Scores = -50;
                }
            }
        });
        TextView tex;
        tex = findViewById(textScore);
        tex.setText(Scores);

    }

    public void evaluateBtnCenter() {
        final Button but3;
        but3 = findViewById(R.id.btnCenter);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (but3.getText().equals(colors) || but3.getText().equals(figures)) {
                    Scores = 50;
                } else {
                    Scores = -50;
                }
            }
        });
        TextView tex;
        tex = findViewById(textScore);
        tex.setText(Scores);

    }


    private void botonesAlea() {
        Button but1, but2, but3;
        int col = (int) Math.floor((Math.random() * 6) + 1);
        switch (col) {
            case 1:
                but1 = findViewById(R.id.btnCenter);
                but1.setText("Square");
                but2 = findViewById(R.id.btnLeft);
                but2.setText("Triangle");
                but3 = findViewById(R.id.btnRight);
                but3.setText("Circle");
                break;

            case 2:
                but1 = findViewById(R.id.btnCenter);
                but1.setText("Circle");
                but2 = findViewById(R.id.btnLeft);
                but2.setText("Triangle");
                but3 = findViewById(R.id.btnRight);
                but3.setText("Square");
                break;

            case 3:
                but1 = findViewById(R.id.btnCenter);
                but1.setText("Triangle");
                but2 = findViewById(R.id.btnLeft);
                but2.setText("Square");
                but3 = findViewById(R.id.btnRight);
                but3.setText("Circle");
                break;
            case 4:
                but1 = findViewById(R.id.btnCenter);
                but1.setText("Red");
                but2 = findViewById(R.id.btnLeft);
                but2.setText("Green");
                but3 = findViewById(R.id.btnRight);
                but3.setText("Blue");
                break;

            case 5:
                but1 = findViewById(R.id.btnCenter);
                but1.setText("Blue");
                but2 = findViewById(R.id.btnLeft);
                but2.setText("Red");
                but3 = findViewById(R.id.btnRight);
                but3.setText("Green");
                break;

            case 6:
                but1 = findViewById(R.id.btnCenter);
                but1.setText("Green");
                but2 = findViewById(R.id.btnLeft);
                but2.setText("Red");
                but3 = findViewById(R.id.btnRight);
                but3.setText("Blue");
                break;
        }
    }


}