package com.theone.template

import com.theone.common.ext.delay
import com.theone.mvvm.core.base.viewmodel.BaseListViewModel
import com.theone.mvvm.core.data.net.IPageInfo

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
 * @date 2022-03-18 17:02
 * @describe TODO
 * @email 625805189@qq.com
 * @remark
 */
class TestViewModel:BaseListViewModel<String> (){

    override fun requestServer() {
        delay(1000){
            onSuccess(DataRepository.getData(),object :IPageInfo{
                override fun getPage(): Int  = page
                override fun getPageSize(): Int  = 10
                override fun getPageTotalCount(): Int = 1
                override fun getTotalCount(): Int  = 10
            })
        }
    }

}