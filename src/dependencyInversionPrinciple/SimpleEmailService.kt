package dependencyInversionPrinciple

class SimpleEmailService : EmailService {
    override fun sendEmail(addressee: String, message: String) {
        println("Enviando email para $addressee: $message")
    }
}

