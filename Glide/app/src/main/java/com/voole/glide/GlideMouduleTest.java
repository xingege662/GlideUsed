package com.voole.glide;

import android.content.Context;
import android.os.Environment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.engine.cache.ExternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.module.GlideModule;

/**
 * Created by changxin on 2017/2/17.
 */

public class GlideMouduleTest implements GlideModule {
    private int cacheSize = 1024*1024*50;
    private long memorySize = Runtime.getRuntime().maxMemory()/8;
    private  final String EXTERNALPATH = Environment.getExternalStorageDirectory()+"/Image";
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        //builder.setDiskCache(new InternalCacheDiskCacheFactory(context,cacheSize));

        builder.setMemoryCache(new LruResourceCache((int)memorySize));
        builder.setDiskCache(new ExternalCacheDiskCacheFactory(context, "image", cacheSize));
    }

    @Override
    public void registerComponents(Context context, Glide glide) {

    }
}
