package com.dongnao.base.lib.h

import android.os.Build
import android.view.View


/**
 * 动脑视频第二节 第三段视频: lsn2_2_Kotlin基础语法3_接口、类与访问控制.vep
 */
/**
 * 接口、抽象类、继承
 * 嵌套类、内部类、object与伴生对象
 * 访问控制
 */
/**
 * public 默认 所有地方可见
 * private 类内部 同文件当中可见
 * protected 子类内部可见
 * internal 项目模块内可见
 */

class AlertDialog{

    //伴生类
    companion object AssociatedClz{
        fun show(){
            println("I from AlertDialog")
        }
    }

    val str="hello"

    //嵌套类 拿不到外部内引用的
    class Builder

    //内部类
    inner class InnerClz{
        fun Test(){
            println("打印：${str.length}")
        }
    }

}

//类似于静态类
object Dialog{
    fun show(){
        println("I from Dialog")
    }
}

fun main(args: Array<String>) {
    Dialog.show()
    AlertDialog.show()

    //匿名内部类
    val person=object :Person(){
        override fun test() {

        }
    }

    //当接口只有一个函数 一个参数的时候 ，可用 it 关键字代替参数
    val listener3= View.OnClickListener {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            it.cancelDragAndDrop()
        }
    }

}