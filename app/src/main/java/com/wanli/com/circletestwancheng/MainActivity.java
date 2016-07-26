package com.wanli.com.circletestwancheng;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wanli.com.circleprogressview.CircleProgressView;


/**
 * 这是一个使用circleprogressveiw的例子，
 * github:
 *
 * */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView text1;
    private CircleProgressView circle;

    private TextView txt_start;
    private TextView txt_pause;
    private TextView txt_resume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        text1 = (TextView) findViewById(R.id.text1);
        circle = (CircleProgressView) findViewById(R.id.circle);

        txt_start = (TextView) findViewById(R.id.txt_start);
        txt_start.setOnClickListener(this);
        txt_pause = (TextView) findViewById(R.id.txt_pause);
        txt_pause.setOnClickListener(this);
        txt_resume = (TextView) findViewById(R.id.txt_resume);
        txt_resume.setOnClickListener(this);

        circle.setDurationsecondscurrent(1f);
        circle.setDurationSecondsMax(10f);
        text1.setText(String.valueOf(circle.getDurationsecondscurrent()));
        //circle.setTotalSeconds(1000*5);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txt_start:
                if (circle.isEnd()) {
                    circle.setDurationsecondscurrent(0);
                }
                circle.start(new CircleProgressView.OnProgressListener() {
                    @Override
                    public void onProgressListener(float progress) {
                        text1.setText(String.valueOf(progress)); //(int)
                    }

                    @Override
                    public void onProgressEnd(float progress) {
                        text1.setText(String.valueOf(progress));
                    }
                });
                break;
            case R.id.txt_pause:
                circle.pause();
                break;
            case R.id.txt_resume:
                circle.resume();
                break;
        }
    }
}
