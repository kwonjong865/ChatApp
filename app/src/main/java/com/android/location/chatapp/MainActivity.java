package com.android.location.chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {

    Thread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thread = new Thread(){
            public void run(){
                connect();
            }
        };
    }

//    채팅서버에 접속을 시도하기위한 메소드
//    접속을 시도하려면, 일반 소켓이 있어야하고,
//    ip와 port번호를 알아야 접속이 가능하다.
//    android는 자바표준의 java.net을 그대로 사용할 수 있다.

    public void connect() {
            try{
                // 접속 시도
                Socket client = new Socket("192.168.13.18", 7777);
            }catch(IOException e){
                e.printStackTrace();
            }
    }

    public void btnClick(View view) {
        thread.start();
    }
}
