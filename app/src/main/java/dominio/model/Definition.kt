package dominio.model

data class WordDetail(
    val word: String,
    val displayWord: String,
    val phonetic: String?,
    val meanings: List<Meaning>,
    val isFavorite: Boolean,
    val isFromCache: Boolean = false
)

data class Meaning(
    val partOfSpeech: String,
    val definitions: List<Definition>,
    val synonyms: List<String>,
    val antonyms: List<String>
)

data class Definition(
    val definition: String,
    val example: String?
)