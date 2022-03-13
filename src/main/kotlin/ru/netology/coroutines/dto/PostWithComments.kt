package ru.netology.coroutines.dto

data class PostWithComments(
    val post: Post,
    val commentsWithAuthor: List<CommentWithAuthor>,
    val author: Author
)
