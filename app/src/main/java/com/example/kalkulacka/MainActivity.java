package com.example.kalkulacka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnPlusOrMinus, btnNula, btnBodka,
            btnRovnaSa, btn1, btn2,
            btn3, btnPlus, btn4,
            btn5, btn6, btnMinus,
            btn7, btn8, btn9,
            btnNasobenie, btnCE, btnC,
            btnNaDruhu, btnDeleno;

    private double vysledok = 0;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        initialize();
        tlacitka();
    }

    public void initialize(){

        txt = (TextView) findViewById(R.id.txtVypis);
        btnPlusOrMinus = (Button) findViewById(R.id.btnPlusOrMinus);
        btnNula = (Button) findViewById(R.id.btnNula);
        btnBodka = (Button) findViewById(R.id.btnBodka);
        btnRovnaSa = (Button) findViewById(R.id.btnRovnaSa);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnNasobenie = (Button) findViewById(R.id.btnNasobenie);
        btnCE = (Button) findViewById(R.id.btnCE);
        btnC = (Button) findViewById(R.id.btnC);
        btnNaDruhu = (Button) findViewById(R.id.btnNaDruhu);
        btnDeleno = (Button)  findViewById(R.id.btnDeleno);

    }
    public void tlacitka(){

        btnNaDruhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!txt.getText().toString().contains("*") && !txt.getText().toString().contains("+") && !txt.getText().toString().substring(1).contains("-") && !txt.getText().toString().contains("/")){
                    vysledok = Double.parseDouble(txt.getText().toString())*Double.parseDouble(txt.getText().toString());
                    if(vysledok % 1 == 0){
                        int tmp = (int) vysledok;
                        txt.setText(String.valueOf(tmp));
                    }
                    else {
                        txt.setText(String.valueOf(vysledok));
                    }
                }

            }
        });

        btnRovnaSa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txt.getText().toString().contains("+")){
                    String string = txt.getText().toString();
                    String[] parts = string.split(" \\+ ");
                    double prve = Double.parseDouble(parts[0]);
                    double druhe = Double.parseDouble(parts[1]);
                    vysledok = prve + druhe;
                    if(vysledok % 1 == 0){
                        int tmp = (int) vysledok;
                        txt.setText(String.valueOf(tmp));
                    }
                    else {
                        txt.setText(String.valueOf(vysledok));
                    }

                }
                else if(txt.getText().toString().contains(" - ")){
                    String string = txt.getText().toString();
                    String[] parts = string.split(" - ");
                    double prve = Double.parseDouble(parts[0]);
                    double druhe = Double.parseDouble(parts[1]);
                    vysledok = prve - druhe;
                    if(vysledok % 1 == 0){
                        int tmp = (int) vysledok;
                        txt.setText(String.valueOf(tmp));
                    }
                    else {
                        txt.setText(String.valueOf(vysledok));
                    }
                }
                else if(txt.getText().toString().contains(" * ")){
                    String string = txt.getText().toString();
                    String[] parts = string.split(" * ");
                    double prve = Double.parseDouble(parts[0]);
                    double druhe = Double.parseDouble(parts[1]);
                    vysledok = prve * druhe;
                    if(vysledok % 1 == 0){
                        int tmp = (int) vysledok;
                        txt.setText(String.valueOf(tmp));
                    }
                    else {
                        txt.setText(String.valueOf(vysledok));
                    }
                }
                else if(txt.getText().toString().contains(" / ")){
                    String string = txt.getText().toString();
                    String[] parts = string.split(" / ");
                    double prve = Double.parseDouble(parts[0]);
                    double druhe = Double.parseDouble(parts[1]);
                    vysledok = prve / druhe;

                    if(vysledok % 1 == 0){
                        int tmp = (int) vysledok;
                        txt.setText(String.valueOf(tmp));
                    }
                    else {
                        txt.setText(String.valueOf(vysledok));
                    }

                }

            }
        });

        btnDeleno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!txt.getText().toString().contains("*") && !txt.getText().toString().contains("+") && !txt.getText().toString().substring(1).contains("-") && !txt.getText().toString().contains("/"))
                txt.setText(txt.getText().toString() + " / ");
            }
        });

        btnNasobenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!txt.getText().toString().contains("*") && !txt.getText().toString().contains("+") && !txt.getText().toString().substring(1).contains("-") && !txt.getText().toString().contains("/"))
                txt.setText(txt.getText().toString() + " * ");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!txt.getText().toString().contains("*") && !txt.getText().toString().contains("+") && !txt.getText().toString().substring(1).contains("-") && !txt.getText().toString().contains("/"))
                txt.setText(txt.getText().toString() + " - ");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!txt.getText().toString().contains("*") && !txt.getText().toString().contains("+") && !txt.getText().toString().substring(1).contains("-") && !txt.getText().toString().contains("/"))
                txt.setText(txt.getText().toString() + " + ");

            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((txt.getText().toString().charAt(txt.getText().toString().length()-1) == ' ' && txt.getText().toString().charAt(txt.getText().toString().length()-2) == '+' && txt.getText().toString().charAt(txt.getText().toString().length()-3) == ' ') ||
                        (txt.getText().toString().charAt(txt.getText().toString().length()-1) == ' ' && txt.getText().toString().charAt(txt.getText().toString().length()-2) == '-' && txt.getText().toString().charAt(txt.getText().toString().length()-3) == ' ') ||
                        (txt.getText().toString().charAt(txt.getText().toString().length()-1) == ' ' && txt.getText().toString().charAt(txt.getText().toString().length()-2) == '*' && txt.getText().toString().charAt(txt.getText().toString().length()-3) == ' ') ||
                        (txt.getText().toString().charAt(txt.getText().toString().length()-1) == ' ' && txt.getText().toString().charAt(txt.getText().toString().length()-2) == '/' && txt.getText().toString().charAt(txt.getText().toString().length()-3) == ' ')){
                    txt.setText(txt.getText().toString().substring(0, txt.getText().toString().length() - 3));
                }
                else{
                    if(!txt.getText().toString().equals("0")){
                        txt.setText(txt.getText().toString().substring(0, txt.getText().toString().length() - 1));
                    }

                    if(txt.getText().toString().equals("") || txt.getText().toString().equals("-")){
                        txt.setText("0");
                    }
                }

            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!txt.getText().toString().equals("0")){
                    txt.setText("0");
                }

            }
        });

        btnPlusOrMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!txt.getText().toString().equals("0") && txt.getText().toString().charAt(0) != '-'){
                    txt.setText("-"+txt.getText().toString());
                }
                else if(txt.getText().toString().charAt(0) == '-'){
                    txt.setText(txt.getText().toString().substring(1));
                }

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txt.getText().toString().equals("0")){
                    txt.setText("1");
                }
                else{
                    txt.setText(txt.getText().toString()+"1");
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txt.getText().toString().equals("0")){
                    txt.setText("2");
                }
                else{
                    txt.setText(txt.getText().toString()+"2");
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txt.getText().toString().equals("0")){
                    txt.setText("3");
                }
                else{
                    txt.setText(txt.getText().toString()+"3");
                }

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txt.getText().toString().equals("0")){
                    txt.setText("4");
                }
                else{
                    txt.setText(txt.getText().toString()+"4");
                }

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txt.getText().toString().equals("0")){
                    txt.setText("5");
                }
                else{
                    txt.setText(txt.getText().toString()+"5");
                }

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txt.getText().toString().equals("0")){
                    txt.setText("6");
                }
                else{
                    txt.setText(txt.getText().toString()+"6");
                }

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txt.getText().toString().equals("0")){
                    txt.setText("7");
                }
                else{
                    txt.setText(txt.getText().toString()+"7");
                }

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txt.getText().toString().equals("0")){
                    txt.setText("8");
                }
                else{
                    txt.setText(txt.getText().toString()+"8");
                }

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txt.getText().toString().equals("0")){
                    txt.setText("9");
                }
                else{
                    txt.setText(txt.getText().toString()+"9");
                }

            }
        });

        btnNula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txt.getText().toString().equals("0")){

                }
                else{
                    txt.setText(txt.getText().toString()+"0");
                }

            }
        });

        btnBodka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string = txt.getText().toString();
                String parts[] = null;
                if(string.contains("+")){
                    parts = string.split(" \\+ ");
                }
                else if(string.contains("-")){
                    parts = string.split(" - ");
                }
                else if (string.contains("/")){
                    parts = string.split(" / ");
                }
                else if (string.contains("X")){
                    parts = string.split(" X ");
                }

                if(parts == null){
                    if(!txt.getText().toString().contains(".") ){
                    txt.setText(txt.getText().toString()+".");
                    }
                }
                else{
                    if(parts.length == 1){
                        if(!parts[0].toString().contains(".")){
                            txt.setText(txt.getText().toString()+".");
                        }
                    }
                    else if(parts.length == 2){
                        if(!parts[1].toString().contains(".")){
                            txt.setText(txt.getText().toString()+".");
                        }
                    }
                }
            }
        });
    }
}

