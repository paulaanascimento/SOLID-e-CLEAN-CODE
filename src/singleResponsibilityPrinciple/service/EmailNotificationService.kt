package singleResponsibilityPrinciple.service

import singleResponsibilityPrinciple.model.User

class EmailNotificationService {
    fun sendNotification(user: User) {
        println("Enviando e-mail para ${user.email}")
    }
}