package com.mizzou.acm.android;

import com.mizzou.acm.android.R;
import com.mizzou.acm.android.helpers.GameCheck;
import com.mizzou.acm.android.helpers.GameLogic;
import com.mizzou.acm.android.helpers.GameRender;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {
	GameManager manager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//After the activity and its content is created, start the game loop.
		manager = new GameManager();
		this.startGameLoop();
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
