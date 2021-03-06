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
public class ic_visibility_off extends SVGRenderer {

    public ic_visibility_off(Context context) {
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
        
        mPath.moveTo(12.0f, 7.0f);
        mPath.rCubicTo(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        mPath.rCubicTo(0.0f, 0.65f, -0.13f, 1.26f, -0.36f, 1.83f);
        mPath.rLineTo(2.92f, 2.92f);
        mPath.rCubicTo(1.51f, -1.26f, 2.7f, -2.89f, 3.43f, -4.75f);
        mPath.rCubicTo(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
        mPath.rCubicTo(-1.4f, 0.0f, -2.74f, 0.25f, -3.98f, 0.7f);
        mPath.rLineTo(2.16f, 2.16f);
        mPath.cubicTo(10.74f, 7.13f, 11.35f, 7.0f, 12.0f, 7.0f);
        mPath.close();
        mPath.moveTo(12.0f, 7.0f);
        mPath.moveTo(2.0f, 4.27f);
        mPath.rLineTo(2.28f, 2.28f);
        mPath.rLineTo(0.46f, 0.46f);
        mPath.cubicTo(3.08f, 8.3f, 1.78f, 10.02f, 1.0f, 12.0f);
        mPath.rCubicTo(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
        mPath.rCubicTo(1.55f, 0.0f, 3.03f, -0.3f, 4.38f, -0.84f);
        mPath.rLineTo(0.42f, 0.42f);
        mPath.lineTo(19.73f, 22.0f);
        mPath.lineTo(21.0f, 20.73f);
        mPath.lineTo(3.27f, 3.0f);
        mPath.lineTo(2.0f, 4.27f);
        mPath.close();
        mPath.moveTo(2.0f, 4.27f);
        mPath.moveTo(7.53f, 9.8f);
        mPath.rLineTo(1.55f, 1.55f);
        mPath.rCubicTo(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        mPath.rCubicTo(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        mPath.rCubicTo(0.22f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f);
        mPath.rLineTo(1.55f, 1.55f);
        mPath.rCubicTo(-0.67f, 0.33f, -1.41f, 0.53f, -2.2f, 0.53f);
        mPath.rCubicTo(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        mPath.rCubicTo(0.0f, -0.79f, 0.2f, -1.53f, 0.53f, -2.2f);
        mPath.close();
        mPath.moveTo(7.53f, 9.8f);
        mPath.rMoveTo(4.31f, -0.78f);
        mPath.rLineTo(3.15f, 3.15f);
        mPath.rLineTo(0.02f, -0.16f);
        mPath.rCubicTo(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        mPath.rLineTo(-0.17f, 0.01f);
        mPath.close();
        mPath.moveTo(11.84f, 9.02f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}