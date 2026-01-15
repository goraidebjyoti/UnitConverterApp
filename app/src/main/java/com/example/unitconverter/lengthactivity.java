package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class lengthactivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lengthactivity);

        Spinner fromLength = findViewById(R.id.fromLength);
        Spinner toLength = findViewById(R.id.toLength);
        Button convert = findViewById(R.id.convertLength);
        EditText lengthEnter = findViewById(R.id.lengthEnter);
        TextView lengthView =findViewById(R.id.lengthView);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.lengthList, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromLength.setAdapter(adapter1);
        fromLength.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.lengthList, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        toLength.setAdapter(adapter2);
        toLength.setOnItemSelectedListener(this);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String checkEmpty = lengthEnter.getText().toString();
                if(TextUtils.isEmpty(checkEmpty)) {
                    lengthEnter.setError("Field can't be empty.");
                }
                else {
                    double val = Double.parseDouble(checkEmpty);
                    if (fromLength.getSelectedItem().toString().equals(toLength.getSelectedItem().toString())) {
                        if (fromLength.getSelectedItem().toString().equals("Millimetres")) {
                            lengthView.setText(String.valueOf(val)+"mm");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Metres")) {
                            lengthView.setText(String.valueOf(val)+"m");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Kilometres")) {
                            lengthView.setText(String.valueOf(val)+"km");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Inches")) {
                            lengthView.setText(String.valueOf(val)+"in");
                        }
                        if (fromLength.getSelectedItem().toString().equals("Feet")) {
                            lengthView.setText(String.valueOf(val)+"ft");
                        }
                    }
                    else {
                        if (fromLength.getSelectedItem().toString().equals("Millimetres")&&toLength.getSelectedItem().toString().equals("Centimetres")) {
                            lengthView.setText(String.valueOf(val/10)+"cm");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Millimetres")&&toLength.getSelectedItem().toString().equals("Metres")) {
                            lengthView.setText(String.valueOf(val/1000)+"m");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Millimetres")&&toLength.getSelectedItem().toString().equals("Kilometres")) {
                            lengthView.setText(String.valueOf(val/1000000)+"km");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Millimetres")&&toLength.getSelectedItem().toString().equals("Inches")) {
                            lengthView.setText(String.valueOf(val/25.4)+"in");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Millimetres")&&toLength.getSelectedItem().toString().equals("Feet")) {
                            lengthView.setText(String.valueOf(val/305)+"ft");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Centimetres")&&toLength.getSelectedItem().toString().equals("Millimetres")) {
                            lengthView.setText(String.valueOf(val*10)+"mm");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Centimetres")&&toLength.getSelectedItem().toString().equals("Metres")) {
                            lengthView.setText(String.valueOf(val/100)+"m");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Centimetres")&&toLength.getSelectedItem().toString().equals("Kilometres")) {
                            lengthView.setText(String.valueOf(val/100000)+"km");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Centimetres")&&toLength.getSelectedItem().toString().equals("Inches")) {
                            lengthView.setText(String.valueOf(val/2.54)+"in");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Centimetres")&&toLength.getSelectedItem().toString().equals("Feet")) {
                            lengthView.setText(String.valueOf(val/30.48)+"ft");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Metres")&&toLength.getSelectedItem().toString().equals("Millimetres")) {
                            lengthView.setText(String.valueOf(val*1000)+"mm");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Metres")&&toLength.getSelectedItem().toString().equals("Centimetres")) {
                            lengthView.setText(String.valueOf(val*100)+"cm");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Metres")&&toLength.getSelectedItem().toString().equals("Kilometres")) {
                            lengthView.setText(String.valueOf(val/1000)+"km");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Metres")&&toLength.getSelectedItem().toString().equals("Inches")) {
                            lengthView.setText(String.valueOf(val/39.37)+"in");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Metres")&&toLength.getSelectedItem().toString().equals("Feet")) {
                            lengthView.setText(String.valueOf(val*3.281)+"ft");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Kilometres")&&toLength.getSelectedItem().toString().equals("Millimetres")) {
                            lengthView.setText(String.valueOf(val*1000000)+"mm");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Kilometres")&&toLength.getSelectedItem().toString().equals("Centimetres")) {
                            lengthView.setText(String.valueOf(val*100000)+"cm");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Kilometres")&&toLength.getSelectedItem().toString().equals("Metres")) {
                            lengthView.setText(String.valueOf(val/1000)+"m");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Kilometres")&&toLength.getSelectedItem().toString().equals("Inches")) {
                            lengthView.setText(String.valueOf(val*39370)+"in");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Kilometres")&&toLength.getSelectedItem().toString().equals("Feet")) {
                            lengthView.setText(String.valueOf(val*3281)+"ft");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Inches")&&toLength.getSelectedItem().toString().equals("Millimetres")) {
                            lengthView.setText(String.valueOf(val*25.4)+"mm");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Inches")&&toLength.getSelectedItem().toString().equals("Centimetres")) {
                            lengthView.setText(String.valueOf(val*2.54)+"cm");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Inches")&&toLength.getSelectedItem().toString().equals("Metres")) {
                            lengthView.setText(String.valueOf(val/39.37)+"m");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Inches")&&toLength.getSelectedItem().toString().equals("Kilometres")) {
                            lengthView.setText(String.valueOf(val/39370)+"km");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Inches")&&toLength.getSelectedItem().toString().equals("Feet")) {
                            lengthView.setText(String.valueOf(val/12)+"ft");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Feet")&&toLength.getSelectedItem().toString().equals("Millimetres")) {
                            lengthView.setText(String.valueOf(val*305)+"mm");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Feet")&&toLength.getSelectedItem().toString().equals("Centimetres")) {
                            lengthView.setText(String.valueOf(val*30.48)+"cm");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Feet")&&toLength.getSelectedItem().toString().equals("Metres")) {
                            lengthView.setText(String.valueOf(val/3.281)+"m");
                        }
                        else if (fromLength.getSelectedItem().toString().equals("Feet")&&toLength.getSelectedItem().toString().equals("Kilometres")) {
                            lengthView.setText(String.valueOf(val/3281)+"km");
                        }
                        if (fromLength.getSelectedItem().toString().equals("Feet")&&toLength.getSelectedItem().toString().equals("Inches")) {
                            lengthView.setText(String.valueOf(val*12)+"in");
                        }
                    }

                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}