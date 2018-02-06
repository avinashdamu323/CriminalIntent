package com.example.avyandroid.criminalintent;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.example.avyandroid.criminalintent.database.CrimeDbSchema;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Avinash on 2/5/2018.
 */

public class CrimeCursorWrapper extends CursorWrapper {

    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Crime getCrime() {
        String uuidString = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.UUID));
        String title = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.Title));
        long date = getLong(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.Date));
        int isSolved = getInt(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.Solved));

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setDate(new Date(date));
        crime.setSolved(isSolved != 0);
        return crime;
    }

}
