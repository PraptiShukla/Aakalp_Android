package com.example.aakalp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class frames extends AppCompatActivity {

    Button b1, b01, b2, b02, b3, b03, b4, b04, b5, b05, b6, b06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frames);

        b1 = (Button) findViewById(R.id.b1);
        b01 = (Button) findViewById(R.id.b01);
        b2 = (Button) findViewById(R.id.b2);
        b02 = (Button) findViewById(R.id.b02);
        b3 = (Button) findViewById(R.id.b3);
        b03 = (Button) findViewById(R.id.b03);
        b4 = (Button) findViewById(R.id.b4);
        b04 = (Button) findViewById(R.id.b04);
        b5 = (Button) findViewById(R.id.b5);
        b05 = (Button) findViewById(R.id.b05);
        b6 = (Button) findViewById(R.id.b6);
        b06 = (Button) findViewById(R.id.b06);

        View.OnClickListener onClickListener1 = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), purchase.class);
                startActivity(intent);
                finish();
            }
        };

        b1.setOnClickListener(onClickListener1);
        b2.setOnClickListener(onClickListener1);
        b3.setOnClickListener(onClickListener1);
        b4.setOnClickListener(onClickListener1);
        b5.setOnClickListener(onClickListener1);
        b6.setOnClickListener(onClickListener1);

        View.OnClickListener onClickListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Added to Cart!!!",Toast.LENGTH_SHORT).show();
            }
        };

        b01.setOnClickListener(onClickListener);
        b02.setOnClickListener(onClickListener);
        b03.setOnClickListener(onClickListener);
        b04.setOnClickListener(onClickListener);
        b05.setOnClickListener(onClickListener);
        b06.setOnClickListener(onClickListener);

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