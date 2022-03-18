package com.theone.template

import com.theone.common.ext.delay
import kotlinx.coroutines.delay

//  ┏┓　　　┏┓
//┏┛┻━━━┛┻┓
//┃　　　　　　　┃
//┃　　　━　　　┃
//┃　┳┛　┗┳　┃
//┃　　　　　　　┃
//┃　　　┻　　　┃
//┃　　　　　　　┃
//┗━┓　　　┏━┛
//    ┃　　　┃                  神兽保佑
//    ┃　　　┃                  永无BUG！
//    ┃　　　┗━━━┓
//    ┃　　　　　　　┣┓
//    ┃　　　　　　　┏┛
//    ┗┓┓┏━┳┓┏┛
//      ┃┫┫　┃┫┫
//      ┗┻┛　┗┻┛
/**
 * @author The one
 * @date 2022-03-18 17:07
 * @describe TODO
 * @email 625805189@qq.com
 * @remark
 */
object DataRepository {

    const val URL = "https://image.geeko.ltd/webp/medium/f7083697-1d86-4e0d-b8b2-f1b029abf3b1-10100-pc"

    fun getData():List<String>{

        val list = mutableListOf<String>()
        for (index in 1..10){
            list.add(URL)
        }
        return list
    }

}