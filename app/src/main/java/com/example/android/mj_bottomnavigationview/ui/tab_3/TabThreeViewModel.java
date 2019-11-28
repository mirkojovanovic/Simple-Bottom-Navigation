package com.example.android.mj_bottomnavigationview.ui.tab_3;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class TabThreeViewModel extends AndroidViewModel {

    private MutableLiveData<String> mText;

    public TabThreeViewModel(@NonNull Application application) {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue("Fragment 3");
    }

    public MutableLiveData<String> getText() {
        return mText;
    }
}
