package com.ashutech.fragmentex5;

import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            LoginFragment loginFragment = new LoginFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.conainer1, loginFragment);
            if(getResources().getConfiguration().orientation
                    == Configuration.ORIENTATION_LANDSCAPE){
                WelcomeFragment welcomeFragment = new WelcomeFragment();
                fragmentTransaction.add(R.id.conainer2,welcomeFragment);
            }
            fragmentTransaction.commit();

        }
    }
    public void loginButtonClicked(String uname, String pass){
       WelcomeFragment welcomeFragment = new WelcomeFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.conainer1,welcomeFragment);
        Bundle bundle=new Bundle();
        bundle.putString("uname",uname);
        bundle.putString("pass",pass);
        welcomeFragment.getArguments();
        fragmentTransaction.addToBackStack(null);//remember previous screen
        fragmentTransaction.commit();

    }
}
