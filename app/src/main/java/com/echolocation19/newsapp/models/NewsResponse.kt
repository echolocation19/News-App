package com.echolocation19.newsapp.models


import com.echolocation19.newsapp.models.Article

data class NewsResponse(
  val status: String,
  val totalResults: Int,
  val articles: MutableList<Article>
)