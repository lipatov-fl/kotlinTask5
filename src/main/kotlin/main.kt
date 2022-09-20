var countRandom: Int = (0..2000).random()
var countCommentsRandom: Int = (0..700).random()
var copyrightIdRandom: Int = (0..2000).random()
var countLikesRandom: Int = (0..3000).random()
val reportsRandom: Int = (0..500).random()

val comment = Comments(countCommentsRandom, true, true, false, true)
val views = Views(countRandom)
val copyright = Copyright(copyrightIdRandom, "Link", "Alex", "Close")
val likes = Likes(countLikesRandom, true, true, false)
val reports = Reposts(reportsRandom, false)
fun main() {

    val myPostOne = Post(
        1,
        2,
        1,
        2,
        4,
        "Текст",
        3,
        2,
        true,
        comment,
        copyright,
        likes,
        reports,
        views,
        "postType",
        1,
        true,
        true,
        true,
        true,
        true,
        true,
        1
    )

    val myPostTwo = Post(
        2,
        4,
        2,
        2,
        1,
        "Текст_2",
        5,
        2,
        true,
        comment,
        copyright,
        likes,
        reports,
        views,
        "postType_2",
        2,
        true,
        true,
        true,
        true,
        true,
        true,
        2
    )

    val service = WallService
    service.add(myPostOne)
    service.add(myPostTwo)

    service.print()

    service.update(myPostTwo)
}