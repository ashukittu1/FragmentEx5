package com.ashutech.fragmentex5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

EditText et1, et2;
    Button b1;
    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_login2,container,false);
        et1 = (EditText) v.findViewById(R.id.editText);
        et2 = (EditText) v.findViewById(R.id.editText2);
        b1 = (Button) v.findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity mainActivity = (MainActivity) getActivity();
                String uname=et1.getText().toString();
                String pass=et2.getText().toString();
                mainActivity.loginButtonClicked(uname,pass);
            }
        });

        return v;
    }

}
