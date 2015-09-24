package com.example.e_learning;

import java.util.ArrayList;

import com.example.database.Story;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class StoryAdapter extends ArrayAdapter<Story> {
	
	Activity context;
	ArrayList<Story>  itemname;
    Integer[] imgid;
    int layoutId;
	public StoryAdapter(Activity context, ArrayList<Story> itemname, Integer[] imgid, int layoutId) {
		super(context, layoutId,itemname);
		this.context = context;
		this.layoutId=layoutId;
		this.imgid = imgid;
		this.itemname = itemname;
		
	}
		
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			LayoutInflater inflater = context.getLayoutInflater();
			convertView = inflater.inflate(layoutId, null);}
		
		TextView txtTitle = (TextView) convertView.findViewById(R.id.tvStoryitem);
		ImageView imageView1 = (ImageView) convertView.findViewById(R.id.imgStoryitem1);
//		ImageView imageView2 = (ImageView) convertView.findViewById(R.id.imgStoryitem2);
		
		txtTitle.setText(itemname.get(position).getTen());
		imageView1.setImageResource(imgid[position]);
//		imageView2.setImageResource(imgid[position]);
		return convertView;
	}
	
}
