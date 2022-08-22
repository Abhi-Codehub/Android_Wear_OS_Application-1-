package com.example.roundorsquare;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.roundorsquare.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    int count = 0;
    public void plusOne(View view){
        count++;
        mTextView.setText(Integer.toString(count));

    }
    public void reset(View view){
        count = 0;
        mTextView.setText(Integer.toString(count));
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = (TextView) findViewById(R.id.textView);
    }
}