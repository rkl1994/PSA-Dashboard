package com.example.dashboard;

import android.R.drawable;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	private TextView textDashSpeed;
	private TextView textDashSpeedUnit;
	private TextView textDashFunction;
	private TextView textDashGear;
	private Button dashSelectBtn;
	private Typeface dashNeLi;
	private int count;
	private RelativeLayout dashIcon;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initial();
	}

	private void initial() {
		// TODO Auto-generated method stub
		dashNeLi = Typeface.createFromAsset(getAssets(),"fonts/nexalight.ttf");
		textDashSpeed = (TextView)this.findViewById(R.id.dash_speed);
		textDashSpeedUnit = (TextView)this.findViewById(R.id.dash_speed_unit);
		textDashFunction = (TextView)this.findViewById(R.id.dash_hint);
		textDashGear = (TextView)this.findViewById(R.id.dash_gear);
		dashIcon = (RelativeLayout)this.findViewById(R.id.dash_icon);
		textDashSpeed.setTypeface(dashNeLi);
		textDashSpeedUnit.setTypeface(dashNeLi);
		textDashGear.setTypeface(dashNeLi);
		dashSelectBtn = (Button)this.findViewById(R.id.dash_change_btn);
		dashSelectBtn.setOnClickListener(this);
	}

	

	

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.dash_change_btn:
			count += 1;
			if(count==4)
			{
				textDashFunction.setText("导航");
				dashIcon.setBackgroundResource(R.drawable.dash_navi_icon);
				count = 0;
			}
			if(count==1)
			{
				textDashFunction.setText("音乐");
				dashIcon.setBackgroundResource(R.drawable.dash_music_icon);
			}
			if(count==2)
			{
				textDashFunction.setText("电台");
				dashIcon.setBackgroundResource(R.drawable.dash_radio_icon);
			}
			if(count==3)
			{
				textDashFunction.setText("电话");
				dashIcon.setBackgroundResource(R.drawable.dash_phone_icon);
			}
			
			break;

		default:
			break;
		}
			
	}

}
