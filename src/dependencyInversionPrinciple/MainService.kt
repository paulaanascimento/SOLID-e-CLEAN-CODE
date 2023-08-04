package dependencyInversionPrinciple

class MainService(private val emailService: EmailService) {
    fun insertEmailData() {
        emailService.sendEmail("cristianetaniasilva@sociedadeweb.com.br", "Olá, tudo bem?")
    }
}
