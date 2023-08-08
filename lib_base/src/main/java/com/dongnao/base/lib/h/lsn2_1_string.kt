package com.dongnao.base.lib.h

/**
 * 动脑视频第二节 第二段视频: lsn2_1_Kotlin基础语法2_字符串、正则表达式、null安全与本地函数.vep
 */
fun main(args: Array<String>) {
    //kotlin 扩展方法
    val msg = "com.dongnao.kotlin.master.ktfiles"
    val (param1, param2, param3, param4, param5) = msg.split(".")
    println("param1-> $param1")
    println("param2-> $param2")
    println("param3-> $param3")
    println("param4-> $param4")
    println("param5-> $param5")

    val path = "Contents/jre/jdk/Co.ntents/Home/bin/java"
    val a = path.substringBeforeLast("/")
    println("最后斜杠之前的字符串：$a")
    val b = path.substringAfterLast("/")
    println("最后斜杠之后的字符串：$b")
    val c = path.substringBefore("/")
    println("第一个斜杠之前的字符串：$c")
    val d = path.substringAfter("/")
    println("第一个最后斜杠之后的字符串：$d")
    val e = path.subSequence(5, 30)
    println("截取：$e")

    path.forEach {
        print(it + "_")
    }

    println()

    println("-----------------正则表达式----------------")

    val regular = "(.+)/(.+)\\.(.+)".toRegex()
    test(regular, path)
    println("-----------------分隔线----------------")

    val regular2 = """(.+)/(.+)\.(.+)""".toRegex()
    test(regular2, path)
    println("-----------------分隔线----------------")

    val str = """'$'path"""  //获取自变量
    val str2 = "$path"
    println("str：$str\t\t str2：$str2")

}

fun test(regular: Regex, path: String) {
    val matchResult = regular.matchEntire(path)
    if (matchResult != null) {
        val list = matchResult.groupValues.toList()
        list.forEach { println(it) }
    }
}