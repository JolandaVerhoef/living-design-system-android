package com.jolandaverhoef.designsystem.library

import android.os.Bundle
import com.facebook.testing.screenshot.ScreenshotRunner
import android.support.test.runner.AndroidJUnitRunner

class CoolblueTestRunner : AndroidJUnitRunner() {
    override fun onCreate(args: Bundle) {
        ScreenshotRunner.onCreate(this, args)
        super.onCreate(args)
    }

    override fun finish(resultCode: Int, results: Bundle) {
        ScreenshotRunner.onDestroy()
        super.finish(resultCode, results)
    }
}
