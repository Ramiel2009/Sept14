package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener {
	
	TextView tv;
	Button btn1;
		
	char game[] = { '\u26F5', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~', '~' };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView tv = (TextView)findViewById(R.id.textView1);
		btn1 = (Button)findViewById(R.id.btn1);
		btn1.setOnClickListener(this);


		
		tv.setText(game, 0, game.length);
	}
		@Override 
		public void onClick (View v){
			
			switch (v.getId()){
			case R.id.btn1:
				tv.setText("test");
			}
		}
}
				
		

				