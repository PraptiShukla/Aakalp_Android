package com.example.aakalp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class purchase extends AppCompatActivity {

    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);

        button = (Button) findViewById(R.id.bpurchase);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Thank You Shopping With Us... Visit Again!!!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.Item1:
                Toast.makeText(getApplicationContext(), "Home Selected", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Status.class);
                startActivity(intent);
                finish();
                return true;
            case R.id.Item2:
                Toast.makeText(getApplicationContext(), "Offers Selected", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(getApplicationContext(), Offers.class);
                startActivity(intent1);
                finish();
                return true;
            case R.id.Item3:
                Toast.makeText(getApplicationContext(), "Items Selected", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(getApplicationContext(), Status.class);
                startActivity(intent2);
                finish();
                return true;
            case R.id.Item4:
                Toast.makeText(getApplicationContext(), "Sets Selected", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(getApplicationContext(), Sets.class);
                startActivity(intent3);
                finish();
                return true;
            case R.id.Item5:
                Toast.makeText(getApplicationContext(), "About Us Selected", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(getApplicationContext(), about.class);
                startActivity(intent4);
                finish();
                return true;
            case R.id.Item6:
                Toast.makeText(getApplicationContext(), "Logout Selected", Toast.LENGTH_SHORT).show();
                Intent intent5 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent5);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}