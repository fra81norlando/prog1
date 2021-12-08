package com.example.array_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String nazioni[] = ["italia", "francia", "spagna", "germania"];
    ListView listastati;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listastati = (ListView) findViewById(R.id.lvstati);
        ArrayAdapter <String> astati = new ArrayAdapter<String>(this,R.layout.activity_main, nazioni);
        listastati.setAdapter(astati);
    }
    }
