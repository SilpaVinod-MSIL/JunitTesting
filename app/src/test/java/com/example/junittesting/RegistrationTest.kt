package com.example.junittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationTest{
    @Test
    fun `empty username returns false`(){
        val result=Registration.ValidateRegistrationInput(
            username = "",
            password = "1234",
            conformPassword = "1234"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `All field filled returns true`(){
        val result=Registration.ValidateRegistrationInput(
            username = "Anamika",
            password = "1234",
            conformPassword = "1234"
        )
        assertThat(result).isTrue()
    }
    @Test
    fun `already existing username returns false`(){
        val result=Registration.ValidateRegistrationInput(
            username = "Vinod",
            password = "1234",
            conformPassword = "1234"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password empty returns false`(){
        val result=Registration.ValidateRegistrationInput(
            username = "Raj",
            password = "",
            conformPassword = "1234"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `conformation pswd not equall not pswd returns false`(){
        val result=Registration.ValidateRegistrationInput(
            username = "manu",
            password = "1234",
            conformPassword = "123"
        )
        assertThat(result).isFalse()
    }
}