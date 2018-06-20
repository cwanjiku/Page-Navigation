package com.example.hppavillion11.pagenavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void services(View view) {
        // intense - to navigate- it tells the app to do something
        Intent x= new Intent(this, ServicesActivity.class);
        startActivity(x);

    }

    public void products(View view) {
        Intent y = new Intent(this, ProductsActivity.class);
        startActivity(y);

    }
}
