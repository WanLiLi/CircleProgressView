# CircleProgressView
一个简单纯粹的圆形进度条

![circleProgressView.gif](https://github.com/WanLiLi/CircleProgressView/blob/master/circleProgressView.gif)



使用：
    compile 'com.wanlili:circleprogressview:1.0.1'
    
    XML中配置：
    <com.wanli.com.circleprogressview.CircleProgressView
        android:id="@+id/circle"
        android:layout_width="200dp"
        android:layout_height="200dp"
        android:layout_centerInParent="true"
        **
        app:c_colorCircle="@color/colorPrimary"
        app:c_colorProgress="@color/colorAccent"
        app:c_strokeWidth="20.0"
        **/>
    
    启动：
    一：circle.start(new CircleProgressView.OnProgressListener() {
                    @Override
                    public void onProgressListener(float progress) {
                        text1.setText(String.valueOf(progress)); //(int)
                    }

                    @Override
                    public void onProgressEnd(float progress) {
                        text1.setText(String.valueOf(progress));
                    }
                });
    二：circle.start();
    
    
    更多用法:
