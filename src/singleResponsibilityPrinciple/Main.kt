package singleResponsibilityPrinciple

import singleResponsibilityPrinciple.model.User
import singleResponsibilityPrinciple.service.EmailContentProvider
import singleResponsibilityPrinciple.service.EmailNotificationService
import singleResponsibilityPrinciple.service.UserAccountService

fun main() {
    val user = User(1, "eliza@gmail.com")

    val emailContentProvider = EmailContentProvider()
    emailContentProvider.prepareContent()

    val emailNotificationService = EmailNotificationService()
    emailNotificationService.sendNotification(user)

    val userAccountService = UserAccountService()
    userAccountService.deleteUser(user)
}