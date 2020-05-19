package com.echolocation19.newsapp.db.converters

import androidx.room.TypeConverter
import com.echolocation19.newsapp.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }

}