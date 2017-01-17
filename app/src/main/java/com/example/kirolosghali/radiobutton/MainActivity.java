package com.example.kirolosghali.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static RadioGroup radioGroup;
    private  static RadioButton z;
    private static Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click();
    }
    public void click(){

    radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selected_id=radioGroup.getCheckedRadioButtonId();
                z=(RadioButton)findViewById(selected_id);
                Toast.makeText(MainActivity.this,z.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
