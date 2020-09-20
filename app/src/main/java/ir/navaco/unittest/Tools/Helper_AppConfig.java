package ir.navaco.unittest.Tools;

import android.content.Context;
import android.os.Build;

import ir.navaco.unittest.BuildConfig;

public class Helper_AppConfig {

    Context context;

    public Helper_AppConfig(Context ctx) {
        this.context = ctx;
    }

    public String returnPackageName(){

        return context.getPackageName();

    }

}
