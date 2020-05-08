package org.techtown.energychain;


import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MyPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        final Button NoticeButton = (Button)findViewById(R.id.NoticeButton);
        final Button EditPersonalButton = (Button)findViewById(R.id.EditPersonalButton);
        final Button TransactionHistoryButton = (Button)findViewById(R.id.TransactionHistoryButton);
        final Button ExchangeButton = (Button)findViewById(R.id.ExchangeButton);
        //final Button LogoutButton = (Button)findViewById(R.id.LogoutButton);
        final Button energymainButton = (Button)findViewById(R.id.energymainButton);
        final Button purchaseButton = (Button)findViewById(R.id.purchaseButton);
        final Button saleButton = (Button)findViewById(R.id.saleButton);
        final Button mydataButton = (Button)findViewById(R.id.mydataButton);

        // yeojin 05.03 01시
        final Intent passedIntent = getIntent();
        mInFo data = (mInFo)passedIntent.getParcelableExtra("data");

        TextView editText_name = (TextView) findViewById(R.id.editText_name);
        editText_name.setText(data.name_loggedIn);


        energymainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), MainActivity.class);
                mInFo data = (mInFo)passedIntent.getParcelableExtra("data");
                mainIntent.putExtra("data", data);
                startActivityForResult(mainIntent, 101);
            }
        });

        purchaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), Purchase.class);
                mInFo data = (mInFo)passedIntent.getParcelableExtra("data");
                mainIntent.putExtra("data", data);
                startActivityForResult(mainIntent, 101);
            }
        });


        saleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mainIntent = new Intent(getApplicationContext(), Sale.class);
                mInFo data = (mInFo)passedIntent.getParcelableExtra("data");
                mainIntent.putExtra("data", data);
                startActivityForResult(mainIntent, 101);
            }
        });


        mydataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), MyPage.class);
                mInFo data = (mInFo)passedIntent.getParcelableExtra("data");
                mainIntent.putExtra("data", data);
                startActivityForResult(mainIntent, 101);
            }
        });


        NoticeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MyPage.this, Notice.class); //공지사항
                startActivity(mainIntent);
            }});

        EditPersonalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(), EditMemberInfoActivity.class); // 개인정보수정
                mInFo data = (mInFo)passedIntent.getParcelableExtra("data");
                mainIntent.putExtra("data", data);
                startActivityForResult(mainIntent, 101);
            }});

        TransactionHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MyPage.this, TransactionHistory.class); //거래내역
                startActivity(mainIntent);
            }});

        ExchangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MyPage.this, charge_recharge.class);
                startActivity(mainIntent);
            }});
    }


}