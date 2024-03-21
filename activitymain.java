package com.example.imageview;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
    }

    public void scaleUp(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1f, 1.5f, 1f, 1.5f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(500);
        imageView.startAnimation(scaleAnimation);
    }

    public void scaleDown(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1f, 0.5f, 1f, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(500);
        imageView.startAnimation(scaleAnimation);
    }

    public void rotateClockwise(View view) {
        RotateAnimation rotateAnimation = new RotateAnimation(0, 90,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(500);
        imageView.startAnimation(rotateAnimation);
    }

    public void rotateCounterClockwise(View view) {
        RotateAnimation rotateAnimation = new RotateAnimation(0, -90,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(500);
        imageView.startAnimation(rotateAnimation);
    }

    public void zoomIn(View view) {
        imageView.setScaleX(imageView.getScaleX() + 0.1f);
        imageView.setScaleY(imageView.getScaleY() + 0.1f);
    }

    public void zoomOut(View view) {
        imageView.setScaleX(imageView.getScaleX() - 0.1f);
        imageView.setScaleY(imageView.getScaleY() - 0.1f);
    }

    public void setAlpha(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1f, 0.5f);
        alphaAnimation.setDuration(500);
        imageView.startAnimation(alphaAnimation);
    }
}
