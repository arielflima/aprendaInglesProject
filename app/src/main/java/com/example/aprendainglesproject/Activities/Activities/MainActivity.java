package com.example.aprendainglesproject.Activities.Activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.aprendainglesproject.Activities.Fragments.BichosFragment;
import com.example.aprendainglesproject.Activities.Fragments.NumerosFragment;
import com.example.aprendainglesproject.Activities.Fragments.VogaisFragment;
import com.example.aprendainglesproject.R;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Aprenda Inglês");
        getSupportActionBar().setElevation(0);

        smartTabLayout = findViewById(R.id.viewpagertab);
        viewPager = findViewById(R.id.viewpager);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                .add("Bichos", BichosFragment.class)
                .add("Numeros", NumerosFragment.class)
                .add("Vogais", VogaisFragment.class)
                .create()
        );
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);



    }
}
