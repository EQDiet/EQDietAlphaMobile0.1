package com.example.eqdietmobile;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Objects declarations
    private EditText jEditText1;
    private EditText jEditText2;
    private TextView jTextView1;

    // Variables declarations
    short food;
    int kcal;
    long finalkcal;
    long quantity;
    String dish;
    String grams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Makes the objects usable
        jEditText1 = findViewById(R.id.editText1);
        jEditText2 = findViewById(R.id.editText2);
        jTextView1 = findViewById(R.id.textView2);
    }

    public void Eaten(){
        switch(food){
            case 1: //Bread
                kcal = 265;
                finalkcal = kcal * quantity / 100;
                jTextView1.setText("You have eaten " + finalkcal + " kilocalories");
                break;

            case 2: //Chocolate
                kcal = 546;
                finalkcal = kcal * quantity / 100;
                jTextView1.setText("You have eaten " + finalkcal + " kilocalories");
                break;

            case 3: //Milk
                kcal = 42;
                finalkcal = kcal * quantity / 100;
                jTextView1.setText("You have eaten " + finalkcal + " kilocalories");
                break;
        }
    }

    public void scanFood(View scFood) {
        try{
            dish = jEditText1.getText().toString().toLowerCase();
            grams = jEditText2.getText().toString();
            quantity = Long.parseLong(grams);

            if("bread".equals(dish)){
                food = 1;
                Eaten();
            } else if("chocolate".equals(dish)){
                food = 2;
                Eaten();
            } else if("milk".equals(dish)){
                food = 3;
                Eaten();
            } else {
                jTextView1.setText("The specified food does not actually exist");
            }
        } catch(NumberFormatException nex){
            if("what's eqdiet's website?".equals(dish) || "what is eqdiet's website?".equals(dish)) {
                jTextView1.setText("It's: eqdiet.weebly.com");
            } else {
                jTextView1.setText("Error:\nThe quantity you specified\nisn't a number");
            }
        }
    }
}