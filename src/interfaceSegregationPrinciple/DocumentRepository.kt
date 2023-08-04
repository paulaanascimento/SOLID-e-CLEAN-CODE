package interfaceSegregationPrinciple

class DocumentRepository {
    private val documents = mutableListOf<Document>()

    fun addDocument(document: Document){
        documents.add(document)
    }
    fun removeDocument(document: Document){
        documents.remove(document)
    }
    fun documentExists(document: Document):Boolean{
        return documents.contains(document)
    }
}