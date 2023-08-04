package interfaceSegregationPrinciple

import java.io.File
import java.io.FileNotFoundException

class TextDocumentTxt(val path:String):TextDocument{

    override fun read() {
        try {
            File(path).forEachLine { line ->
                println(line)
            }
        } catch (erroAoLerArquivo: FileNotFoundException) {
            println("Falha ao ler o arquivo")
        }
    }

    override fun write(text:String) {
        try {
            File(path).writeText(text)
        }catch (erroAoEscreverArquivo: FileNotFoundException) {
            println("Falha ao escrever no arquivo")
        }
    }

    override fun open() {
        try {
            print("Abrindo arquivo com caminho $path\n")
        }catch (erroAoAbrirArquivo: FileNotFoundException) {
            println("Falha ao abrir o arquivo")
        }
    }

    override fun close() {
        try {
            print("Fechando arquivo com caminho $path\n")
        }catch (erroAoFecharArquivo: FileNotFoundException) {
            println("Falha ao abrir o arquivo")
        }
    }
}