package com.mizzou.acm.android;

import com.mizzou.acm.android.R;
import com.mizzou.acm.android.helpers.GameLogic;
import com.mizzou.acm.android.helpers.GameRender;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {
	private GameLogic logic;
	private GameRender render;
	private GameCheck check;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//After the activity and its content is created, start the game loop.
		this.initializeHelpers();
		this.startGameLoop();
	}

	private void initializeHelpers()
	{//Initialize the three helpers.
		logic = new GameLogic();
		render = new GameRender();
		check = new GameCheck();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void startGameLoop()
	{//Game loop
		//Run until we close.
		boolean running = true;
		while(running)
		{//Logic: Update, Render, Check. There is a class for each of these.
			
		}
	}
}
