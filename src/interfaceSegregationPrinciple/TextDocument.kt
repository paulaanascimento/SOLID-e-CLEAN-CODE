package interfaceSegregationPrinciple

interface TextDocument:Document {
    fun read()
    fun write(text:String)
}