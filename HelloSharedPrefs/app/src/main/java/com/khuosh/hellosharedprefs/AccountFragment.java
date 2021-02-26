package com.khuosh.hellosharedprefs;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;


public class AccountFragment extends PreferenceFragmentCompat {

    // TODO: Rename parameter arguments, choose names that match
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.pref_account, rootKey);
    }
}