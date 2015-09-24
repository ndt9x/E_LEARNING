package com.example.e_learning;

import java.util.ArrayList;

import com.example.database.MySQLiteOpenHelper;
import com.example.database.Story;
import com.example.database.Vocabulary;
import com.example.database.VocabularyApdapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class story_lesson extends Activity implements OnClickListener{

	private TextView tvStory_lesson, tvVol, tvTest, tvExer, tvStory, tvStory_content;
	private Button previous;
	private ImageView imgvol, imgSLexer, imgstory, imgSLtest,imgS;
	private MySQLiteOpenHelper database;
	private ArrayList<Story> arr;
	private Bundle bundle;
	private StoryAdapter adapter;
	private Context context;
	
	@Override
	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.story_lesson);
		context =  this;
		overridePendingTransition(R.anim.movereturn,0);
		imgvol = (ImageView)findViewById(R.id.imgSLvol);
		imgvol.setOnClickListener(this);
		imgSLexer = (ImageView)findViewById(R.id.imgSLexer);
		imgSLexer.setOnClickListener(this);
		imgSLtest = (ImageView)findViewById(R.id.imgSLtest);
		imgSLtest.setOnClickListener(this);
		tvStory_content = (TextView)findViewById(R.id.tvStory_content);
		tvStory_lesson = (TextView)findViewById(R.id.tvStory_lesson);
		imgstory = (ImageView)findViewById(R.id.imgSLstory);
		imgstory.setOnClickListener(this);
		imgS=(ImageView)findViewById(R.id.imgS);
		String image="icon4";
		int drawableResourceId = this.getResources().getIdentifier(image, "drawable", this.getPackageName());
		imgS.setImageResource(drawableResourceId);
		previous = (Button)findViewById(R.id.previous);
		previous.setOnClickListener(this);
		database=new MySQLiteOpenHelper(story_lesson.this);
		arr= database.getAllStory();
		if (arr.size()!=0) {
			bundle = getIntent().getExtras();
			tvStory_lesson.setText(arr.get(bundle.getInt("idStory")).getTen());
			tvStory_content.setText(arr.get(bundle.getInt("idStory")).getNoidung());
		}
		
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent();
		switch (v.getId()) {
		case R.id.previous:
			intent.setClass(this, story.class);
			startActivity(intent);	
			finish();
			break;
		case R.id.imgSLvol:
			intent.setClass(this, vocabulary.class);
			startActivity(intent);	
			finish();
			break;
		case R.id.imgSLtest:
			intent.setClass(this, test.class);
			startActivity(intent);
			finish();
			break;
		case R.id.imgSLexer:
			intent.setClass(this, exercise.class);
			startActivity(intent);
			finish();
			break;
		case R.id.imgSLstory:
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
		intent.setClass(this, story.class);
		startActivity(intent);
		finish();
	}

}
