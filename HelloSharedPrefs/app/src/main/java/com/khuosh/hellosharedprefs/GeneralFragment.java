package com.khuosh.hellosharedprefs;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class GeneralFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.pref_general, rootKey);
    }
}