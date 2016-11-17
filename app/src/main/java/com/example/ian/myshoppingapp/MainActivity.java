package com.example.ian.myshoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.main,menu);
        return true;


    }

    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();
        if(id == R.id.action_settings){
            return true;
        }else{
            if(id==R.id.action_about){
                Intent myIntent = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(myIntent);
            }
        }
return super.onOptionsItemSelected(item);
    }



}
