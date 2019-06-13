package ru.sheps.android.homework421;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends  AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolBar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolBar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);
            return true;
        }
        if (id == R.id.action_callendar) {
            Intent intentNotes = new Intent(MainActivity.this, CallendarActivity.class);
            startActivity(intentNotes);
            return true;
        }

        if (id == R.id.action_open_adress) {
            Intent intentNotes = new Intent(MainActivity.this, AdressActivity.class);
            startActivity(intentNotes);
            return true;
        }
        if (id == R.id.action_open_pay) {
            Intent intentNotes = new Intent(MainActivity.this, PayActivity.class);
            startActivity(intentNotes);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
