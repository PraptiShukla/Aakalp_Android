package com.example.aakalp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
        TextView register;
        EditText etname, etpswd;
        Button login;
        ImageView google;
        ImageView whatsapp;
        ImageView email;
        ImageView facebook;
    String name, password, apiKey;
    TextView errorcame;
    ProgressBar progressBar;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register = findViewById(R.id.newuser);
        etname = findViewById(R.id.username);
        etpswd = findViewById(R.id.password);
        login = findViewById(R.id.login);
        google = findViewById(R.id.google);
        whatsapp = findViewById(R.id.whatsapp);
        email = findViewById(R.id.email);
        facebook = findViewById(R.id.facebook);
        errorcame = findViewById(R.id.error);
        progressBar = findViewById(R.id.progress);
        sharedPreferences = getSharedPreferences("MyAppName",MODE_PRIVATE);

//        if(sharedPreferences.getString("logged","false").equals("true")){
//            Intent intent = new Intent(getApplicationContext(),Status.class);
//            startActivity(intent);
//            finish();
//        }

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openGoogle(v);}
        });

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openWhatsapp(v);}
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openEmail(v);}
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openFacebook(v);}
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                errorcame.setVisibility(View.GONE);
                progressBar.setVisibility(View.VISIBLE);
                name = String.valueOf(etname.getText());
                password = String.valueOf(etpswd.getText());
                RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
                String url ="http://192.168.169.51/Android/Login.php";
                StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                        new Response.Listener<String>() {

                            @Override
                            public void onResponse(String response) {
                                progressBar.setVisibility(View.GONE);
                                try {
                                    JSONObject jsonObject = new JSONObject(response);
                                    String status = jsonObject.getString("status");
                                    String message = jsonObject.getString("message");
                                    if(status.equals("Success")){
                                        name = jsonObject.getString("name");
//                                        password = jsonObject.getString("password");
                                        apiKey = jsonObject.getString("apiKey");
                                        SharedPreferences.Editor editor = sharedPreferences.edit();
                                        editor.putString("logged","true");
                                        editor.putString("name",name);
//                                        editor.putString("password",password);
                                        editor.putString("apiKey",apiKey);
                                        editor.apply();
                                        Intent intent = new Intent(getApplicationContext(),Status.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                } catch (JSONException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        progressBar.setVisibility(View.GONE);
                        errorcame.setText(error.getLocalizedMessage());
                        errorcame.setVisibility(View.VISIBLE);
                    }
                }){
                    protected Map<String, String> getParams(){
                        Map<String, String> paramV = new HashMap<>();
                        paramV.put("name", name);
                        paramV.put("password", password);
                        return paramV;
                    }
                };
                queue.add(stringRequest);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Registration.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void openGoogle(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://192.168.169.51/MCA/Login.php"));
        startActivity(intent);
    }

    public void openWhatsapp(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://whatsapp.com"));
        startActivity(intent);
    }

    public void openEmail(View v){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"aakalp2023@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Communication with Aakalp");
        startActivity(Intent.createChooser(intent,"Choose default Mail App"));
    }

    public void openFacebook(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://Facebook.com"));
        startActivity(intent);
    }
}