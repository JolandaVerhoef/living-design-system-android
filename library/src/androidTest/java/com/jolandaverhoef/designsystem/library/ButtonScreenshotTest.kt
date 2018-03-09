package com.jolandaverhoef.designsystem.library

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import android.view.LayoutInflater
import com.facebook.testing.screenshot.Screenshot
import com.facebook.testing.screenshot.ViewHelpers
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ButtonScreenshotTest {
    @Test
    fun testActive() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        val inflater = LayoutInflater.from(appContext)
        val view = inflater.inflate(R.layout.view_button, null, false) as Button
        view.render(true)
        ViewHelpers.setupView(view).setExactWidthDp(300).layout()
        Screenshot.snap(view).record()
    }

    @Test
    fun testInactive() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        val inflater = LayoutInflater.from(appContext)
        val view = inflater.inflate(R.layout.view_button, null, false) as Button
        view.render(false)
        ViewHelpers.setupView(view).setExactWidthDp(300).layout()
        Screenshot.snap(view).record()
    }
}
