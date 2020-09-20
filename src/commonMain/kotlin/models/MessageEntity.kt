package io.nooblabs.kbot.models

import kotlinx.serialization.Serializable

/**
 * [https://core.telegram.org/bots/api#messageentity]
 */
@Serializable
data class MessageEntity(
    @Serializable(with = MessageEntityTypeAsStringSerializer::class)
    val type: MessageEntityType,
    val offset: Long,
    val length: Long,
    val url: String? = null,
    val user: User? = null,
    val language: String? = null,
)

enum class MessageEntityType {
    MENTION, HASHTAG, CASHTAG, BOT_COMMAND, URL, EMAIL, PHONE_NUMBER, BOLD, ITALIC, UNDERLINE, STRIKETHROUGH, CODE, PRE, TEXT_LINK, TEXT_MENTION;
}
