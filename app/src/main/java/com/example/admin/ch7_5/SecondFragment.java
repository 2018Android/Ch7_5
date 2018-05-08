package com.example.admin.ch7_5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {
    //final 為常數
    //傳遞參數更改TextView
    private static final String MESSAGE = "MESSAGE";
    private String msg="";
    public static  SecondFragment newInstance(String msg){
        SecondFragment fragment = new SecondFragment();  //建立 SecondFragment 物件
        Bundle args = new Bundle();                      //建立參數 args 物件
        args.putString(MESSAGE, msg);                  //將參數物件綁上參數 MESSAGE
        fragment.setArguments(args);                      //將 Fragment 物件綁上參數
        return fragment;                                  //回傳 Fragment 物件
    }

    public SecondFragment() {
        // Required empty public constructor
    }

    //建立 onCreate 方法
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if(getArguments() != null){     //如果參數列不是空值
            msg = getArguments().getString(MESSAGE);  //取得名稱為 MESSAGE 的參數
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        //如果 msg 不畏空值，TextView 則顯示 msg文字
        if(msg != ""){
            TextView output = (TextView)view.findViewById(R.id.txv_output);
            output.setText(msg);
        }
        return view;
    }

}
