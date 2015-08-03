package com.fxft.cheyoufuwu;

import android.app.Application;

import com.fxft.cheyoufuwu.common.exception.CrashHandler;
import com.fxft.cheyoufuwu.database.DatabaseManager;
import com.fxft.cheyoufuwu.network.AppServerConfig;
import com.fxft.cheyoufuwu.network.AppServerFactory;
import com.lidroid.xutils.exception.DbException;

import net.danlew.android.joda.JodaTimeAndroid;
import java.util.concurrent.Executors;

/**
 * Created by ChenDJ on 2015/7/23.<br>
 */
public class CheYouApplication extends Application {

    /**
     * 如果数据库表结构有变化记得要让这个值自增
     */
    private static final int DATABASE_VERSION = 1;

    private static final String TAG = CheYouApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化时间工具
        JodaTimeAndroid.init(this);

        //初始化未捕获异常
//        CrashHandler crashHandler = CrashHandler.getInstance();
//        crashHandler.init(this);

        //初始化数据，第一次初始化会带有耗时操作，放入到子线程中执行
        Executors.newSingleThreadExecutor().execute(new Runnable() {
            @Override
            public void run() {
                try {
                    DatabaseManager.getInstance().initialization(CheYouApplication.this, "cheyoufuwu", DATABASE_VERSION);
                } catch (DbException e) {
                    e.printStackTrace();
                }
            }
        });

        //接口工厂初始化
        AppServerConfig.getInstance().initServerFactory();
    }

    @Override
    public void onTerminate() {
        AppServerConfig.destoryFactory();
        super.onTerminate();
    }
}
