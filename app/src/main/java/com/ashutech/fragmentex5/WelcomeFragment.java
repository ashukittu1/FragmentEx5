package com.ashutech.fragmentex5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {
    TextView tv;


    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_welcome, container, false);
        tv = (TextView) v.findViewById(R.id.tv1);
        Bundle bundle=getArguments();
        String uname=bundle.getString("uname");
        String pass=bundle.getString("pass");
        tv.setText(uname+"/n"+pass);
        return v;
    }

}
