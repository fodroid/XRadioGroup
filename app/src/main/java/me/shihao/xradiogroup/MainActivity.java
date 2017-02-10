package me.shihao.xradiogroup;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import me.shihao.library.XRadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        XRadioGroup xRadioGroup = (XRadioGroup) findViewById(R.id.xRadioGroup);
        xRadioGroup.setOnCheckedChangeListener(new XRadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(XRadioGroup group, @IdRes int checkedId) {
                Log.d("TAG", checkedId + "is checked");
            }
        });
    }
}
