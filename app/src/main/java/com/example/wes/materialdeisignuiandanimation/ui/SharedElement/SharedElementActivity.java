package com.example.wes.materialdeisignuiandanimation.ui.SharedElement;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.wes.materialdeisignuiandanimation.R;

public class SharedElementActivity extends AppCompatActivity {
    View imageView, textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_element);

        imageView = findViewById(R.id.sharedActivityImage);
        textView = findViewById(R.id.sharedActivityText);

        setupTransitionName();
    }

    private void setupTransitionName() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            imageView.setTransitionName(getString(R.string.activity_image_trans));
            textView.setTransitionName(getString(R.string.activity_text_trans));
        }
    }
}
