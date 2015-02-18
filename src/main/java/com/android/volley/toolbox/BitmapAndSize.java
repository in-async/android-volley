package com.android.volley.toolbox;

import android.graphics.Bitmap;

/**
 * Created by LetsDevroidPC on 2014/06/26.
 */
public class BitmapAndSize {
    public final Bitmap bitmap;
    public final int imageBytes;
    public final int actualWidth;
    public final int actualHeight;

    public BitmapAndSize(Bitmap bitmap, int imageBytes, int actualWidth, int actualHeight) {
        this.bitmap = bitmap;
        this.imageBytes = imageBytes;
        this.actualWidth = actualWidth;
        this.actualHeight = actualHeight;
    }
}
