package com.example.promul_trabajo_final_trimestre;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
	EditText etUsuario;
	EditText etContrasena;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		etUsuario = (EditText) findViewById(R.id.etUsuario);
		etContrasena = (EditText) findViewById(R.id.etContrasena);
	}

	public void verProductos(View view){
		Intent intent = new Intent(this, Catalogo.class);
		Log.d("hola", "hola");
		startActivity(intent);
	}
}