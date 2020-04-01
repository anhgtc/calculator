package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Double;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,butAdd,butSub,butDiv,butMul,butEnter,butC,butCE,butBS,butChange;
    TextView txt1,txt2;
    Long number1,number2,ketqua,doi;
    String ss = "",calculation="",state="",s="";
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = (Button) findViewById(R.id.zero);
        b1 = (Button) findViewById(R.id.one);
        b2 = (Button) findViewById(R.id.two);
        b3 = (Button) findViewById(R.id.three);
        b4 = (Button) findViewById(R.id.four);
        b5 = (Button) findViewById(R.id.five);
        b6 = (Button) findViewById(R.id.six);
        b7 = (Button) findViewById(R.id.seven);
        b8 = (Button) findViewById(R.id.eight);
        b9 = (Button) findViewById(R.id.nine);
        butC = (Button) findViewById(R.id.c);
        butCE = (Button) findViewById(R.id.ce);
        butBS = (Button) findViewById(R.id.bs);
        butAdd = (Button) findViewById(R.id.add);
        butSub = (Button) findViewById(R.id.sub);
        butDiv = (Button) findViewById(R.id.div);
        butMul =(Button) findViewById(R.id.mul);
        butEnter = (Button) findViewById(R.id.enter);
        butChange = (Button) findViewById(R.id.change);
        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation!="")
                {
                    state = calculation;
                    calculation = "";
                    txt2.setText("");
                }
                ss = txt2.getText()+"0";
                if(ss.charAt(0) =='0' && ss.length()>1) ss = ss.substring(1);
                txt2.setText(ss);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation!="")
                {
                    state = calculation;
                    calculation = "";
                    txt2.setText("");
                }
                ss = txt2.getText()+"1";
                if(ss.charAt(0) =='0') ss = ss.substring(1);
                txt2.setText(ss);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation!="")
                {
                    state = calculation;
                    calculation = "";
                    txt2.setText("");
                }
                ss = txt2.getText()+"2";
                if(ss.charAt(0) =='0') ss = ss.substring(1);
                txt2.setText(ss);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation!="")
                {
                    state = calculation;
                    calculation = "";
                    txt2.setText("");
                }
                ss = txt2.getText()+"3";
                if(ss.charAt(0) =='0') ss = ss.substring(1);
                txt2.setText(ss);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation!="")
                {
                    state = calculation;
                    calculation = "";
                    txt2.setText("");
                }
                ss = txt2.getText()+"4";
                if(ss.charAt(0) =='0') ss = ss.substring(1);
                txt2.setText(ss);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation!="")
                {
                    state = calculation;
                    calculation = "";
                    txt2.setText("");
                }
                ss = txt2.getText()+"5";
                if(ss.charAt(0) =='0') ss = ss.substring(1);
                txt2.setText(ss);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation!="")
                {
                    state = calculation;
                    calculation = "";
                    txt2.setText("");
                }
                ss = txt2.getText()+"6";
                if(ss.charAt(0) =='0') ss = ss.substring(1);
                txt2.setText(ss);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation!="")
                {
                    state = calculation;
                    calculation = "";
                    txt2.setText("");
                }
                ss = txt2.getText()+"7";
                if(ss.charAt(0) =='0') ss = ss.substring(1);
                txt2.setText(ss);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation!="")
                {
                    state = calculation;
                    calculation = "";
                    txt2.setText("");
                }
                ss = txt2.getText()+"8";
                if(ss.charAt(0) =='0') ss = ss.substring(1);
                txt2.setText(ss);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation!="")
                {
                    state = calculation;
                    calculation = "";
                    txt2.setText("");
                }
                ss = txt2.getText()+"9";
                if(ss.charAt(0) =='0') ss = ss.substring(1);
                txt2.setText(ss);

            }
        });
        butAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation = "add";
                if(txt2.getText().toString()!="")
                {
                    txt1.setText(txt1.getText().toString()+txt2.getText().toString()+"+");
                    number1 = Long.parseLong(txt2.getText().toString());
                    txt2.setText("");
                } else {
                    txt1.setText(txt1.getText().toString().substring(0,txt1.getText().toString().length()-1)+"+");
                }
            }
        });
        butSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation = "sub";
                if(txt2.getText().toString()!="")
                {
                    txt1.setText(txt1.getText().toString()+txt2.getText().toString()+"-");
                    number1 = Long.parseLong(txt2.getText().toString());
                    txt2.setText("");
                } else {
                    txt1.setText(txt1.getText().toString().substring(0,txt1.getText().toString().length()-1)+"-");
                }
            }
        });
        butMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation = "mul";
                if(txt2.getText().toString()!="")
                {
                    txt1.setText(txt1.getText().toString()+txt2.getText().toString()+"x");
                    number1 = Long.parseLong(txt2.getText().toString());
                    txt2.setText("");
                } else {
                    txt1.setText(txt1.getText().toString().substring(0,txt1.getText().toString().length()-1)+"x");
                }
            }
        });
        butDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation = "div";
                if(txt2.getText().toString()!="")
                {
                    txt1.setText(txt1.getText().toString()+txt2.getText().toString()+"/");
                    number1 = Long.parseLong(txt2.getText().toString());
                    txt2.setText("");
                } else {
                    txt1.setText(txt1.getText().toString().substring(0,txt1.getText().toString().length()-1)+"/");
                }
            }
        });
        butBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2.setText(txt2.getText().toString().substring(0,txt2.getText().toString().length()-1));
                if (txt2.getText().toString().length()==0) txt2.setText("0");
            }
        });
        butC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("");
                txt2.setText("0");
            }
        });
        butCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2.setText("0");
            }
        });
        butEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText().toString()+txt2.getText().toString());
                number2 = Long.parseLong(txt2.getText().toString());
                switch (state){
                    case "add": {
                        ketqua = number1 + number2;
                        break;
                    }
                    case "sub": {
                        ketqua = number1 - number2;
                        break;
                    }
                    case "mul": {
                        ketqua = number1 * number2;
                        break;
                    }
                    case "div": {
                        ketqua = number1 / number2;
                        break;
                    }

                }
                txt2.setText(Long.toString(ketqua));
                txt1.setText("");
            }
        });
        butChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doi = Long.parseLong(txt2.getText().toString());
                doi = -doi;
                txt2.setText(Long.toString(doi));

            }
        });


    }
}
