package br.com.rcp.domain.repository

interface UserRepository {
    fun setName(name   : String)
    fun setEmail(email : String)
    fun getName()  : String?;
    fun getEmail() : String?;
}