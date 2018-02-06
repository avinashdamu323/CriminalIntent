package com.example.avyandroid.criminalintent.database;

/**
 * Created by Avinash on 2/5/2018.
 */

public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String Title = "title";
            public static final String Date = "date";
            public static final String Solved = "solved";
        }
    }
}
