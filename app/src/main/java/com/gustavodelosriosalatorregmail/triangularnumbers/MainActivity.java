package com.gustavodelosriosalatorregmail.triangularnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
public void checknumber (View view){
    EditText txtNumber=(EditText)findViewById(R.id.cajaNumero);
    TextView lblmessage=(TextView)findViewById(R.id.resultLabel);

    String sNumber=txtNumber.getText().toString().trim();
    Integer number=Integer.parseInt(sNumber);

    String message;
    if (squareNumbertrue(number)){
        message=sNumber+"Hey! its a squared number";
    }else{
        if (triangularNumbertrue(number)){
            message=sNumber+"Congrats! its a triangular number";
        }else{
            message=sNumber+"This number is neither Squared nor Triangular";
        }
    }
    lblmessage.setText(message);

}

public boolean squareNumbertrue (int number) {
    double squareRoot = Math.sqrt(number);

    if (squareRoot == Math.floor(squareRoot)) {
        return true;

    } else {
        return false;
    }
}
public boolean triangularNumbertrue (int number){
    int x=1;
    int triangularNumber= 1;

    while (triangularNumber<number){
        x++;
        triangularNumber+=x;
    }
    if (triangularNumber==number){
        return true;
    }else{
        return false;
    }

}