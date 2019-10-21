package com.example.bloggerapipagination
data class PostList(
    val encoding: String,
    val feed: Feed,
    val version: String
)

data class Feed(
    val author: List<Author>,
    val entry: List<Entry>,
    val generator: Generator,
    val id: IdX,
    val link: List<LinkX>,
    val `openSearch$itemsPerPage`: OpenSearchitemsPerPage,
    val `openSearch$startIndex`: OpenSearchstartIndex,
    val `openSearch$totalResults`: OpenSearchtotalResults,
    val subtitle: Subtitle,
    val title: TitleX,
    val updated: UpdatedX,
    val xmlns: String,
    val `xmlns$blogger`: String,
    val `xmlns$gd`: String,
    val `xmlns$georss`: String,
    val `xmlns$openSearch`: String,
    val `xmlns$thr`: String
)

data class Author(
    val email: Email,
    val `gd$image`: Gdimage,
    val name: Name,
    val uri: Uri
)

data class Email(
    val `$t`: String
)

data class Gdimage(
    val height: String,
    val rel: String,
    val src: String,
    val width: String
)

data class Name(
    val `$t`: String
)

data class Uri(
    val `$t`: String
)

data class Entry(
    val author: List<AuthorX>,
    val content: Content,
    val id: Id,
    val link: List<Link>,
    val `media$thumbnail`: Mediathumbnail,
    val published: Published,
    val title: Title,
    val updated: Updated
)

data class AuthorX(
    val email: EmailX,
    val `gd$image`: GdimageX,
    val name: NameX,
    val uri: UriX
)

data class EmailX(
    val `$t`: String
)

data class GdimageX(
    val height: String,
    val rel: String,
    val src: String,
    val width: String
)

data class NameX(
    val `$t`: String
)

data class UriX(
    val `$t`: String
)

data class Content(
    val `$t`: String,
    val type: String
)

data class Id(
    val `$t`: String
)

data class Link(
    val href: String,
    val rel: String,
    val title: String,
    val type: String
)

data class Mediathumbnail(
    val height: String,
    val url: String,
    val width: String,
    val `xmlns$media`: String
)

data class Published(
    val `$t`: String
)

data class Title(
    val `$t`: String,
    val type: String
)

data class Updated(
    val `$t`: String
)

data class Generator(
    val `$t`: String,
    val uri: String,
    val version: String
)

data class IdX(
    val `$t`: String
)

data class LinkX(
    val href: String,
    val rel: String,
    val type: String
)

data class OpenSearchitemsPerPage(
    val `$t`: String
)

data class OpenSearchstartIndex(
    val `$t`: String
)

data class OpenSearchtotalResults(
    val `$t`: String
)

data class Subtitle(
    val `$t`: String,
    val type: String
)

data class TitleX(
    val `$t`: String,
    val type: String
)

data class UpdatedX(
    val `$t`: String
)