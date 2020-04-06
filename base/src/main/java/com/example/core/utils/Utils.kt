package com.example.core.utils

import android.content.res.Resources
import android.util.TypedValue
import android.widget.Toast
import com.example.core.BaseApplication

/**
 * Created by huan on 2020/4/6.
 */
/**
 *
private static final DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();

public static float dp2px(float dp) {
return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics);
}

public static void toast(String string) {
toast(string, Toast.LENGTH_SHORT);
}

public static void toast(String string, int duration) {
Toast.makeText(BaseApplication.currentApplication(), string, duration).show();
}
 */

private val displayMetrics = Resources.getSystem().displayMetrics

fun dp2px(dp:Float):Float {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics)
}

object Utils {
    fun toast(string: String?) {
        toast(string, Toast.LENGTH_SHORT)
    }

    fun toast(string: String?, duration: Int) {
        Toast.makeText(BaseApplication.currentApplication(), string, duration).show()
    }
}
