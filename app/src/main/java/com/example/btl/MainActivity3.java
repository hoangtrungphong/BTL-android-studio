package com.example.btl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity implements LayNDve {
TextView linktruyen;
String tr;
ArrayList<String>arr;
String idchuong;
//ImageView pre,next;
//    int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        init();
        anhxa();
        setup();
        setOnClick();
        new APILayND(this,idchuong).execute();
    }
    public void init(){
        Bundle bundle=getIntent().getBundleExtra("data");
        idchuong= bundle.getString("idchuong");
    }
    public void anhxa(){
        linktruyen=findViewById(R.id.doctruyen);
//        pre=findViewById(R.id.pre);
//        next=findViewById(R.id.next);
    }
    public void setup(){
        linktruyen.setMovementMethod(new ScrollingMovementMethod());
    }
    public void setOnClick(){
//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                LayNDve layNDve=new LayNDve() {
//                    @Override
//                    public void batDau() {
//                        Toast.makeText(MainActivity3.this,"dang lay du lieu",Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void ketThuc(String data) {
//                        arr=new ArrayList<>();
//                        try {
//                            JSONArray array=new JSONArray(data);
//                            for(int i=0;i<array.length();i++){
//                                tr=array.getString(i);
//                            }
//                            linktruyen.setText(tr);
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                    }
//
//                    @Override
//                    public void biLoi() {
//
//                    }
//                };
//                index=Integer.parseInt(idchuong)+1;
//                String s=String.valueOf(index);
//                idchuong=s;
//                new APILayND(layNDve,idchuong).execute();
//            }
//        });
//        pre.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                LayNDve layNDve=new LayNDve() {
//                    @Override
//                    public void batDau() {
//                        Toast.makeText(MainActivity3.this,"dang lay du lieu",Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void ketThuc(String data) {
//                        arr=new ArrayList<>();
//                        try {
//                            JSONArray array=new JSONArray(data);
//                            for(int i=0;i<array.length();i++){
//                                tr=array.getString(i);
//                            }
//                            linktruyen.setText(tr);
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                    }
//
//                    @Override
//                    public void biLoi() {
//
//                    }
//                };
//
//                index=Integer.parseInt(idchuong)-1;
//                String s=String.valueOf(index);
//                idchuong=s;
//                new APILayND(layNDve,idchuong).execute();
//            }
//        });
    }
    @Override
    public void batDau() {
        Toast.makeText(this,"dang lay du lieu",Toast.LENGTH_LONG).show();
    }

    @Override
    public void ketThuc(String data) {
        arr=new ArrayList<>();
        try {
            JSONArray array=new JSONArray(data);
            for(int i=0;i<array.length();i++){
                tr=array.getString(i);
            }
            linktruyen.setText(tr);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void biLoi() {
        Toast.makeText(this,"loi",Toast.LENGTH_LONG).show();
    }
}