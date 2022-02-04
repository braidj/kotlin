import java.io.File

fun readFileDirectlyAsText(fileName: String): List<String> = File(fileName).readLines(Charsets.UTF_8)

fun main(args: Array<String>) {

    val dataSource = "D:\\xerini\\personal_dev\\kotlin\\certificates_attribs_stripped"

    val lines = readFileDirectlyAsText(dataSource) // list of lines


    for (x in lines) {
        val content = x.split(",")
        val id = content[0]
        val name = content[1]

        println("$name,$id")

        }
    }
