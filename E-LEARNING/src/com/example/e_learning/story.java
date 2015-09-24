package com.example.e_learning;

import java.util.ArrayList;

import com.example.database.MySQLiteOpenHelper;
import com.example.database.Story;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class story extends Activity implements OnClickListener{

	private ImageView img_SVol, img_SExer, img_STest, img_SStory;
	private TextView tvSExer, tvSVol, tvSTest, tvSStory, tvSBook;
	private ListView lvSLesson;
	private ArrayList<Story> arrList = new ArrayList<Story>();
	private StoryAdapter adapter;
	private Context context;
	
	private MySQLiteOpenHelper database;
	Integer[] imgid={
	 		R.drawable.img1, R.drawable.img2,
			R.drawable.img3, R.drawable.img4,
			R.drawable.img5, R.drawable.img6,
			R.drawable.img7, R.drawable.img8,
			R.drawable.img9, R.drawable.img10,
			R.drawable.img11, R.drawable.img12,
			R.drawable.img13, R.drawable.img1,
			R.drawable.img2,  R.drawable.img3,
			R.drawable.img4, R.drawable.img5,
			R.drawable.img6, R.drawable.img7,
			R.drawable.img8, R.drawable.img9,
			R.drawable.img10, R.drawable.img11,
			R.drawable.img12, R.drawable.img13
	};
	@Override
	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.story);
		
		database = new MySQLiteOpenHelper(this);
		arrList= database.getAllStory();
		overridePendingTransition(R.anim.movereturn,0);
		img_SVol = (ImageView) findViewById(R.id.img_SVol);
		img_SVol.setOnClickListener(this);
		img_STest = (ImageView) findViewById(R.id.img_STest);
		img_STest.setOnClickListener(this);
		img_SExer = (ImageView) findViewById(R.id.img_SExer);
		img_SExer.setOnClickListener(this);
		img_SStory = (ImageView) findViewById(R.id.img_SStory);
		img_SStory.setOnClickListener(this);
		tvSExer = (TextView) findViewById(R.id.tvSExer);
		tvSVol = (TextView) findViewById(R.id.tvSVol);
		tvSTest = (TextView) findViewById(R.id.tvSTest);
		tvSStory = (TextView) findViewById(R.id.tvSStory);
		tvSBook = (TextView) findViewById(R.id.tvSShortStory);
		adapter=new StoryAdapter(this, arrList, imgid, R.layout.story_item);
		lvSLesson=(ListView)findViewById(R.id.lvSLesson);
		lvSLesson.setAdapter(adapter);
		lvSLesson.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent intent=new Intent(story.this,story_lesson.class);
				intent.putExtra("idStory", position);
				startActivity(intent);
				
			}
		});

		
	};

	@Override
	public void onClick(View v) {
		Intent intent = new Intent();
		switch (v.getId()) {
		case R.id.img_SVol:
			intent.setClass(this, vocabulary.class);
			startActivity(intent);
			finish();
			break;
		case R.id.img_SExer:
			intent.setClass(this, exercise.class);
			startActivity(intent);
			finish();
			break;
		case R.id.img_STest:
			intent.setClass(this, test.class);
			startActivity(intent);
			finish();
			break;
		case R.id.img_SStory:
			intent.setClass(this, story.class);
			startActivity(intent);
			finish();
		default:
			break;
		}

	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Intent intent = new Intent();
		intent.setClass(this,E_LEARNING.class);
		startActivity(intent);
		finish();
	}
}
