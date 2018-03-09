package com.jolandaverhoef.livingdesignsystem

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import android.view.LayoutInflater
import com.facebook.testing.screenshot.Screenshot
import com.facebook.testing.screenshot.ViewHelpers

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        val inflater = LayoutInflater.from(appContext)
        val view = inflater.inflate(R.layout.activity_main, null, false)
        ViewHelpers.setupView(view).setExactWidthDp(300).layout()
        Screenshot.snap(view).record()
    }
}
