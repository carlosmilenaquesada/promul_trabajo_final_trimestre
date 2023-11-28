package com.example.promul_trabajo_final_trimestre;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
	private List<ItemModel> itemList;
	private Context context;

	public ItemAdapter(Context context, List<ItemModel> itemList) {
		this.context = context;
		this.itemList = itemList;
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(ViewHolder holder, int position) {
		ItemModel item = itemList.get(position);
		holder.itemNameTextView.setText(item.getItemName());
	}

	@Override
	public int getItemCount() {
		return itemList.size();
	}

	public class ViewHolder extends RecyclerView.ViewHolder {
		TextView itemNameTextView;

		public ViewHolder(View itemView) {
			super(itemView);
			itemNameTextView = itemView.findViewById(R.id.itemNameTextView);
		}
	}
}
