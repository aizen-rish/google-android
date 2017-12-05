package com.example.sandeep.scarnesdice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int userScore=0;
    int computerScore=0;
    int localScore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final ImageView img= (ImageView)findViewById(R.id.pic);

        Button roll = (Button) findViewById(R.id.roll);
        Button hold = (Button) findViewById(R.id.hold);
        Button reset = (Button) findViewById(R.id.reset);

        final TextView user=(TextView) findViewById(R.id.userScore);
        final TextView comp=(TextView) findViewById(R.id.computerScore);
        final TextView loc=(TextView) findViewById(R.id.localScore);
        user.setText("User score: "+userScore);
        comp.setText("Computer score: "+computerScore);



        roll.setOnClickListener(
                new View.OnClickListener()
                {

                    public void onClick(View v)
                    {
                        Random rnd = new Random();
                        int temp=rnd.nextInt(5)+1;
                        String str = "dice" + (temp);
                        img.setImageResource(getResources().getIdentifier(str, "drawable", getPackageName()));
                        if(temp==1) {
                            localScore = 0;

                        }
                        else {
                            localScore = localScore + temp;
                        }
                        loc.setText("Local Score:"+String.valueOf(localScore));

                    }
                }
        );


        hold.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        userScore+=localScore;
                        localScore=0;
                        loc.setText("Local Score:"+String.valueOf(localScore));
                        user.setText("User Score:"+String.valueOf(userScore));
                        if (userScore>100)
                        {
                            user.setText("User Score: YOU WIN");
                        }
                    }
                }
        );

        reset.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        userScore=0;
                        localScore=0;
                        computerScore=0;
                        loc.setText("Local Score:"+String.valueOf(localScore));
                        user.setText("User Score:"+String.valueOf(userScore));
                        comp.setText("Computer Score:"+String.valueOf(computerScore));
                    }
                }
        );
}
