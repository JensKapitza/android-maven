package your.company;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class HelloAndroidActivity extends Activity {

	/**
	 * Called when the activity is first created.
	 * 
	 * @param savedInstanceState
	 *            If the activity is being re-initialized after previously being
	 *            shut down then this Bundle contains the data it most recently
	 *            supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it
	 *            is null.</b>
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final Button btn = (Button) findViewById(R.id.btn1);
		
		btn.setOnClickListener((v) -> {
			if (btn.getText().equals("Hallo")) {
				btn.setText("Das ist cool");
			} else {
				btn.setText("Hallo");
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(your.company.R.menu.main, menu);
		return true;
	}

}
