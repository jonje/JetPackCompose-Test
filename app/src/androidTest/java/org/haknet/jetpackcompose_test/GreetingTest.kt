package org.haknet.jetpackcompose_test

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class GreetingTest {
    @get:Rule
    val rule = createComposeRule()

    @Test
    fun validateDisplay() {
        val name = "Testing Android"
        rule.setContent { Greeting(name = name) }
        rule.onNodeWithText(name).assertExists()

    }
}