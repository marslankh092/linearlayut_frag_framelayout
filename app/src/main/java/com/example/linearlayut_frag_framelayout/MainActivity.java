package com.example.linearlayut_frag_framelayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.linearlayut_frag_framelayout.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        Button login , signup , view;

        FragmentManager frahM = getSupportFragmentManager();
        frahM.beginTransaction().replace(R.id.frameLayout, login.class, null)
                .setReorderingAllowed(true)
                .addToBackStack("main").commit();


        mBinding.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frahM.beginTransaction().replace(R.id.frameLayout, view.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("main").commit();
            }
        });
        mBinding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frahM.beginTransaction().replace(R.id.frameLayout, login.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("main").commit();
            }
        });
        mBinding.signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frahM.beginTransaction().replace(R.id.frameLayout, singup.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("main").commit();
            }
        });

        // create a FragmentManagerg
        // create a FragmentTransaction to begin the transaction and replace the Fragment
        // replace the FrameLayout with new F""ragment


    }
}