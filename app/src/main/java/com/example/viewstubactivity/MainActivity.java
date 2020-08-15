package com.example.viewstubactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    ViewStub viewStub;
    Button show,hide;

    protected void init(){
        viewStub=findViewById(R.id.viewstub);
        show=findViewById(R.id.show);
        hide=findViewById(R.id.hide);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        viewStub.inflate();

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewStub.setVisibility(View.VISIBLE);
            }
        });

        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewStub.setVisibility(View.GONE);
            }
        });
    }
}
