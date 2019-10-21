package com.jtlab.intent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Intent");
        setSupportActionBar(toolbar);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                startActivity(new Intent(this,First.class));
                break;

            case R.id.btn2:
                startActivity(new Intent(this,Second.class));
                break;

            case R.id.btn3:
                startActivity(new Intent(this,Third.class));
                break;
            case R.id.btn4:
                startActivity(new Intent(this,Four.class));
                break;
            case R.id.btn5:
                startActivity(new Intent(this,Five.class));
                break;
            case R.id.btn6:
                startActivity(new Intent(this,Six.class));
                break;
            case R.id.btn7:
                startActivity(new Intent(this,Seven.class));
                break;
            case R.id.btn8:
                startActivity(new Intent(this,Eight.class));
                break;
            case R.id.btn9:
                startActivity(new Intent(this,Nine.class));
                break;
            case R.id.btn10:
                startActivity(new Intent(this,Ten.class));
                break;
            case R.id.btn11:
                startActivity(new Intent(this,Eleven.class));
                break;

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {


            case R.id.about:
               startActivity(new Intent(this,About.class));
                break;




        }
        return super.onOptionsItemSelected(item);
    }
}
