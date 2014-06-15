package com.example.imagetest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity {
	private ImageView testimage;
	private Button testbutton;
	private SeekBar testseekbar;
	private FrameLayout.LayoutParams laParams;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		testbutton = (Button) findViewById(R.id.button1);
		testimage = (ImageView) findViewById(R.id.imageView1);
		laParams=(FrameLayout.LayoutParams)testimage.getLayoutParams();
		testseekbar = (SeekBar) findViewById(R.id.seekBar1);
		testseekbar.setMax(3000);
		testseekbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				int ff = 0;
				int jj = 11;
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				laParams.height = 50;
				laParams.width = progress/3;
				testimage.setLayoutParams(laParams);
			}
		});
		
		testbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				laParams.height = 300;
				laParams.width = 20;
				testimage.setLayoutParams(laParams);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
