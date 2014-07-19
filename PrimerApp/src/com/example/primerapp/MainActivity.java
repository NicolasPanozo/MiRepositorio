package com.example.primerapp;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void enviar_datos(View view){
		Formulario f= new Formulario();
		f.setNombre(((EditText) findViewById(R.id.txt_nombre)).getText().toString());
		f.setApellido(((EditText) findViewById(R.id.txt_apellido)).getText().toString());
		f.setEdad(((EditText) findViewById(R.id.txt_edad)).getText().toString());
		f.setMail(((EditText) findViewById(R.id.txt_mail)).getText().toString());
		// para activar otra activity y pasarle datos uso el intent
		Intent intent= new Intent(this, SecondActivity.class);
		intent.putExtra("formulario", f);
		//Inicio la otra actividad
		startActivity(intent);
	
	}
}
