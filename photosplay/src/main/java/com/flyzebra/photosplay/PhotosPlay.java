package com.flyzebra.photosplay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/**
 * Created by Administrator on 2016/3/6.
 */
public class PhotosPlay extends View {
    private Paint mPaint;//默认画笔
    private Bitmap defultBitmap;
    private SurfaceHolder surfaceHolder;

    public PhotosPlay(Context context) {
        super(context);
        init(context);
    }

    public PhotosPlay(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public PhotosPlay(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context){
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.parseColor("#FFFFFF"));
//        surfaceHolder = getHolder();
    }

    /**
     * 获取默认的绘制图像
     * @param resId
     * @return
     */
    private Bitmap getDefultBitmap(int resId){
        if(defultBitmap==null){
            defultBitmap = BitmapFactory.decodeResource(getResources(), resId);
        }
        return defultBitmap;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        canvas = surfaceHolder.lockCanvas();
        canvas.drawBitmap(getDefultBitmap(R.drawable.photosplaydefult),0,0,mPaint);
//        surfaceHolder.unlockCanvasAndPost(canvas);
    }
}
