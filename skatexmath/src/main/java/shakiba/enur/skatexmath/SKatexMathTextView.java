package shakiba.enur.skatexmath;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import shakiba.enur.skatexmath.android.R;

public class SKatexMathTextView extends TextView {
    public SKatexMathTextView(Context context) {
        super(context);
        //init(null);
    }

    public SKatexMathTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        //init(attrs);
    }

    public SKatexMathTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //init(attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public SKatexMathTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
       // init(attrs);
    }
//    private void init(AttributeSet attrs) {
//        if (attrs != null) {
//            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.SKatexMathTextView);
//            String fontName = a.getString(R.styleable.SKatexMathTextView_font);
//
//            try {
//                if (fontName != null) {
//                    Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/" + fontName);
//                    setTypeface(myTypeface);
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//            a.recycle();
//        }
//    }
}
