package com.example.lab3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	Button b_salam, b_hapus;
	EditText t_nama;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		t_nama = (EditText) findViewById(R.id.t_nama);
		b_salam = (Button) findViewById(R.id.b_salam);
		b_hapus = (Button) findViewById(R.id.b_hapus);
		b_hapus.setOnClickListener(this);
		b_salam.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b_hapus:
			t_nama.setText("");
			t_nama.setFocusable(true);
			break;
		case R.id.b_salam:
			String inputan = t_nama.getText().toString();
			if (inputan.isEmpty()) {
				Toast.makeText(this, "Inputan nama masih kosong", Toast.LENGTH_SHORT).show();
			}else{
				Toast.makeText(this, "Hello" + inputan, Toast.LENGTH_SHORT).show();
				
			}
			break;

		default:
			break;
		}
		// TODO Auto-generated method stub
		
	}

	

}
