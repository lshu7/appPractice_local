package com.example.protocaltimer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;

public abstract class FragmentBuilder extends FragmentActivity{
	
	protected abstract Fragment createFragment();

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		Log.e("Cocotest", "in builder!");
		setContentView(R.layout.activity_main);

		FragmentManager fragmentManager = getSupportFragmentManager();

		Fragment theFragment = fragmentManager.findFragmentById(R.id.fragmentContainer); 
		if(theFragment == null)
		{
			theFragment = createFragment();
			fragmentManager.beginTransaction()
			.add(R.id.fragmentContainer, theFragment)
			.commit();
		}


	}


}
