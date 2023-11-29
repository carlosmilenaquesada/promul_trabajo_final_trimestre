package com.example.promul_trabajo_final_trimestre;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Catalogo extends AppCompatActivity{
	private RecyclerView recyclerView;
	private ProductoAdapter itemAdapter;
	private List<Producto> itemList;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.catalogo_layout);
		recyclerView = findViewById(R.id.recyclerView);
		itemList = generateItemList();
		itemAdapter = new ProductoAdapter(this, itemList);
		recyclerView.setLayoutManager(new LinearLayoutManager(this));
		recyclerView.setAdapter(itemAdapter);
	}

	private List<Producto> generateItemList(){
		List<Producto> list = new ArrayList<>();
		list.add(new Producto("zelda", "nintendo", "acción", 30.0));
		list.add(new Producto("god of war", "playstation", "acción", 30.0));
		list.add(new Producto("forza horizon", "xbox", "conducción", 30.0));
		list.add(new Producto("zelda", "nintendo", "acción", 30.0));
		list.add(new Producto("god of war", "playstation", "acción", 30.0));
		list.add(new Producto("forza horizon", "xbox", "conducción", 30.0));
		return list;
	}
}