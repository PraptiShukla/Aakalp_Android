package com.example.aakalp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class Status extends AppCompatActivity {

    ClipData.Item Item1;
    Button necklace, earrings, rings, bridal, bangles, maharashtrian, mangalsutra, latest, thali, frames,
    puja, baby, silverj, anklets, idols, coins;
    ImageView offimg;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        necklace = (Button) findViewById(R.id.bnecklace);
        earrings = (Button) findViewById(R.id.bearrings);
        rings = (Button) findViewById(R.id.brings);
        bridal = (Button) findViewById(R.id.bbridal);
        bangles = (Button) findViewById(R.id.bbangles);
        maharashtrian = (Button) findViewById(R.id.bmaharashtrian);
        mangalsutra = (Button) findViewById(R.id.bmangalsutra);
        latest = (Button) findViewById(R.id.blatest);
        thali = (Button) findViewById(R.id.bthali);
        frames = (Button) findViewById(R.id.bframes);
        puja = (Button) findViewById(R.id.bpuja);
        baby = (Button) findViewById(R.id.bbaby);
        silverj = (Button) findViewById(R.id.bsilverj);
        anklets = (Button) findViewById(R.id.banklets);
        idols = (Button) findViewById(R.id.bidols);
        coins = (Button) findViewById(R.id.bcoins);

        offimg = (ImageView) findViewById(R.id.offimg);

        necklace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Necklace.class);
                startActivity(i);
                finish();
            }
        });

        earrings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Earrings.class);
                startActivity(i);
                finish();
            }
        });

        rings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Rings.class);
                startActivity(i);
                finish();
            }
        });

        bridal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), bridal.class);
                startActivity(i);
                finish();
            }
        });

        bangles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), bangles.class);
                startActivity(i);
                finish();
            }
        });

        maharashtrian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), maharashtrian.class);
                startActivity(i);
                finish();
            }
        });

        mangalsutra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), mangalsutra.class);
                startActivity(i);
                finish();
            }
        });

        latest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), latest.class);
                startActivity(i);
                finish();
            }
        });

        thali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), thali.class);
                startActivity(i);
                finish();
            }
        });

        frames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), frames.class);
                startActivity(i);
                finish();
            }
        });

        puja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Puja.class);
                startActivity(i);
                finish();
            }
        });

        baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Baby.class);
                startActivity(i);
                finish();
            }
        });

        silverj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), silverj.class);
                startActivity(i);
                finish();
            }
        });

        anklets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), anklets.class);
                startActivity(i);
                finish();
            }
        });

        idols.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), idols.class);
                startActivity(i);
                finish();
            }
        });

        coins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), coins.class);
                startActivity(i);
                finish();
            }
        });

        offimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Offers.class);
                startActivity(i);
                finish();
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