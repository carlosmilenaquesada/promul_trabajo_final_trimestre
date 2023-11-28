package com.example.promul_trabajo_final_trimestre;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ViewHolder>{
	private List<Producto> productoList;
	private Context context;

	public ProductoAdapter(Context context, List<Producto> productoList){
		this.context = context;
		this.productoList = productoList;
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.producto_layout,
				parent, false);
		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(ViewHolder holder, int position){
		Producto producto = productoList.get(position);
		holder.nombreProductoTextView.setText(producto.getNombre());
		holder.plataformaProductoTextView.setText(producto.getPlataforma());
		holder.generoProductoTextView.setText(producto.getGenero());
		holder.precioProductoTextView.setText(String.valueOf(producto.getPrecio()));
		holder.imagenProductoImageView.setImageResource(R.drawable.imagen_no_disponible);
	}

	@Override
	public int getItemCount(){
		return productoList.size();
	}

	public class ViewHolder extends RecyclerView.ViewHolder{
		TextView nombreProductoTextView;
		TextView plataformaProductoTextView;
		TextView generoProductoTextView;
		TextView precioProductoTextView;
		ImageView imagenProductoImageView;

		public ViewHolder(View itemView){
			super(itemView);
			nombreProductoTextView = itemView.findViewById(R.id.nombreProductoTextView);
			plataformaProductoTextView = itemView.findViewById(R.id.plataformaProductoTextView);
			generoProductoTextView = itemView.findViewById(R.id.generoProductoTextView);
			precioProductoTextView = itemView.findViewById(R.id.precioProductoTextView);
			imagenProductoImageView = itemView.findViewById(R.id.imagenProductoImageView);
		}
	}
}
