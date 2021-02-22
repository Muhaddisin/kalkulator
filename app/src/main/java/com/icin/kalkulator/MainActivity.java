package com.icin.kalkulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextlayar;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button buttonbagi, buttonkali, buttonkurang, buttontambah, buttonkoma, buttonsamadengan;
    Button buttonclear, buttondelete, buttonor;

    public static double nilaisekarang = 0;
    public static String operasisekarang = "";
    public static double hasil = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    void init(){
        editTextlayar = (EditText)findViewById(R.id.editTextlayar);
        button0 = (Button)findViewById(R.id.button0);
        button0.setOnClickListener(this);

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);

        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);

        button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(this);

        button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(this);

        button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(this);

        button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(this);


        button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(this);


        buttonbagi = (Button)findViewById(R.id.buttonbagi);
        buttonbagi.setOnClickListener(this);

        buttonkali = (Button)findViewById(R.id.buttonkali);
        buttonkali.setOnClickListener(this);

        buttonkurang = (Button)findViewById(R.id.buttonkurang);
        buttonkurang.setOnClickListener(this);

        buttontambah = (Button)findViewById(R.id.buttontambah);
        buttontambah.setOnClickListener(this);

        buttonclear = (Button)findViewById(R.id.buttonclear);
        buttonclear.setOnClickListener(this);

        buttonor = (Button)findViewById(R.id.buttonor);
        buttonor.setOnClickListener(this);

        buttonkoma = (Button)findViewById(R.id.buttonkoma);
        buttonkoma.setOnClickListener(this);

        buttonsamadengan = (Button)findViewById(R.id.buttonsamadengan);
        buttonsamadengan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button0:
                editTextlayar.setText(editTextlayar.getText().toString().trim() + "0");
                break;
            case R.id.button1:
                editTextlayar.setText(editTextlayar.getText().toString().trim() + "1");
                break;
            case R.id.button2:
                editTextlayar.setText(editTextlayar.getText().toString().trim() + "2");
                break;
            case R.id.button3:
                editTextlayar.setText(editTextlayar.getText().toString().trim() + "3");
                break;
            case R.id.button4:
                editTextlayar.setText(editTextlayar.getText().toString().trim() + "4");
                break;
            case R.id.button5:
                editTextlayar.setText(editTextlayar.getText().toString().trim() + "5");
                break;
            case R.id.button6:
                editTextlayar.setText(editTextlayar.getText().toString().trim() + "6");
                break;
            case R.id.button7:
                editTextlayar.setText(editTextlayar.getText().toString().trim() + "7");
                break;
            case R.id.button8:
                editTextlayar.setText(editTextlayar.getText().toString().trim() + "8");
                break;
            case R.id.button9:
                editTextlayar.setText(editTextlayar.getText().toString().trim() + "9");
                break;

            case R.id.buttonor:
                editTextlayar.setText(editTextlayar.getText().toString().trim() + "-");
                break;

            case R.id.buttonkoma:
                editTextlayar.setText(editTextlayar.getText().toString().trim() + ".");
                break;

            case R.id.buttonbagi:
                if(editTextlayar.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this, "Angka harus di isi", Toast.LENGTH_SHORT).show();
                    return;
                }
                operasisekarang = "bagi";
                nilaisekarang = Double.parseDouble(editTextlayar.getText().toString());
                editTextlayar.setText("");
                break;
            case R.id.buttonkali:
                if(editTextlayar.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this, "Angka harus di isi", Toast.LENGTH_SHORT).show();
                    return;
                }
                operasisekarang = "kali";
                nilaisekarang = Double.parseDouble(editTextlayar.getText().toString());
                editTextlayar.setText("");
                break;
            case R.id.buttonkurang:
                if(editTextlayar.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this, "Angka harus di isi", Toast.LENGTH_SHORT).show();
                    return;
                }
                operasisekarang = "kurang";
                nilaisekarang = Double.parseDouble(editTextlayar.getText().toString());
                editTextlayar.setText("");
                break;
            case R.id.buttontambah:
                if(editTextlayar.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this, "Angka harus di isi", Toast.LENGTH_SHORT).show();
                    return;
                }
                operasisekarang = "tambah";
                nilaisekarang = Double.parseDouble(editTextlayar.getText().toString());
                editTextlayar.setText("");
                break;

            case R.id.buttonclear:
                nilaisekarang=0;
                editTextlayar.setText("");
                break;
            case R.id.buttondelete:
                break;
            case R.id.buttonsamadengan:
                if(operasisekarang.equals("tambah")){
                    hasil = nilaisekarang + Double.parseDouble(editTextlayar.getText().toString().trim());
                }
                if(operasisekarang.equals("kurang")){
                    hasil = nilaisekarang - Double.parseDouble(editTextlayar.getText().toString().trim());
                }
                if(operasisekarang.equals("bagi")){
                    hasil = nilaisekarang / Double.parseDouble(editTextlayar.getText().toString().trim());
                }
                if(operasisekarang.equals("kali")){
                    hasil = nilaisekarang * Double.parseDouble(editTextlayar.getText().toString().trim());
                }

                //hasil = 2.1
                //nilaitemp = 2
                int nilaitemp = (int) hasil;

                //nilai 2.1 == 2? tidak sama
                if(nilaitemp == hasil){
                    editTextlayar.setText(String.valueOf((int) hasil));
                }else{
                    editTextlayar.setText(String.valueOf(hasil));
                }

                break;
        }
    }
}