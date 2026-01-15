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

public class weightactivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weightactivity);

        Spinner fromWeight = findViewById(R.id.fromWeight);
        Spinner toWeight = findViewById(R.id.toWeight);
        Button convert = findViewById(R.id.convertWeight);
        EditText weightEnter = findViewById(R.id.weightEnter);
        TextView weightView =findViewById(R.id.weightView);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.weightList, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromWeight.setAdapter(adapter1);
        fromWeight.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.weightList, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        toWeight.setAdapter(adapter2);
        toWeight.setOnItemSelectedListener(this);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String checkEmpty = weightEnter.getText().toString();
                if(TextUtils.isEmpty(checkEmpty)) {
                    weightEnter.setError("Field can't be empty.");
                }
                else {
                    double val = Double.parseDouble(checkEmpty);
                    if (fromWeight.getSelectedItem().toString().equals(toWeight.getSelectedItem().toString())) {
                        if (fromWeight.getSelectedItem().toString().equals("Milligrams")) {
                            weightView.setText(String.valueOf(val)+"mg");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Grams")) {
                            weightView.setText(String.valueOf(val)+"g");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Kilograms")) {
                            weightView.setText(String.valueOf(val)+"kg");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Pounds")) {
                            weightView.setText(String.valueOf(val)+"lb");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Tonnes")) {
                            weightView.setText(String.valueOf(val)+"t");
                        }
                        if (fromWeight.getSelectedItem().toString().equals("Ounces")) {
                            weightView.setText(String.valueOf(val)+"oz");
                        }
                    }
                    else {
                        if (fromWeight.getSelectedItem().toString().equals("Milligrams")&&toWeight.getSelectedItem().toString().equals("Grams")) {
                            weightView.setText(String.valueOf(val/1000)+"g");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Milligrams")&&toWeight.getSelectedItem().toString().equals("Kilograms")) {
                            weightView.setText(String.valueOf(val/1000000)+"kg");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Milligrams")&&toWeight.getSelectedItem().toString().equals("Pounds")) {
                            weightView.setText(String.valueOf(val/453592)+"lb");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Milligrams")&&toWeight.getSelectedItem().toString().equals("Tonnes")) {
                            weightView.setText(String.valueOf(val/1000000000)+"t");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Milligrams")&&toWeight.getSelectedItem().toString().equals("Ounces")) {
                            weightView.setText(String.valueOf(val/28350)+"oz");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Grams")&&toWeight.getSelectedItem().toString().equals("Milligrams")) {
                            weightView.setText(String.valueOf(val*1000)+"mg");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Grams")&&toWeight.getSelectedItem().toString().equals("Kilograms")) {
                            weightView.setText(String.valueOf(val/1000)+"kg");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Grams")&&toWeight.getSelectedItem().toString().equals("Pounds")) {
                            weightView.setText(String.valueOf(val/454)+"lb");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Grams")&&toWeight.getSelectedItem().toString().equals("Tonnes")) {
                            weightView.setText(String.valueOf(val/1000000)+"t");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Grams")&&toWeight.getSelectedItem().toString().equals("Ounces")) {
                            weightView.setText(String.valueOf(val/28.35) + "oz");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Kilograms")&&toWeight.getSelectedItem().toString().equals("Milligrams")) {
                            weightView.setText(String.valueOf(val/1000000)+"mg");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Kilograms")&&toWeight.getSelectedItem().toString().equals("Grams")) {
                            weightView.setText(String.valueOf(val/1000)+"g");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Kilograms")&&toWeight.getSelectedItem().toString().equals("Pounds")) {
                            weightView.setText(String.valueOf(val*2.205)+"lb");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Kilograms")&&toWeight.getSelectedItem().toString().equals("Tonnes")) {
                            weightView.setText(String.valueOf(val/1000)+"t");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Kilograms")&&toWeight.getSelectedItem().toString().equals("Ounces")) {
                            weightView.setText(String.valueOf(val*35.274)+"oz");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Pounds")&&toWeight.getSelectedItem().toString().equals("Milligrams")) {
                            weightView.setText(String.valueOf(val*453592)+"mg");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Pounds")&&toWeight.getSelectedItem().toString().equals("Grams")) {
                            weightView.setText(String.valueOf(val*454)+"g");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Pounds")&&toWeight.getSelectedItem().toString().equals("Kilograms")) {
                            weightView.setText(String.valueOf(val/2.205)+"kg");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Pounds")&&toWeight.getSelectedItem().toString().equals("Tonnes")) {
                            weightView.setText(String.valueOf(val/2205)+"t");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Pounds")&&toWeight.getSelectedItem().toString().equals("Ounces")) {
                            weightView.setText(String.valueOf(val*16)+"oz");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Tonnes")&&toWeight.getSelectedItem().toString().equals("Milligrams")) {
                            weightView.setText(String.valueOf(val*1000000000)+"mg");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Tonnes")&&toWeight.getSelectedItem().toString().equals("Grams")) {
                            weightView.setText(String.valueOf(val*1000000)+"g");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Tonnes")&&toWeight.getSelectedItem().toString().equals("Kilograms")) {
                            weightView.setText(String.valueOf(val*1000)+"kg");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Tonnes")&&toWeight.getSelectedItem().toString().equals("Pounds")) {
                            weightView.setText(String.valueOf(val*2205)+"lb");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Tonnes")&&toWeight.getSelectedItem().toString().equals("Ounces")) {
                            weightView.setText(String.valueOf(val*35274)+"oz");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Ounces")&&toWeight.getSelectedItem().toString().equals("Milligrams")) {
                            weightView.setText(String.valueOf(val*28350)+"mg");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Ounces")&&toWeight.getSelectedItem().toString().equals("Grams")) {
                            weightView.setText(String.valueOf(val*28.35)+"g");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Ounces")&&toWeight.getSelectedItem().toString().equals("Kilograms")) {
                            weightView.setText(String.valueOf(val/35.274)+"kg");
                        }
                        else if (fromWeight.getSelectedItem().toString().equals("Ounces")&&toWeight.getSelectedItem().toString().equals("Pounds")) {
                            weightView.setText(String.valueOf(val/16)+"lb");
                        }
                        if (fromWeight.getSelectedItem().toString().equals("Ounces")&&toWeight.getSelectedItem().toString().equals("Tonnes")) {
                            weightView.setText(String.valueOf(val/35274)+"t");
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