package com.sq.rknn.rknnyolov11;

import android.graphics.Bitmap;

public class YoloV11Detect {
    static {
        System.loadLibrary("rknn_yolov11");
    }

    public native boolean init(String modelPath, String labelListPath, boolean useZeroCopy);

    public native boolean detect(Bitmap srtBitmap);
    public native Object detect2(Bitmap srtBitmap);

    public native boolean release();
}
