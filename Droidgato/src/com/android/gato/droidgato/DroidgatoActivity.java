package com.android.gato.droidgato;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class DroidgatoActivity extends Activity {


	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.main);

		// Add event handlers

		// New Game
		Button buttonNewGame = (Button) findViewById(R.id.buttonNewGame);
		buttonNewGame.setOnClickListener(buttonNewGame_Click);

		// Continue
		Button buttonContinue = (Button) findViewById(R.id.buttonContinue);
		buttonContinue.setOnClickListener(buttonContinue_Click);

		// Quit
		Button buttonQuit = (Button) findViewById(R.id.buttonQuit);
		buttonQuit.setOnClickListener(buttonQuit_Click);
	}

	private OnClickListener buttonNewGame_Click = new OnClickListener() {
		public void onClick(View v) {

		}
	};

	private OnClickListener buttonContinue_Click = new OnClickListener() {
		public void onClick(View v) {
			// do something when the button is clicked
		}
	};

	private OnClickListener buttonQuit_Click = new OnClickListener() {
		public void onClick(View v) {
			finish();
		}
	};
}