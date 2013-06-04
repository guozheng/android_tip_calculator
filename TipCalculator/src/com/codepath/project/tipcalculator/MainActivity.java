package com.codepath.project.tipcalculator;

import java.text.NumberFormat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button button10p = (Button)findViewById(R.id.button10p);
        button10p.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				calculate(0.1);
			}
		});
        
        Button button15p = (Button)findViewById(R.id.button15p);
        button15p.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				calculate(0.15);
			}
		});
        
        Button button20p = (Button)findViewById(R.id.button20p);
        button20p.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				calculate(0.2);
			}
		});
    }
    
    private void calculate(double p) {
    	EditText editTextTotal = (EditText)findViewById(R.id.editTextTotal);
		double total = 0;
		if (!editTextTotal.getText().toString().equals("")) {
			total = Double.parseDouble(editTextTotal.getText().toString());
		}
		TextView textViewTip = (TextView)findViewById(R.id.textViewTip);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		textViewTip.setText("Tip is: " + formatter.format(total * p));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
