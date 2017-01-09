package com.example.cavanscoffin_thomas.project3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button lCavlaButton = (Button) findViewById(R.id.lCavlaButton);
        lCavlaButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView lCavlaText = (TextView)findViewById(R.id.lCavlaText);
                        lCavlaText.setText("Good Job");
                    }
                }
        );

        lCavlaButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView lCavlaText = (TextView)findViewById(R.id.lCavlaText);
                        lCavlaText.setText("Super Job!");
                        return false;
                    }
                }
        );
    }
}
