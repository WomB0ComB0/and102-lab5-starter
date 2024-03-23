package com.codepath.articlesearch

data class DisplayArticle(
    val headline: String?,
    val articleAbstract: String?,
    val byline: String?,
    val mediaImageUrl: String?
) : java.io.Serializable
