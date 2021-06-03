package kr.qedlab.dots.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import kr.qedlab.dots.R;
import kr.qedlab.dots.fragment.DotFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}