package com.example.primerapp;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		Formulario f=getIntent().getParcelableExtra("formulario");
		//Obtengo los datos de la actividad anterior
		
		String nombre= f.getNombre();
		String apellido= f.getApellido();
		String edad= f.getEdad();
		String mail= f.getMail();
		
		// Instancio las variables TextView y la asocio con los text field del layout
				TextView txt_nombre2 = (TextView) findViewById(R.id.txt_nombre2);
				TextView txt_apellido2 = (TextView) findViewById(R.id.txt_apellido2);
				TextView txt_edad2 = (TextView) findViewById(R.id.txt_edad2);
				TextView txt_mail2 = (TextView) findViewById(R.id.txt_mail2);
		
		//Seteo los valores de los textField
				txt_nombre2.setText(nombre);
				txt_apellido2.setText(apellido);
				txt_edad2.setText(edad);
				txt_mail2.setText(mail);
		
	}

}
