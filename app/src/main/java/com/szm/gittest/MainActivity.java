package com.szm.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  private Button btn_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_main=findViewById(R.id.btn_main);

        btn_main.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        startActivity( new Intent(this,DBActivity.class));
    }
}
