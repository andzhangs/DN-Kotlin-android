package com.dongnao.base.lib.h

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * 动脑视频第三节 第一段视频: lsn3_0_Kotlin高级特性1_lambda、操作符重载与协程.vep
 * 协程
 */
private fun initCoroutines() {
//        acBtnClick.text = stringFromJNI()
    //生命周期是整个应用程序的生命周期
    var job = GlobalScope.launch {
        delay(1500L)
        println("在延迟后打印输出")
//        runOnUiThread {
//            acBtnClick.text = "Hello Kotlin!"
//        }
    }
    //等待协程执行完成
//        job.join()

    println("协程已在等待时主线程还在继续")
    Thread.sleep(1000L) // 阻塞主线程 2 秒钟来保证 JVM 存活

    val asyn = GlobalScope.async {
        delay(2000L)
        println("打印：asyn ${Thread.currentThread()}")
        job.cancel()
        "finish"
    }
    //协程返回值
//        val s=asyn.await()
//        System.out.println("打印：$s");


}