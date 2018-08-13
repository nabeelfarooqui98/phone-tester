package com.spacedip.phonetester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button redButton;
    private Button blueButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redButton = (Button) findViewById(R.id.Red_Button);
        blueButton = (Button) findViewById(R.id.Blue_Button);

        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Red Screen",Toast.LENGTH_LONG).show();

                Intent i = new Intent(view.getContext(),RedScreen.class);
                view.getContext().startActivity(i);


            }
        });
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Blue Screen",Toast.LENGTH_LONG).show();

                Intent i = new Intent(view.getContext(),BlueScreen.class);
                view.getContext().startActivity(i);


            }
        });
    }

}
