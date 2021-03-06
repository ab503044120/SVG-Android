package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_schedule extends SVGRenderer {

    public ic_schedule(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(11.99f, 2.0f);
        mPath.cubicTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        mPath.rCubicTo(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f);
        mPath.cubicTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        mPath.cubicTo(22.0f, 6.4799995f, 17.52f, 2.0f, 11.99f, 2.0f);
        mPath.close();
        mPath.moveTo(11.99f, 2.0f);
        mPath.moveTo(12.0f, 20.0f);
        mPath.rCubicTo(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        mPath.rCubicTo(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
        mPath.rCubicTo(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f);
        mPath.rCubicTo(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f);
        mPath.close();
        mPath.moveTo(12.0f, 20.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(12.5f, 7.0f);
        mPath.lineTo(11.0f, 7.0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rLineTo(5.25f, 3.15f);
        mPath.rLineTo(0.75f, -1.23f);
        mPath.rLineTo(-4.5f, -2.67f);
        mPath.close();
        mPath.moveTo(12.5f, 7.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}