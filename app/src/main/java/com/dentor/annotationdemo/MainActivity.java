package com.dentor.annotationdemo;

import android.content.DialogInterface;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivDemo;
    private TextView tvDemo;

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.btn_change_image:
                    // changeImage(R.drawable.ic_adb);
                    //  changeImage(R.string.app_name);
                    break;
                case R.id.btn_change_text:
                    changeText(R.string.txt_hello_newers);
                    break;
                case R.id.btn_change_text_color:
                    changeTextColorRes(R.color.colorTextRed);
                    break;
                case R.id.btn_change_dimen:
                    changeTextSize(R.dimen.size_demo_text_large);
                    break;

            }
        }
    };

    private void changeImage(@DrawableRes int ic_adb) {
        ivDemo.setImageResource(ic_adb);
    }

    private void changeTextColorRes(@ColorRes int color) {
        tvDemo.setTextColor(getResources().getColor(color));
    }

    private void changeText(@StringRes int text) {
        tvDemo.setText(text);
    }


    private void changeTextSize(@DimenRes int size) {
        tvDemo.setTextSize(getResources().getDimension(size));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivDemo = (ImageView) findViewById(R.id.iv_demo);
        tvDemo = (TextView) findViewById(R.id.tv_demo);
        findViewById(R.id.btn_change_image).setOnClickListener(onClickListener);
        findViewById(R.id.btn_change_text).setOnClickListener(onClickListener);
        findViewById(R.id.btn_change_text_color).setOnClickListener(onClickListener);
        findViewById(R.id.btn_change_dimen).setOnClickListener(onClickListener);
    }
}
