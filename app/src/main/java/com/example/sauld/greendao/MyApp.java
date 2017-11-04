package com.example.sauld.greendao;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by sauld on 4/11/2017.
 */

public class MyApp extends Application {
 public DaoSession  daoSession;

    /**
     * Called when the application is starting, before any activity, service,
     * or receiver objects (excluding content providers) have been created.
     * Implementations should be as quick as possible (for example using
     * lazy initialization of state) since the time spent in this function
     * directly impacts the performance of starting the first activity,
     * service, or receiver in a process.
     * If you override this method, be sure to call super.onCreate().
     */
    @Override
    public void onCreate() {
        super.onCreate();
         DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "Utems-db");
        SQLiteDatabase database = devOpenHelper.getWritableDatabase();
        daoSession = new DaoMaster(database).newSession();
    }


    public DaoSession getDaoSesion() {
        return daoSession;
    }
}
