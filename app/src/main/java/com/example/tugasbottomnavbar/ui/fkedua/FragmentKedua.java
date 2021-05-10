package com.example.tugasbottomnavbar.ui.fkedua;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.tugasbottomnavbar.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class FragmentKedua extends Fragment {

    TextInputLayout at_no_telp;
    TextInputEditText et_no_telp;
    Button btn_call;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_kedua, container, false);

        et_no_telp = (TextInputEditText) root.findViewById(R.id.et_no_telp);
        at_no_telp = (TextInputLayout) root.findViewById(R.id.at_no_telp);
        btn_call = (Button) root.findViewById(R.id.btn_call);

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no_telp;
                no_telp = et_no_telp.getText().toString().toUpperCase();

                if (et_no_telp.getText().length() > 0) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + no_telp));
                    startActivity(intent);
                } else{
                    et_no_telp.setError("No. telp tidak boleh kosong!");
                }
            }
        });

        et_no_telp.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
//              Ga perlu diisi
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int aft )
            {
//              Ga perlu diisi
            }

            @Override
            public void afterTextChanged(Editable s)
            {
                if (et_no_telp.getText().length() > 0) {
                    et_no_telp.setError(null);
                }
            }
        });

        return root;
    }
}