package com.example.android.mj_bottomnavigationview.ui.tab_4;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class TabFourViewModel extends AndroidViewModel {

    private MutableLiveData<String> mText;

    public TabFourViewModel(@NonNull Application application) {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue("Fragment 4");
    }

    public MutableLiveData<String> getText() {
        return mText;
    }
}
