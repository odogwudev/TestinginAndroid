package com.odogwudev.testinginandroid

import org.junit.Test
import com.google.common.truth.Truth.assertThat

class RegistrationUtilTest {

    @Test
    fun `empty username return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "",
            password = "124",
            confirmPassword = "124"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Odogwu",
            password = "124",
            confirmPassword = "124"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `password is empty return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Dev",
            password = "",
            confirmPassword = ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password was repeated incorrectly return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Dev",
            password = "1245",
            confirmPassword = "124"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than two digits return falsw`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Dev",
            password = "1",
            confirmPassword = "1"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `username exists return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Dev",
            password = "124",
            confirmPassword = "124"
        )
        assertThat(result).isFalse()
    }
}