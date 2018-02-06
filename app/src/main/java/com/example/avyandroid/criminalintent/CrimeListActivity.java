package com.example.avyandroid.criminalintent;


import android.support.v4.app.Fragment;

/**
 * Created by Avinash on 1/20/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
