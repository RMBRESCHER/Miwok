package com.example.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent numberIntent = new Intent(MainActivity.this,NumbersActivity.class);
                //Start the new activity
                startActivity(numberIntent);
            }
        });
        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);
                //Start the new activity
                startActivity(familyIntent);
            }
        });
        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent colorIntent = new Intent(MainActivity.this,ColorsActivity.class);
                //Start the new activity
                startActivity(colorIntent);
            }
        });
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent phrasesIntent = new Intent(MainActivity.this,PhasesActivity.class);
                //Start the new activity
                startActivity(phrasesIntent);
            }
        });
    }
}