package com.example.sauld.greendao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       MyApp  myApp = (MyApp)  getApplication();
       DaoSession daoSession=myApp.getDaoSesion();
       ItemDao itemDao=daoSession.getItemDao();

       Item item = new Item();
       item.setId(null);
       item.setDescription("Some desc");
       item.setLabel("Some Label");
       item.setPriority(10);


       long insert = itemDao.insert(item);
       Log.d("MainActivity","inset"+insert);

       List<Item> items = itemDao.loadAll();
        Log.d("MainActivity","items"+items);

    
    }



}
