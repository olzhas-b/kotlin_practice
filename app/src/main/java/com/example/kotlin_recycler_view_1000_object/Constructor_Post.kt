package com.example.kotlin_recycler_view_1000_object;


data class Constructor_Post(
    var description: String,
    var image: String,
    var username: String
) {
    override fun toString(): String {
    return "Constructor_Post(description='$description', image='$image', username='$username')"
    }
}

