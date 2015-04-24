package com.app.rhanfe006.radiogroupvivas;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements
        RadioGroup.OnCheckedChangeListener {
    TextView texto;
    RadioGroup grupo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.Texto);
        grupo = (RadioGroup) findViewById(R.id.Group);
        grupo.setOnCheckedChangeListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.acercade:
                Intent a = new Intent("com.app.rhanfe006.radiogroupvivas.acer");
                startActivity(a);
                break;
            case R.id.preferencias:
                Intent p = new Intent("com.app.rhanfe006.radiogroupvivas.acer");
                startActivity(p);
                break;
            case R.id.salir:
                finish();
                break;
        }
        return false;
    }



    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        switch (checkedId) {
            case R.id.Boton1:
                texto.setText("Usted prefiere las manzanas");
                texto.setTextSize(20);
                texto.setTextColor(Color.RED);
                break;
            case R.id.Boton2:
                texto.setText("Usted prefiere los platanos");
                texto.setTextSize(20);
                texto.setTextColor(Color.RED);
                break;
            case R.id.Boton3:
                texto.setText("Usted prefiere las naranjas");
                texto.setTextSize(20);
                texto.setTextColor(Color.RED);
                break;

        }
    }
}
