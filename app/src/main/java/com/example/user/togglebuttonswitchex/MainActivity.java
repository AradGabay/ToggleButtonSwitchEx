package com.example.user.togglebuttonswitchex;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tgb;
    Switch swb;
    Button btn;
    LinearLayout mainl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tgb=(ToggleButton)findViewById(R.id.greencolor);
        swb=(Switch)findViewById(R.id.bluecolor);
        btn=(Button)findViewById(R.id.btn);
        mainl=(LinearLayout)findViewById(R.id.mainlayout);
    }

    public void changeB(View view) {
        if(tgb.isChecked()&&swb.isChecked()){
            mainl.setBackgroundColor(Color.rgb(00,255,255));
        }else if(tgb.isChecked()){
            mainl.setBackgroundColor(Color.rgb(00,255,00));
        }else if(swb.isChecked()){ mainl.setBackgroundColor(Color.rgb(00,00,255));
            }else mainl.setBackgroundColor(Color.WHITE);
    }
}
