package com.jt.yibiaopan;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yt on 2016/11/30.
 */
public class RoundIndicatorView extends View {

    private Paint paint;
    private Paint paint_2;
    private Paint paint_3;
    private Paint paint_4;
    private Context context;

    public RoundIndicatorView(Context context) {
        this(context,null);
    }

    public RoundIndicatorView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RoundIndicatorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        setBackgroundColor(0xFFFF6347);
        initAttr(attrs);
    }

    private void initAttr(AttributeSet attrs) {

    }
}
