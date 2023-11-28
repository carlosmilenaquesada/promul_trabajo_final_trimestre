package com.example.promul_trabajo_final_trimestre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
	private RecyclerView recyclerView;
	private ItemAdapter itemAdapter;
	private List<ItemModel> itemList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		recyclerView = findViewById(R.id.recyclerView);
		itemList = generateItemList(); // Función para generar datos de ejemplo
		itemAdapter = new ItemAdapter(this, itemList);

		recyclerView.setLayoutManager(new LinearLayoutManager(this));
		recyclerView.setAdapter(itemAdapter);
	}

	private List<ItemModel> generateItemList() {
		List<ItemModel> list = new ArrayList<>();
		list.add(new ItemModel("Item 1"));
		list.add(new ItemModel("Item 2"));
		list.add(new ItemModel("Item 3"));
		// Agrega más elementos según sea necesario
		return list;
	}
}