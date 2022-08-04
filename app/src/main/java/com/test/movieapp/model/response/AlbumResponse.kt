package com.test.movieapp.model.response

class AlbumResponse {
val data:List<Albums>? = null
}

data class Albums(val albumId:Int, val id:Int, val title:String, val url:String, val thumbnailUrl:String)


//{
//    "albumId": 1,
//    "id": 1,
//    "title": "accusamus beatae ad facilis cum similique qui sunt",
//    "url": "https://via.placeholder.com/600/92c952",
//    "thumbnailUrl": "https://via.placeholder.com/150/92c952"
//}