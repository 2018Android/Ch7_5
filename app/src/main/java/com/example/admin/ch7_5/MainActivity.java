package com.example.admin.ch7_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //建立物件
    FisrtFragment ff = new FisrtFragment();
    SecondFragment sf = new SecondFragment();
    SecondFragment sfi = new SecondFragment().newInstance("自帶參數的第二個Fragement片段");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //將第一個Fragment 片段加入frame中
        getSupportFragmentManager().beginTransaction().add(R.id.frame, ff).commit();
    }
    //當按下取代第二個Fragement片段，frame顯示為第二個Fragement片段
    public void button_Click(View v){
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, sf).commit();
    }
    //當按下刪除第二個Fragement片段，frame刪除第二個Fragement片段
    public void button1_Click(View v){
        getSupportFragmentManager().beginTransaction().remove(sf).commit();
    }
    //當按下自帶參數片段，frame顯示為自帶參數的第二個Fragement片段
    public void button2_Click(View v){
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, sfi).commit();
    }
}
