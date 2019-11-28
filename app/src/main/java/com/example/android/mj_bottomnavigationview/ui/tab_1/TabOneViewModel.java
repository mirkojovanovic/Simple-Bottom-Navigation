package com.example.android.mj_bottomnavigationview.ui.tab_1;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.android.mj_bottomnavigationview.R;

public class TabOneViewModel extends AndroidViewModel {

    private MutableLiveData<String> mText;

    public TabOneViewModel(@NonNull Application application) {
        super(application);
        mText = new MutableLiveData<>();
        mText.setValue(application.getString(R.string.title_tab_one));
    }

    public MutableLiveData<String> getText() {
        return mText;
    }
}
