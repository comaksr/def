package com.meu.projeto;
import android.content.Intent;
import java.util.Timer;
import java.util.TimerTask;

import android.app.*;
import android.os.*;
import android.widget.*;

public class Splash extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
		
		
		Toast.makeText(getApplicationContext(),
					   "Aguarde carregando",Toast.LENGTH_SHORT)
			.show();
		new Timer().schedule(new TimerTask() {
				@Override
				public void run() {
					finish();
					Intent tela1 = new Intent (Splash.this,
											   MainActivity.class);
					startActivity(tela1);
					
				}
			}, 5000);
		
		
		
		
    }
}
