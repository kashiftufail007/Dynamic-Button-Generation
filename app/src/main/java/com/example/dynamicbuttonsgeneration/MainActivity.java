package com.example.dynamicbuttonsgeneration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (LinearLayout)  findViewById(R.id.linear);
        for ( int i = 0 ; i <4 ; i++){
            Button btn = new Button(this);
            btn.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            btn.setId(i);
            btn.setTextSize(20);
            btn.setText("Button "+i) ;
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Button" +v.getId()+ " Clicked", Toast.LENGTH_SHORT).show();
                }
            });

            layout.addView(btn  );
        }
    }
}
