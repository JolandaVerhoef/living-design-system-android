package com.jolandaverhoef.designsystem.library

import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.filters.LargeTest
import com.agoda.kakao.KImageView
import com.agoda.kakao.Screen
import com.novoda.espresso.ViewTestRule
import org.junit.Rule
import org.junit.Test

@LargeTest
class ButtonTest {

    @Rule
    @JvmField
    val viewTestRule = ViewTestRule<Button>(R.layout.view_button)

    @Test
    fun testActiveButton_RendersCorrectly() {
        viewTestRule.runOnMainSynchronously {
            it.render(active = true)
        }

        ButtonScreen().invoke {
            image {
                hasDrawable(android.R.drawable.ic_btn_speak_now)
            }
        }
    }

    @Test
    fun testUnactiveButton_RendersCorrectly() {
        viewTestRule.runOnMainSynchronously {
            it.render(active = false)
        }

        ButtonScreen().invoke {
            image {
                hasDrawable(android.R.drawable.ic_delete)
            }
        }
    }

    class ButtonScreen : Screen<ButtonScreen>() {
        val image = KImageView { withId(R.id.button_image) }
    }
}
