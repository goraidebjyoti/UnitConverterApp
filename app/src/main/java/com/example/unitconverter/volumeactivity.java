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

public class volumeactivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumeactivity);

        Spinner fromVolume = findViewById(R.id.fromVolume);
        Spinner toVolume = findViewById(R.id.toVolume);
        Button convert = findViewById(R.id.convertVolume);
        EditText volumeEnter = findViewById(R.id.volumeEnter);
        TextView volumeView =findViewById(R.id.volumeView);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.volumeList, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromVolume.setAdapter(adapter1);
        fromVolume.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.volumeList, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        toVolume.setAdapter(adapter2);
        toVolume.setOnItemSelectedListener(this);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String checkEmpty = volumeEnter.getText().toString();
                if(TextUtils.isEmpty(checkEmpty)) {
                    volumeEnter.setError("Field can't be empty.");
                }
                else {
                    double val = Double.parseDouble(checkEmpty);
                    if (fromVolume.getSelectedItem().toString().equals(toVolume.getSelectedItem().toString())) {
                        if (fromVolume.getSelectedItem().toString().equals("Millilitres")) {
                            volumeView.setText(String.valueOf(val)+"ml");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Litres")) {
                            volumeView.setText(String.valueOf(val)+"l");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Imperial Gallons")) {
                            volumeView.setText(String.valueOf(val)+"gal");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Cubic Centimetres")) {
                            volumeView.setText(String.valueOf(val)+"cm3");
                        }
                        if (fromVolume.getSelectedItem().toString().equals("Cubic Feet")) {
                            volumeView.setText(String.valueOf(val)+"ft3");
                        }
                    }
                    else {
                        if (fromVolume.getSelectedItem().toString().equals("Millilitres")&&toVolume.getSelectedItem().toString().equals("Litres")) {
                            volumeView.setText(String.valueOf(val/1000)+"l");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Millilitres")&&toVolume.getSelectedItem().toString().equals("Imperial Gallons")) {
                            volumeView.setText(String.valueOf(val/3785)+"gal");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Millilitres")&&toVolume.getSelectedItem().toString().equals("Cubic Centimetres")) {
                            volumeView.setText(String.valueOf(val)+"cm3");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Millilitres")&&toVolume.getSelectedItem().toString().equals("Cubic Feet")) {
                            volumeView.setText(String.valueOf(val/28317)+"ft3");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Litres")&&toVolume.getSelectedItem().toString().equals("Millilitres")) {
                            volumeView.setText(String.valueOf(val*1000)+"ml");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Litres")&&toVolume.getSelectedItem().toString().equals("Imperial Gallons")) {
                            volumeView.setText(String.valueOf(val/4.546)+"gal");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Litres")&&toVolume.getSelectedItem().toString().equals("Cubic Centimetres")) {
                            volumeView.setText(String.valueOf(val*1000)+"cm3");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Litres")&&toVolume.getSelectedItem().toString().equals("Cubic Feet")) {
                            volumeView.setText(String.valueOf(val/28.317)+"ft3");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Imperial Gallons")&&toVolume.getSelectedItem().toString().equals("Millilitres")) {
                            volumeView.setText(String.valueOf(val*4546)+"ml");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Imperial Gallons")&&toVolume.getSelectedItem().toString().equals("Litres")) {
                            volumeView.setText(String.valueOf(val*4.546)+"l");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Imperial Gallons")&&toVolume.getSelectedItem().toString().equals("Cubic Centimetres")) {
                            volumeView.setText(String.valueOf(val*4546)+"cm3");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Imperial Gallons")&&toVolume.getSelectedItem().toString().equals("Cubic Feet")) {
                            volumeView.setText(String.valueOf(val/6.229)+"ft3");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Cubic Centimetres")&&toVolume.getSelectedItem().toString().equals("Millilitres")) {
                            volumeView.setText(String.valueOf(val)+"ml");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Cubic Centimetres")&&toVolume.getSelectedItem().toString().equals("Litres")) {
                            volumeView.setText(String.valueOf(val/1000)+"l");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Cubic Centimetres")&&toVolume.getSelectedItem().toString().equals("Imperial Gallons")) {
                            volumeView.setText(String.valueOf(val/4546)+"gal");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Cubic Centimetres")&&toVolume.getSelectedItem().toString().equals("Cubic Feet")) {
                            volumeView.setText(String.valueOf(val/28317)+"ft3");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Cubic Feet")&&toVolume.getSelectedItem().toString().equals("Millilitres")) {
                            volumeView.setText(String.valueOf(val*28317)+"ml");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Cubic Feet")&&toVolume.getSelectedItem().toString().equals("Litres")) {
                            volumeView.setText(String.valueOf(val*28.317)+"l");
                        }
                        else if (fromVolume.getSelectedItem().toString().equals("Cubic Feet")&&toVolume.getSelectedItem().toString().equals("Imperial Gallons")) {
                            volumeView.setText(String.valueOf(val*6.229)+"gal");
                        }
                        if (fromVolume.getSelectedItem().toString().equals("Cubic Feet")&&toVolume.getSelectedItem().toString().equals("Cubic Centimetres")) {
                            volumeView.setText(String.valueOf(val*28317)+"cm3");
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