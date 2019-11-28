package com.example.android.mj_bottomnavigationview.ui.tab_5;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class TabFiveViewModel extends AndroidViewModel {

    private MutableLiveData<String> mText;

    public TabFiveViewModel(@NonNull Application application) {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue("Fragment 5");
    }

    public MutableLiveData<String> getText() {
        return mText;
    }
}
