package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
	Button btn1; 
	TextView txt1, txt2;
	int i=0;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     btn1 =(Button)findViewById(R.id.button1);
     btn1.setOnClickListener(this);
     
     txt1 = (TextView)findViewById(R.id.textView1);
     txt2 = (TextView)findViewById(R.id.textView2);
     txt2.setText("Count =" + i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		++i;
		txt2.setText("Count =" + i);
		if(i%2==0)
			txt1.setText("せせ");
		if(i%2==1)
			txt1.setText("せせせせせ");	
		if(i==100)
			i=0;
	}
}
