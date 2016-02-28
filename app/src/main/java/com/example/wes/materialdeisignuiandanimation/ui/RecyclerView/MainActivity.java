package com.example.wes.materialdeisignuiandanimation.ui.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.wes.materialdeisignuiandanimation.R;
import com.example.wes.materialdeisignuiandanimation.ui.CollapsingToolbar.CollapsingToolbarAndScrollview;
import com.example.wes.materialdeisignuiandanimation.ui.SharedElement.SharedElementActivity;
import com.example.wes.materialdeisignuiandanimation.ui.SlideView.SlideView;
import com.example.wes.materialdeisignuiandanimation.ui.TabLayout.TabLayoutActivity;

public class MainActivity extends AppCompatActivity implements RecyclerItemClickListener.OnItemClickListener {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        ItemData itemsData[] = setupItemData();

        setupRecyclerView(itemsData);
    }

    private ItemData[] setupItemData() {
        ItemData itemsData[] = {new ItemData("TabLayout And ViewPaper", R.drawable.icon),
                new ItemData("Collapsing Toolbar And ScrollView", R.drawable.icon),
                new ItemData(getString(R.string.RecyclerViewAndRippleEffect), R.drawable.icon),
                new ItemData("SlideView And Animation", R.drawable.icon)};

        return itemsData;
    }

    private void setupRecyclerView(ItemData itemsData[]) {
        setupRecyclerViewAdapter(itemsData);
        setupRecyclerViewLayout();
        setupRecyclerViewItemDecoration();
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        setupRecyclerViewItemListener();

    }

    private void setupRecyclerViewAdapter(ItemData itemsData[]) {
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(itemsData);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    private void setupRecyclerViewLayout() {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
    }

    private void setupRecyclerViewItemDecoration() {
        RecyclerView.ItemDecoration itemDecoration =
                new DividerItemDecoration(this, LinearLayoutManager.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);
    }

    private void setupRecyclerViewItemListener() {
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this.getApplicationContext(), this));
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent;
        switch (position) {
            case 0:
                intent = new Intent(this, TabLayoutActivity.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(this, CollapsingToolbarAndScrollview.class);
                startActivity(intent);
                break;
            case 2:
                View imageView = view.findViewById(R.id.itemImage);
                View textView = view.findViewById(R.id.itemText);
                intent = new Intent(this, SharedElementActivity.class);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    textView.setTransitionName(getString(R.string.activity_text_trans));

                    Pair<View, String> pair1 = Pair.create(imageView, imageView.getTransitionName());
                    Pair<View, String> pair2 = Pair.create(textView, textView.getTransitionName());

                    ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, pair1, pair2);
                    startActivity(intent, options.toBundle());
                } else {
                    startActivity(intent);
                }

                break;
            case 3:
                intent = new Intent(this, SlideView.class);
                startActivity(intent);
                break;
        }
    }
}
