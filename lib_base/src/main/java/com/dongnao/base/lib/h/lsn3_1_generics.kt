package com.dongnao.base.lib.h

/**
 * 动脑视频第三节 第二段视频: lsn3_1_泛型、注解与反射.vep
 * 泛型
 */

//泛型类 协变 ? extends
class ContainsIn<in T> {
    fun set(t: T) {

    }
}

//逆变 ? super
class ContainsOut<out T> {
//    fun set():T {
//    }
}

//无界限通配符 *
val alist: ArrayList<*> = arrayListOf(1, 2, 3)

//既将泛型作为函数参数，又将泛型作为函数的输出，那就既不用 in 或 out。
interface ProductionConsumer<T> {
    fun produce(): T
    fun consume(item: T)
}

//泛型方法
fun <T> Test(t: T) {

}

//泛型约束
fun <T : Number> put(t: T) {
    println("打印put: t= $t")
}

interface OnClick
interface OnLongClick

//多个约束
fun <T> add(t: T) where T : OnClick, T : OnLongClick {
    println("打印 add访问成功!")
}

class Impl : OnClick, OnLongClick {
    init {
        println("打印 Impl访问成功!")
    }
}

fun main(args: Array<String>) {

    put(1)
    add(Impl())
}