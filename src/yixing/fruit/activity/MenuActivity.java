package yixing.fruit.activity;

import com.jordan.lemongame.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MenuActivity extends Activity {
	
	private ImageButton startBtn;
	private ImageButton settingBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_activity);
		startBtn = (ImageButton) this.findViewById(R.id.startBtn);
		settingBtn = (ImageButton) this.findViewById(R.id.settingBtn);
		
		startBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MenuActivity.this,
						SampleGame.class));
				
			}
			
		});
		settingBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MenuActivity.this,
						SampleGame.class));
			}
			
		});
	}

}
