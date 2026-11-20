package dominio.model.DTO

import kotlinx.serialization.Serializable

@Serializable
data class DictionaryResponseDto(
    val word: String,
    val entries: List<WordEntryDto> = emptyList()
)

@Serializable
data class WordEntryDto(
    val language: LanguageDto? = null,
    val partOfSpeech: String = "",
    val pronunciations: List<PronunciationDto> = emptyList(),
    val senses: List<SenseDto> = emptyList()
)

@Serializable
data class LanguageDto(
    val code: String = "",
    val name: String = ""
)

@Serializable
data class PronunciationDto(
    val text: String? = null
)

@Serializable
data class SenseDto(
    val definition: String = "",
    val examples: List<String> = emptyList(),
    val synonyms: List<String> = emptyList(),
    val antonyms: List<String> = emptyList()
)