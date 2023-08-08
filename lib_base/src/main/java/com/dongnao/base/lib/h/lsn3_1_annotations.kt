package com.dongnao.base.lib.h


/**
 * 动脑视频第三节 第二段视频: lsn3_1_泛型、注解与反射.vep
 * 注解与反射
 */
@Target(
    AnnotationTarget.FIELD,
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.CONSTRUCTOR
)
annotation class CustomAnno


@CustomAnno
var name = "1"

@CustomAnno
class Mainctivity(val name: String?) {
    init {
        println("打印：$name")
    }
}

class Test() {
    var str1: String? = null
    var str2: String? = null

    @CustomAnno
    constructor(s1: String?, s2: String?) : this() {
        this.str1 = s1
        this.str2 = s2
    }
}

@CustomAnno
fun initView() {
    println("调用函数initView()：打印出成功!!")
}


/**
 * 反射
 */
fun main(args: Array<String>) {
    //Class<?>
    //获得java对象
    String::class.java
    String.javaClass

    //函数、属性引用
    listOf(1, 2, 3).forEach(::println)

    val p = ::name
    p.set("10000")
    println("${p.name}")

    Mainctivity::name.get(Mainctivity("哈哈哈哈"))

}




