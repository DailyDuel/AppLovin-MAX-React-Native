package com.applovin.enterprise.apps.demoapp;

import android.app.Application;

import com.applovin.reactnative.AppLovinMAXPackage;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.List;

public class MainApplication
        extends Application
        implements ReactApplication
{

    private final ReactNativeHost mReactNativeHost =
            new ReactNativeHost( this )
            {
                @Override
                public boolean getUseDeveloperSupport()
                {
                    return true;
                }

                @Override
                protected List<ReactPackage> getPackages()
                {
                    @SuppressWarnings("UnnecessaryLocalVariable")
                    List<ReactPackage> packages = new PackageList( this ).getPackages();
                    // Packages that cannot be autolinked yet can be added manually here, for AppLovinMAXExample:
//                    packages.add( new AppLovinMAXPackage() );

                    return packages;
                }

                @Override
                protected String getJSMainModuleName()
                {
                    return "index";
                }
            };

    @Override
    public ReactNativeHost getReactNativeHost()
    {
        return mReactNativeHost;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        SoLoader.init( this, /* native exopackage */ false );
    }
}
