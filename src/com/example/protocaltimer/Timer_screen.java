package com.example.protocaltimer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class Timer_screen extends Fragment{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.e("cocotest","In Timer_screen on create");
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.e("cocotest","In Timer_screen on createview");
		View theView = inflater.inflate(R.layout.timer_screen, container, false); 
		
		return theView;
	}
	

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		// TODO Auto-generated method stub
		 Log.e("CocoTest","on item create in timer screen!!!");
		inflater.inflate(R.menu.main, menu);
		super.onCreateOptionsMenu(menu, inflater);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	   Log.e("CocoTest","on item click in timer screen!!!");
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
        case R.id.action_add:
            openDetailScreen();
            return true;
    }
		return super.onOptionsItemSelected(item);
	}

	private void openDetailScreen() {
		// TODO Auto-generated method stub
		Log.e("Coco", "in timer screen open detail screen!!!");
		Intent newIntent = new Intent(getActivity(),TimerDetailActivity.class);
		startActivityForResult(newIntent, 0);	
	}
     
    
}
