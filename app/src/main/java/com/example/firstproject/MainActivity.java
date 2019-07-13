package com.example.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pet_age_layout);
    }
    public void buttonIsClicked(View v){

//        int a=5,b=5,c;
//        c=a*b;
//        Log.i("Multiply operation",c+"");
//
//        EditText edt =  findViewById(R.id.editText);
//        Log.i("Name",edt.getText().toString());
//
//
//        TextView txt =findViewById(R.id.edt);
//        Log.i("Text",txt.getText().toString());
//
//        EditText edtx =findViewById(R.id.edtPhone);
//        Log.i("Phone",edtx.getText().toString());
//
//        Toast.makeText(MainActivity.this,
//                "Your Name is :"+edt.getText().toString()+"\n"+
//                        "Your phone number is:"+edtx.getText().toString(),
//                Toast.LENGTH_SHORT).show();
//

//        ImageView img =findViewById(R.id.imageView);
//        img.setImageResource(R.drawable.britness);

        EditText edt =findViewById(R.id.editText2);
        int petAge = Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(edt.getText().toString());
        TextView txt =findViewById(R.id.pet_age);
        txt.setText(petAge+" is the total age upto this year");
        Log.i("Msg","This is a first app");
    }
}
