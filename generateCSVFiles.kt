import java.io.File

fun readFileDirectlyAsText(fileName: String): List<String> = File(fileName).readLines(Charsets.UTF_8)

fun main(args: Array<String>) {

 println("Work in progess")

}
