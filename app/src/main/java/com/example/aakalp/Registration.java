package com.example.aakalp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;
import java.util.Map;

public class Registration extends AppCompatActivity {

    EditText etname, etpswd;
    Button submit;
    String name, password;
    TextView errorcame;
    ProgressBar progressBar;
    TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        back = findViewById(R.id.back);
        etname = findViewById(R.id.username);
        etpswd = findViewById(R.id.password);
        submit = findViewById(R.id.submit);
        errorcame = findViewById(R.id.error);
        progressBar = findViewById(R.id.progress);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                errorcame.setVisibility(View.GONE);
                progressBar.setVisibility(View.VISIBLE);
            name = String.valueOf(etname.getText());
            password = String.valueOf(etpswd.getText());
            RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
            String url ="http://192.168.169.51/Android/Register.php";
            StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            progressBar.setVisibility(View.GONE);
                            if(response.equals("Success")){
                                Toast.makeText(getApplicationContext(),"Registration Successful!!!",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                                startActivity(intent);
                                finish();
                            }
                            else{
                                errorcame.setText(response);
                                errorcame.setVisibility(View.VISIBLE);
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

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}