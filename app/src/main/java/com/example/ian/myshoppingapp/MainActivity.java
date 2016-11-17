package com.example.ian.myshoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView recentActTv;
    EditText usernameEt, passwordET;
    Button loginBT;
    final int SHOP_ACTIVITY_RESULT_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recentActTv = (TextView) findViewById(R.id.recentActTv);
        usernameEt = (EditText) findViewById(R.id.userNameET);
        passwordET = (EditText) findViewById(R.id.passwordET);
        loginBT = (Button) findViewById(R.id.loginBT);

        loginBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, ShopActivity.class);
                myIntent.putExtra("username", usernameEt.getText().toString());
                startActivityForResult(myIntent, SHOP_ACTIVITY_RESULT_CODE);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;


    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        } else {
            if (id == R.id.action_about) {
                Intent myIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(myIntent);
            }
        }
        return super.onOptionsItemSelected(item);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == SHOP_ACTIVITY_RESULT_CODE) {
            if (resultCode == RESULT_OK) {
                String recentActivity = data.getStringExtra(ShopActivity.RETURN_MSG);
                Log.i("recentActivity", recentActivity);
                recentActTv.setText(recentActivity);
            }
        }
    }


}
