package app

import kotlin.browser.document

import kotlinx.html.*
import kotlinx.html.dom.create
import kotlinx.html.js.*
/*import org.jetbrains.demo.thinkter.model.*
import react.*
import react.dom.*
import kotlin.browser.*
import kotlinx.coroutines.experimental.async
*/
fun main(args: Array<String>) {


    println("CONSOLE HALOO212312312312")

    val myDiv = document.create.div {
        p { +"Superhero text inside" }
    }

    document.getElementById("container")!!.appendChild(myDiv)

    //document.body!!.append("HALLO WELT")

/*    runtime.wrappers.require("pure-blog.css")

    ReactDOM.render(document.getElementById("content")) {
        div {
            Application {}
        }
    }*/
}

