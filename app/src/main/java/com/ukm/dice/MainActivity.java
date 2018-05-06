package com.ukm.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton;
        rollbutton =(Button) findViewById(R.id.Rollbutton);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_L_dice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_R_dice);

        final int[] dicearray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dice", "Button is working");

                Random randomnumber = new Random();

                int number = randomnumber.nextInt(6);

             //   Log.d("Dice", "random number =" + (number+number2+2));
                leftDice.setImageResource(dicearray[number]);
                number = randomnumber.nextInt(6);
                rightDice.setImageResource(dicearray[number]);
            }
        });

    }
}
