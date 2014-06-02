package com.example.estructurasdecontrol;

import java.text.BreakIterator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class EBC_MainActivity extends Activity {
	TextView txv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ebc__main);
		txv = (TextView) findViewById(R.id.textoPrincipal);
		estructurasBasicasControl(txv);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ec__main, menu);
		return true;
	}

	// Estructuras basicas de control
	public void estructurasBasicasControl(TextView tv1) {
		// Condicionales
		// if , switch
		if (true) {// Verdadero o Falso
			// Verdadero
			tv1.setText("Jhonatan");
		} else {
			// Falso
			tv1.setText("Usuario");
		}
		
		String recuperado="";
		
		switch (txv.getBottom()) {// variable de cualquier tipo
		
		case 0:
			recuperado=tv1.getText().toString();
			tv1.setText(recuperado+"\n"+"Como estas");
			break;
		case 1:
			break;
		default:
			recuperado=tv1.getText().toString();
			tv1.setText(recuperado+" El valor es true...\n");

			break;

		}

		// Repetitivas
		// for , while
		int suma=0;
		for (int i = 0; i < 10; i++) {
			// operaciones
			suma+=i;
			

		}
		tv1.setText(suma+"");
		
		int sum=0;
		int x = 0;
		while (x <= 5) {
			// operaciones
			sum+=x;
			
			x++;

		}
		
		tv1.setText(sum+"");

	}

}
