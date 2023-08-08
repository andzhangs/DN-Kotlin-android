//设置文件类 别名
@file:JvmName("Autils")
@file:JvmMultifileClass

package com.dongnao.base.lib.a

fun a() {
    System.out.println("访问成功a()")
}

class MyClass {
    //定义伴随类
    companion object {
        fun foo() {

        }
    }
}

//给伴随类对象添加扩展函数或者扩展属性
fun MyClass.Companion.foo() {
    ProtocolState.valueOf("哈哈哈")
}


interface Factory<T> {
    fun create(): T
}

class MyClass2 {
    //定义伴随类
    companion object : Factory<Int> {
        override fun create(): Int {
            return 100
        }

        fun foo(): MyClass2 {
            return MyClass2()
        }
    }
}

val myClass = MyClass2.foo()


/**
 * 枚举-匿名类
 */
enum class ProtocolState {
    WAITING {
        override fun signal() = TAKING

    },
    TAKING {
        override fun signal() = WAITING
    };
//    BREAK {
//        override fun signal(): ProtocolState {
//            println()
//        }
//
//    };

    abstract fun signal(): ProtocolState
}





