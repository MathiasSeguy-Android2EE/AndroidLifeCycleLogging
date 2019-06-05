package com.android2ee.tutorial.bug.android.lifecycle.logging;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MotherActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.e("MotherActivity", "onCreate called");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onResume()
	 */
	@Override
	protected void onResume() {
		Log.e("MotherActivity", "onResume called");
		super.onResume();
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onPause()
	 */
	@Override
	protected void onPause() {
		Log.e("MotherActivity", "onPause called");
		super.onPause();
	}


	/* (non-Javadoc)
	 * @see android.app.Activity#onDestroy()
	 */
	@Override
	protected void onDestroy() {
		Log.e("MotherActivity", "onDestroy called");
		super.onDestroy();
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onRestart()
	 */
	@Override
	protected void onRestart() {
		Log.e("MotherActivity", "onRestart called");
		super.onRestart();
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onStart()
	 */
	@Override
	protected void onStart() {
		Log.e("MotherActivity", "onStart called");
		super.onStart();
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onStop()
	 */
	@Override
	protected void onStop() {
		Log.e("MotherActivity", "onStop called");
		super.onStop();
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
