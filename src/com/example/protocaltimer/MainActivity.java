package com.example.protocaltimer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends FragmentBuilder {
	@Override
	protected Fragment createFragment() {
		// TODO Auto-generated method stub
		return new Timer_screen();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		
		switch (item.getItemId()) {
		case R.id.action_add:
			show_detail_screen();
			return true;
		case R.id.action_search:
			show_search_screen();
		}
		return super.onOptionsItemSelected(item);
		//return false;
		
	}

	private void show_search_screen() {
		// TODO Auto-generated method stub
		getSupportFragmentManager().beginTransaction()
        .replace(R.id.fragmentContainer,
             new Search_screen())
             .addToBackStack("SearchFragment")
             .commit();
	}

	private void show_detail_screen() {
		// TODO Auto-generated method stub
		Log.e("Coco", "in timer screen open to show detail screen!!!");
		
		getSupportFragmentManager().beginTransaction()
        .replace(R.id.fragmentContainer,
             new Timer_detail_screen())
             .addToBackStack("DetailFragment")
             .commit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}



}
