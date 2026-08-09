data class Book(
    val title: String,
    val author: String
)


class Library {

    private val books = mutableListOf<Book>()


    fun addBook(book: Book) {
        books.add(book)
        println("\"${book.title}\" added to the library.")
    }


    fun removeBook(title: String) {

        val book = books.find {
            it.title.equals(title, ignoreCase = true)
        }

        if (book != null) {
            books.remove(book)
            println("\"${book.title}\" removed from the library.")
        } else {
            println("Book \"$title\" not found.")
        }
    }


    fun showBooks() {

        if (books.isEmpty()) {
            println("Library is empty.")
            return
        }

        println("Books available in the library:")

        for ((index, book) in books.withIndex()) {
            println("${index + 1}. ${book.title} - ${book.author}")
        }
    }
}


fun main() {

    println("===== Library System =====")

    val library = Library()


    val book1 = Book(
        "Kotlin Programming",
        "JetBrains"
    )

    val book2 = Book(
        "Clean Code",
        "Robert C. Martin"
    )

    val book3 = Book(
        "The Pragmatic Programmer",
        "Andrew Hunt"
    )


    println("\n--- Adding Books ---")

    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)


    println("\n--- Showing Books ---")

    library.showBooks()


    println("\n--- Removing Book ---")

    library.removeBook("Clean Code")


    println("\n--- Books After Removal ---")

    library.showBooks()
}