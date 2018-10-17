package com.BogettiBozzo.Calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.unity3d.player.UnityPlayer;

public class MainActivity extends AppCompatActivity
{

    Button botonPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonPlay = (Button)findViewById(R.id.buttonPlay);

        botonPlay.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent play = new Intent(MainActivity.this, UnityPlayerActivity.class);
                startActivity(play);
            }
        });

    }

}
