package dependencyInversionPrinciple

interface EmailService {
    fun sendEmail(addressee: String, message: String)
}