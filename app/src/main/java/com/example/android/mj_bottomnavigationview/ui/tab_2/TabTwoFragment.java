package com.example.android.mj_bottomnavigationview.ui.tab_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.android.mj_bottomnavigationview.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TabTwoFragment extends Fragment {

    private TabTwoViewModel tabTwoViewModel;

    @BindView(R.id.tab_text_view)
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        tabTwoViewModel = ViewModelProviders.of(this).get(TabTwoViewModel.class);

        View root = inflater.inflate(R.layout.fragment_tab, container, false);

        ButterKnife.bind(this, root);

        tabTwoViewModel.getText().observe(this, s -> textView.setText(s));

        return root;
    }
}
