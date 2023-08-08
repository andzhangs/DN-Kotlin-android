package com.dongnao.base.lib.a

import android.view.View


//通过 @JvmField 注解可以让编译器只生成一个 public 的成员属性，
// 不生成对应的 setter/getter 函数
var names = """
    {
        "date": "15",
        "high": "高温 18℃",
        "low": "低温 8℃",
        "ymd": "2019-10-15",
        "week": "星期二",
        "sunrise": "06:19",
        "sunset": "17:35",
        "aqi": 57,
        "fx": "西风",
        "fl": "<3级",
        "type": "晴",
        "notice": "愿你拥有比阳光明媚的心情"
    }
""".trimIndent()

//public static final
const val userSex = "男"


//String的扩展方法
fun String.myTest() {

}

//Int的扩展方法
fun Int.myTest() {

}

//存在两个相同的重载方法
//Java中相同的方法签名
@JvmName("StringTest")
fun List<String>.test() {

}

fun List<Int>.test() {
    A("Q").names
    B.name
}





class A(val name: String) {

    //在Java中具有与kotlin一样的可见性[names]   public final
    @JvmField
    val names = name

    //伴生类
    companion object Jvm {
        //通过这个注解将 object 和 companion object 的内部函数和属性，真正生成为静态的。
        @JvmStatic
        val id = "12"
    }
}

//单例
object B {
    val name: String = "1"
    fun bMethod() {
    }
}

// 匿名内部类
object Click : View.OnClickListener {
    override fun onClick(v: View?) {

    }
}

//重载 自动生成多个构造函数
@JvmOverloads
fun params(name: String = "你好", sex: Int = 1) {

}

//强制try-catch 抛出异常
@Throws(NullPointerException::class)
fun myEx() {
    System.out.println("输出：调用了myEx()函数")
    throw NullPointerException("哈哈，异常了吧")
}



