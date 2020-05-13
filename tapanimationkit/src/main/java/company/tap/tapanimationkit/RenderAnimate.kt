package company.tap.tapanimationkit

import android.animation.AnimatorSet
import android.content.Context
import android.view.animation.AccelerateInterpolator

/**
 * Created by AhlaamK on 5/13/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
class RenderAnimate (var context: Context) {
    var duratn: Long = 1000

    lateinit var animatorSet: AnimatorSet

    fun setAnimation(animatorSet: AnimatorSet) {
        this.animatorSet = animatorSet
    }

    fun setDuration(duration: Long) {
        this.duratn = duration
    }

    fun start() {
        animatorSet.duration = duratn
        animatorSet.interpolator = AccelerateInterpolator()
        animatorSet.start()
    }
}