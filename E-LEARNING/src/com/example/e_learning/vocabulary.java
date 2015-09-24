package com.example.e_learning;

import java.util.ArrayList;

import com.example.database.MySQLiteOpenHelper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class vocabulary extends Activity implements OnClickListener{

	private ImageView img_Vvol, img_Vtest, img_Vexer, img_Vstory;
	private TextView tvVVocabulary, tvVexer, tvVtest, tvVStory;
	private Context context;
	private ListView lvVol;
	private ArrayList<String> arrList = new ArrayList<String>();
	private VolAdapter adapter;
	private MySQLiteOpenHelper database;
//	Integer[] imgid={
//	 		R.drawable.icon1, R.drawable.icon5, 
//			R.drawable.icon3, R.drawable.icon7, 
//			R.drawable.icon4, R.drawable.icon10,
//			R.drawable.icon5, R.drawable.icon1,
//			R.drawable.icon6, R.drawable.icon9,
//			R.drawable.icon7, R.drawable.icon4,
//			R.drawable.icon8, R.drawable.icon3,
//			R.drawable.icon9, R.drawable.icon1,
//			R.drawable.icon10,R.drawable.icon5,
//			R.drawable.icon6, R.drawable.icon8,
//	};

	@Override
	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vocabulary);
		overridePendingTransition(R.anim.move, R.anim.movereturn);
		database = new MySQLiteOpenHelper(this);
		arrList= database.getAllLesson();
		lvVol = (ListView) findViewById(R.id.lvVol);
		adapter = new VolAdapter(this, R.layout.vol_item, arrList);
		lvVol.setAdapter(adapter);
		img_Vvol = (ImageView) findViewById(R.id.img_Vvol);
		img_Vvol.setOnClickListener(this);
		img_Vtest = (ImageView) findViewById(R.id.img_Vtest);
		img_Vtest.setOnClickListener(this);
		img_Vexer = (ImageView) findViewById(R.id.img_Vexer);
		img_Vexer.setOnClickListener(this);
		img_Vstory = (ImageView) findViewById(R.id.img_Vstory);
		img_Vstory.setOnClickListener(this);
		tvVVocabulary = (TextView) findViewById(R.id.tvVVocabulary);
		tvVexer = (TextView) findViewById(R.id.tvVexer);
		tvVtest = (TextView) findViewById(R.id.tvVtest);
		tvVStory = (TextView) findViewById(R.id.tvVStory);
		lvVol.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent intent = new Intent(vocabulary.this,vol_lesson.class);
				intent.putExtra("lesson", arrList.get(position));
				startActivity(intent);
				finish();

			}
		});
	};

	@Override
	public void onClick(View v) {
		Intent intent = new Intent();
		switch (v.getId()) {
		case R.id.img_Vvol:
			intent.setClass(this, vocabulary.class);
			startActivity(intent);
			finish();
			break;
		case R.id.img_Vexer:
			intent.setClass(this, exercise.class);
			startActivity(intent);
			finish();
			break;
		case R.id.img_Vtest:
			intent.setClass(this, test.class);
			startActivity(intent);
			finish();
			break;
		case R.id.img_Vstory:
			intent.setClass(this, story.class);
			startActivity(intent);
			finish();
			break;
		default:
			break;
		}

	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Intent intent = new Intent();
		intent.setClass(this, E_LEARNING.class);
		startActivity(intent);
		finish();
	}
}