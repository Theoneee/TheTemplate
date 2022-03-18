package com.theone.template

import android.util.SparseArray
import android.view.View
import com.theone.mvvm.base.viewmodel.BaseViewModel
import com.theone.mvvm.core.base.fragment.BaseCoreFragment
import com.theone.mvvm.ext.addParams
import com.theone.template.databinding.FragmentMainBinding

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
 * @date 2022-02-10 09:48
 * @describe TODO
 * @email 625805189@qq.com
 * @remark
 */
class MainFragment : BaseCoreFragment<MainViewModel,FragmentMainBinding>() {

    override fun initView(root: View) {
        getTopBar()?.setTitle("The Template")
    }

    override fun createObserver() {
    }

    override fun SparseArray<Any>.applyBindingParams() {
        addParams(BR.url,DataRepository.URL)
    }

}