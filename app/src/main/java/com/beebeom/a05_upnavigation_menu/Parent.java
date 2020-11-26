package com.beebeom.a05_upnavigation_menu;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Parent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);

        findViewById(R.id.btn_move_child).setOnClickListener(v -> {
            startActivity(new Intent(this, Child.class));
        });
    }
}