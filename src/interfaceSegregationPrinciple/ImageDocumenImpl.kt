package interfaceSegregationPrinciple

import java.io.File
import javax.imageio.ImageIO

class ImageDocumenImpl(var imageFile:File):ImageDocument{
    val image = ImageIO.read(imageFile)
    override fun getImageHeight(): Int {
        return image.width
    }

    override fun getImageWidth():Int{
        return image.height
    }

    override fun open() {
        println("Abrindo imagem")
    }

    override fun close() {
        println("Fechando imagem")
    }
}