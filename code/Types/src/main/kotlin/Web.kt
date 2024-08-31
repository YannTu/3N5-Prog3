package org.tupayachi

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main(args: Array<String>) {
    val doc : Document = Jsoup.connect(args[0]).get()
    println(doc.wholeText())
}