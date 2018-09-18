package per.goweii.percentimageview.percentimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * 描述：
 *
 * @author Cuizhen
 * @date 2018/9/18
 */
public class PercentImageView extends AppCompatImageView {

    public static final int BASICS_WIDTH = 0;
    public static final int BASICS_HEIGHT = 1;

    private final int mBasics;
    private final float mPercent;

    public PercentImageView(Context context) {
        this(context, null);
    }

    public PercentImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PercentImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.PercentImageView);
        mBasics = typedArray.getInt(R.styleable.PercentImageView_basics, BASICS_WIDTH);
        mPercent = typedArray.getFloat(R.styleable.PercentImageView_percent, 1.0F);
        typedArray.recycle();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int heightSize;
        int widthSize;
        if (mBasics == BASICS_WIDTH){
            widthSize = MeasureSpec.getSize(widthMeasureSpec);
            heightSize = (int) (widthSize * mPercent);
        } else if (mBasics == BASICS_HEIGHT){
            heightSize = MeasureSpec.getSize(heightMeasureSpec);
            widthSize = (int) (heightSize * mPercent);
        } else {
            widthSize = MeasureSpec.getSize(widthMeasureSpec);
            heightSize = MeasureSpec.getSize(heightMeasureSpec);
        }
        setMeasuredDimension(widthSize, heightSize);
    }
}
