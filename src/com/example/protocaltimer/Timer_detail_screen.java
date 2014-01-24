package com.example.protocaltimer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TimePicker;

public class Timer_detail_screen extends Fragment{

	private TimePicker stepTimePicker;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
        View theView = inflater.inflate(R.layout.timer_detail, container, false); 
        stepTimePicker = (TimePicker) theView.findViewById(R.id.stepTimePicker); 
        
        stepTimePicker.setIs24HourView(true);
		return theView;
	}
	

}
