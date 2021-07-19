package com.game.gmm;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class TicTacToeActivity extends AppCompatActivity {

    private ImageView btn1, btn2, btn3, btn4,btn5, btn6,btn7, btn8, btn9;
    private Button btnReset;
    private TextView txtScorera, txtScoregodra, txtDraw;
    private byte mBtn1 = 5, mBtn2= 5, mBtn3 = 5, mBtn4 = 5,mBtn5 = 5, mBtn6 = 5,mBtn7 = 5, mBtn8= 5,mBtn9 = 5, i = 0, countX = 0, countO = 0;
    private short draw = 0;
    private char mStart = 'X';
    private boolean isRoundFinished = false;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInitializeResources();

        btnReset.setOnClickListener(v->{
            mResetGame();
        });

        btn1.setOnClickListener(v -> {
            if(mBtn1!=1 && mBtn1 != 0) {
                if (mStart == 'X') {
                    btn1.setImageResource(R.drawable.godra);
                    mBtn1 = 1;
                } else {
                    btn1.setImageResource(R.drawable.ra);
                    mBtn1 = 0;
                }
                i++;
                mChoosePlayer();
                mWinningGame();
            }
        });

        btn2.setOnClickListener(v -> {
            if(mBtn2!=1 && mBtn2 != 0) {
                if (mStart == 'X') {
                    btn2.setImageResource(R.drawable.godra);
                    mBtn2 = 1;
                } else {
                    btn2.setImageResource(R.drawable.ra);
                    mBtn2 = 0;
                }
                i++;
                mChoosePlayer();
                mWinningGame();
            }
        });

        btn3.setOnClickListener(v -> {
            if(mBtn3 != 1 && mBtn3 != 0) {
                if (mStart == 'X') {
                    btn3.setImageResource(R.drawable.godra);
                    mBtn3 = 1;
                } else {
                    btn3.setImageResource(R.drawable.ra);
                    mBtn3 = 0;
                }
                i++;
                mChoosePlayer();
                mWinningGame();
            }
        });

        btn4.setOnClickListener(v -> {
            if(mBtn4 != 1 && mBtn4 != 0) {
                if (mStart == 'X') {
                    btn4.setImageResource(R.drawable.godra);
                    mBtn4 = 1;
                } else {
                    btn4.setImageResource(R.drawable.ra);
                    mBtn4 = 0;
                }
                i++;
                mChoosePlayer();
                mWinningGame();
            }
        });

        btn5.setOnClickListener(v -> {
            if(mBtn5!=1 && mBtn5 != 0) {
                if (mStart == 'X') {
                    btn5.setImageResource(R.drawable.godra);
                    mBtn5 = 1;
                } else {
                    btn5.setImageResource(R.drawable.ra);
                    mBtn5 = 0;
                }
                i++;
                mChoosePlayer();
                mWinningGame();
            }
        });

        btn6.setOnClickListener(v -> {
            if(mBtn6!=1 && mBtn6 != 0) {
                if (mStart == 'X') {
                    btn6.setImageResource(R.drawable.godra);
                    mBtn6 = 1;
                } else {
                    btn6.setImageResource(R.drawable.ra);
                    mBtn6 = 0;
                }
                i++;
                mChoosePlayer();
                mWinningGame();
            }
        });

        btn7.setOnClickListener(v -> {
            if(mBtn7!=1 && mBtn7 != 0) {
                if (mStart == 'X') {
                    btn7.setImageResource(R.drawable.godra);
                    mBtn7 = 1;
                } else {
                    btn7.setImageResource(R.drawable.ra);
                    mBtn7 = 0;
                }
                i++;
                mChoosePlayer();
                mWinningGame();
            }
        });

        btn8.setOnClickListener(v -> {
            if(mBtn8!=1 && mBtn8 != 0) {
                if (mStart == 'X') {
                    btn8.setImageResource(R.drawable.godra);
                    mBtn8 = 1;
                } else {
                    btn8.setImageResource(R.drawable.ra);
                    mBtn8 = 0;
                }
                i++;
                mChoosePlayer();
                mWinningGame();
            }
        });

        btn9.setOnClickListener(v -> {
            if(mBtn9 !=1 && mBtn9 != 0) {
                if (mStart == 'X') {
                    btn9.setImageResource(R.drawable.godra);
                    mBtn9 = 1;
                } else {
                    btn9.setImageResource(R.drawable.ra);
                    mBtn9 = 0;
                }
                i++;
                mChoosePlayer();
                mWinningGame();
            }
        });
    }

    private void mWinningGame() {
        if(isRoundFinished){
            return;
        }
		
        if((mBtn1==1 && mBtn2 == 1 && mBtn3==1) || (mBtn4==1 && mBtn5==1 && mBtn6 == 1) || (mBtn7==1 && mBtn8==1 && mBtn9 == 1)
                || (mBtn1==1 && mBtn4==1 && mBtn7 == 1) || (mBtn2==1 && mBtn5==1 && mBtn8 == 1)  || (mBtn3==1 && mBtn6==1 && mBtn9 == 1)
                || (mBtn1==1 && mBtn5==1 && mBtn9 == 1) || (mBtn3==1 && mBtn5==1 && mBtn7 == 1)){
            isRoundFinished = true;
            countX++;
            AlertDialog.Builder adb = new AlertDialog.Builder(this);
            adb.setTitle("Game Result!");
            adb.setCancelable(false);
            adb.setMessage("Player God ra wins the game Score is " +countX);

            adb.setPositiveButton("Next round", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    mReadyForNextRound();
                }
            });
            adb.setNegativeButton("Reset Game",new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface d,int i){
                    mResetGame();
                }
            });

            AlertDialog ad=adb.create();
            ad.show();
            txtScorera.setText("God ra: "+countX);
        }

        else if((mBtn1==0 && mBtn2 == 0 && mBtn3==1) || (mBtn4==0 && mBtn5==0 && mBtn6 == 0) || (mBtn7==0 && mBtn8==0 && mBtn9 == 0)
                || (mBtn1==0 && mBtn4==0 && mBtn7 == 0) || (mBtn2==0 && mBtn5==0 && mBtn8 == 0)  || (mBtn3==0 && mBtn6==0 && mBtn9 == 0)
                || (mBtn1==0 && mBtn5==0 && mBtn9 == 0) || (mBtn3==0 && mBtn5==0 && mBtn7 == 0)){
            isRoundFinished = true;
            countO++;
            AlertDialog.Builder adb = new AlertDialog.Builder(this);
            adb.setTitle("Game Result!");
            adb.setCancelable(false);
            adb.setMessage("Player ra wins the game Score is " +countO);

            adb.setPositiveButton("Next round", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    mReadyForNextRound();
                }
            });
            adb.setNegativeButton("Reset Game",new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface d,int i){
                    mResetGame();
                }
            });
            AlertDialog ad=adb.create();
            ad.show();
            txtScoregodra.setText("Score ra: "+countO);
        }
        else if(i>=9){
            draw++;
            isRoundFinished = true;
            txtDraw.setText("Draw: " +draw);
            AlertDialog.Builder adb = new AlertDialog.Builder(this);
            adb.setTitle("Game Result!");
            adb.setCancelable(false);
            adb.setMessage("Draw no one wins!");

            adb.setPositiveButton("Next round", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    mReadyForNextRound();
                }
            });
            adb.setNegativeButton("Reset Game",new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface d,int i){
                    mResetGame();
                }
            });
            AlertDialog ad=adb.create();
            ad.show();
        }
    }

    private void mChoosePlayer() {
        mStart = (mStart=='X') ? 'O' : 'X';

    }


    private void mInitializeResources(){
        btn1 = findViewById(R.id.img_main_btn1);
        btn2 = findViewById(R.id.img_main_btn2);
        btn3 = findViewById(R.id.img_main_btn3);
        btn4 = findViewById(R.id.img_main_btn4);
        btn5 = findViewById(R.id.img_main_btn5);
        btn6 = findViewById(R.id.img_main_btn6);
        btn7 = findViewById(R.id.img_main_btn7);
        btn8 = findViewById(R.id.img_main_btn8);
        btn9 = findViewById(R.id.img_main_btn9);
        
        txtScorera = findViewById(R.id.txt_main_scoreX);
        txtScoregodra = findViewById(R.id.txt_main_scoreO);
        txtDraw = findViewById(R.id.txt_main_draw);

        btnReset = findViewById(R.id.btn_main_reset);
    }

    private void mResetGame(){
        isRoundFinished = false;

        btn1.setImageDrawable(null);
        btn2.setImageDrawable(null);
        btn3.setImageDrawable(null);
        btn4.setImageDrawable(null);
        btn5.setImageDrawable(null);
        btn6.setImageDrawable(null);
        btn7.setImageDrawable(null);
        btn8.setImageDrawable(null);
        btn9.setImageDrawable(null);

        mBtn1 = 5;
        mBtn2 = 5;
        mBtn3 = 5;
        mBtn4 = 5;
        mBtn5 = 5;
        mBtn6 = 5;
        mBtn7 = 5;
        mBtn8 = 5;
        mBtn9 = 5;

        countO = 0;
        countX = 0;
        draw = 0;

        txtScorera.setText("God ra: 0");
        txtScoregodra.setText("ra: 0");
        txtDraw.setText("Draw: 0");

        mStart = 'X';

        i = 0;
    }

    private void mReadyForNextRound(){
        isRoundFinished = false;

        btn1.setImageDrawable(null);
        btn2.setImageDrawable(null);
        btn3.setImageDrawable(null);
        btn4.setImageDrawable(null);
        btn5.setImageDrawable(null);
        btn6.setImageDrawable(null);
        btn7.setImageDrawable(null);
        btn8.setImageDrawable(null);
        btn9.setImageDrawable(null);

        mBtn1 = 5;
        mBtn2 = 5;
        mBtn3 = 5;
        mBtn4 = 5;
        mBtn5 = 5;
        mBtn6 = 5;
        mBtn7 = 5;
        mBtn8 = 5;
        mBtn9 = 5;

        i = 0;
    }
}