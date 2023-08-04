package singleResponsibilityPrinciple.service

import singleResponsibilityPrinciple.model.User

class UserAccountService {
    fun deleteUser(user: User){
        println("Excluindo usuário com o id ${user.id} do banco de dados")
    }
}