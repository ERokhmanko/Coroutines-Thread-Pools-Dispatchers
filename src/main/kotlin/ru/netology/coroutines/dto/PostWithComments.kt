package ru.netology.coroutines.dto

data class PostWithComments(
    val post: Post,
    val author: Author,
    val comments: List<CommentWithAuthor>,
)

data class CommentWithAuthor(
    val comment: Comment,
    val author: Author
)
