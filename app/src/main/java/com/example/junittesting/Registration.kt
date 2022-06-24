package com.example.junittesting

object Registration {
    private val namesList= listOf("Silpa","Vinod")
    //1.create signature of fn
    /*
    1.username empty
    2.already existing username
    3.pswd empty
    4.actual pswd!=conformed pswd
    */
    fun ValidateRegistrationInput(
        username:String,
        password:String,
        conformPassword:String
    ):Boolean{
        if(username.isEmpty()|| password.isEmpty()) {
            return false
        }
        if(username in namesList){
            return false
        }
        if(conformPassword!=password){
            return false
        }
        return true
    }
}