package interfaceSegregationPrinciple

import java.io.File

fun main() {
    val documentRepository = DocumentRepository()
    val textDocument = TextDocumentTxt("src/interfaceSegregationPrinciple/resources/solid.txt")
    textDocument.open()
    textDocument.write("Single Responsiblity Principle\nOpen-Closed Principle\nLiskov Substitution Principle\nInterface Segregation Principle\nDependency Inversion Principle")
    textDocument.read()
    textDocument.close()

    println()
    val imageFile = File("src/interfaceSegregationPrinciple/resources/certifcado_culturadefeedback.PNG")
    val imageDocument = ImageDocumenImpl(imageFile)
    println("Altura da imagem: ${imageDocument.getImageHeight()}")
    println("Largura da imagem: ${imageDocument.getImageWidth()}")

    documentRepository.addDocument(textDocument)
    documentRepository.addDocument(imageDocument)
}