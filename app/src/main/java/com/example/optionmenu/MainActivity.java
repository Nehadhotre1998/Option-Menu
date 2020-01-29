package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.main_menu, menu);
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.android) {
            Toast.makeText(getApplicationContext(), "Android", Toast.LENGTH_LONG).show();
        }

        if (item.getItemId() == R.id.java) {
            Toast.makeText(getApplicationContext(), "Java", Toast.LENGTH_LONG).show();
        }

        if (item.getItemId() == R.id.kotlin) {
            Toast.makeText(getApplicationContext(), "Kotlin", Toast.LENGTH_LONG).show();
        }

        if (item.getItemId() == R.id.search) {
            Toast.makeText(getApplicationContext(), "Search", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
}

