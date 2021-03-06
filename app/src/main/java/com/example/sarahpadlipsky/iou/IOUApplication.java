package com.example.sarahpadlipsky.iou;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * IOU Application
 * @author sarahpadlipsky
 * @version October 28, 2016
 */
public class IOUApplication extends Application {

  // Database
  Realm realm;

  /**
   * Android lifecycle function. Called when application is opened for the first time.
   */
  @Override
  public void onCreate() {
    super.onCreate();
    Realm.init(this.getBaseContext());

    //TODO: Change migration technique before deploying.
    RealmConfiguration realmConfiguration = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded()
        .build();
    Realm.setDefaultConfiguration(realmConfiguration);
    realm = Realm.getDefaultInstance();

    // Sets current user is the database.
    realm.executeTransaction(new Realm.Transaction() {
        @Override
        public void execute(Realm realm) {
          long num = realm.where(User.class).count();
          // TODO: Should this check if it should update instead?
          User user = realm.createObject(User.class,Long.toString(num));
          //TODO: Get username from log-in.
          user.setName("Sarah");
          user.setIsCurrentUser(true);
        }
    });
  }

  /**
   * Android lifecycle function. Called when application is completely closed.
   */
  @Override
  public void onTerminate() {
    super.onTerminate();
    realm.close();
  }

}

