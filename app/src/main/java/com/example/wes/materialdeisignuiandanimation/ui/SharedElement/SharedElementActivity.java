package com.example.wes.materialdeisignuiandanimation.ui.SharedElement;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.wes.materialdeisignuiandanimation.R;

public class SharedElementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_element);

        View imageView = findViewById(R.id.sharedActivityImage);
        View textView = findViewById(R.id.sharedActivityText);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            imageView.setTransitionName(getString(R.string.activity_image_trans));
            textView.setTransitionName(getString(R.string.activity_text_trans));
        }
    }
}
