package com.ross.pincodeviewlib.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/**
 * @author Sergey Rodionov
 */

public class DimensionUtils {

    private static int dpToPx(Context context, int valueInDp) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        float density = metrics.density;
        return (int) ((int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, valueInDp, metrics) / density);
    }

    public static int dpToPx(Context context, double valueInDp) {
        return dpToPx(context, (int) valueInDp);
    }

    public static int dpToPx(Context context, float valueInDp) {
        return dpToPx(context, (int) valueInDp);
    }

    public static float dpToPxF(Context context, float valueInDp) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, valueInDp, metrics);
    }
}
