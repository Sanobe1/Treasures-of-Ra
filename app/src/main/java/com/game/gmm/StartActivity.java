package com.game.gmm;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
public class StartActivity extends Activity implements OnClickListener {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_start);

        Button startButton = (Button) findViewById(R.id.button1);
        startButton.setOnClickListener(this);

        Button policyButton = (Button) findViewById(R.id.button2);
        startButton.setOnClickListener(this);

        Button exitButton = (Button) findViewById(R.id.button3);
        exitButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1: {
                Intent intent = new Intent();
                intent.setClass(this, TicTacToeActivity.class);
                startActivity(intent);
            }
            break;

            case R.id.button2: {
                Intent intent = new Intent();
                intent.setClass(this, PolicyActivity.class);
                startActivity(intent);
            }
            break;

            case R.id.button3: {
                finish();
            }
            break;

            default:
                break;
        }
    }
}
