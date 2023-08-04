package dependencyInversionPrinciple

fun main() {
    val emailService: EmailService = SimpleEmailService()

    val mainService = MainService(emailService)

    mainService.insertEmailData()
}