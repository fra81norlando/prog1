package com.example.prova_orlando;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    String nazioni[] = {"italia", "francia", "spagna", "germania"};
    ListView listastati;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnesegui = (Button) findViewById(R.id.btnEsegui);

        btnesegui.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {

                                         }
                                     });

                listastati = (ListView) findViewById(R.id.listastati);
        ArrayAdapter<String> astati = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nazioni);
        listastati.setAdapter(astati);
    }
}
