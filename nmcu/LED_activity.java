package com.joyrajlongjam.nmcu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LED_activity extends AppCompatActivity {
    private static Button on1,on2,off1,off2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led);

        on1=(Button) findViewById(R.id.on1);
        off1=(Button) findViewById(R.id.off1);
        on2=(Button) findViewById(R.id.on2);
        off2=(Button) findViewById(R.id.off2);

        on1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                on1 process1 = new on1();
                process1.execute();

            }
        });

        on2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                on2 process1 = new on2();
                process1.execute();

            }
        });

        off1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                off1 process1 = new off1();
                process1.execute();

            }
        });

        off2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                off2 process1 = new off2();
                process1.execute();

            }
        });
    }
}
