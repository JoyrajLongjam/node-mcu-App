package com.joyrajlongjam.nmcu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import static com.joyrajlongjam.nmcu.MainActivity.text;
public class MainActivity extends AppCompatActivity {
    private EditText ip1;
    private static Button led;

    public static String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        led=(Button) findViewById(R.id.click);
        ip1=(EditText) findViewById(R.id.ip);

        led.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=ip1.getText().toString();
                Intent ht1 = new Intent(MainActivity.this,LED_activity.class);
                startActivity(ht1);
            }
        });
    }
}
