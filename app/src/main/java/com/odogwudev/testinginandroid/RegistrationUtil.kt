package com.odogwudev.testinginandroid

object RegistrationUtil {

    private val existingUsers = listOf("Odogwu", "Dev")

    /**
     * Input is not valid if
     * username is not empty
     * username is already taken
     * confirm password is same as new
     * password contains less than 8 digits
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String,
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if (password != confirmPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 5) {
            return false
        }
        return true
    }
}