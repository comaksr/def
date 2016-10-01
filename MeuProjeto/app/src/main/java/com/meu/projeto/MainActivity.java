package com.meu.projeto;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends Activity {
	protected static Button bt1;
	
    @Override
 protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
	
	bt1 =(Button)findViewById(R.id.bt1);
    bt1.setOnClickListener(new View.OnClickListener(){
@Override
	public void onClick(View p1){
		finish();
	Intent tela1 = new Intent (MainActivity.this,
			Splash.class);
			startActivity(tela1);
			Toast.makeText(getApplicationContext(),
			"Voltou à tela 1",Toast.LENGTH_SHORT)
			.show();
					
				}
		});
		
		
    }
}
