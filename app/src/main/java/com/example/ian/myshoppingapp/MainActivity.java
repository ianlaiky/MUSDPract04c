package com.example.ian.myshoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView recentActTv;
    EditText usernameEt,passwordET;
    Button loginBT;
    final int SHOP_ACTIVITY_RESULT_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recentActTv = (TextView) findViewById(R.id.recentActTv);
        usernameEt= (EditText) findViewById(R.id.userNameET);
        passwordET= (EditText) findViewById(R.id.passwordET);
        loginBT= (Button) findViewById(R.id.loginBT);
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
