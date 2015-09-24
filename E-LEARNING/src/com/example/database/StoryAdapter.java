package com.example.database;

import java.security.PublicKey;
import java.util.ArrayList;

import com.example.e_learning.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class StoryAdapter extends ArrayAdapter<Story> {
	private ArrayList<Story> arrayList;
	private Story entity;
	private Activity context;
	int resource;

	public StoryAdapter(ArrayList<Story> arrayList, Activity context, int resource) {
		super(context, resource, arrayList);
		this.arrayList = arrayList;
		this.context = context;
		this.resource = resource;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
		LayoutInflater inflater = context.getLayoutInflater();
		convertView = inflater.inflate(resource, null);}
		TextView tvNoidung =(TextView)convertView.findViewById(R.id.tvStory_content);
		tvNoidung.setText(arrayList.get(position).getNoidung());
		return convertView;
	}

}
