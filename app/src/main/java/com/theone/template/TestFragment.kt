package com.theone.template

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.chad.library.adapter.base.BaseQuickAdapter
import com.theone.mvvm.core.base.fragment.BasePagerSwipeRefreshFragment
import com.theone.mvvm.core.data.enum.LayoutManagerType
import com.theone.mvvm.core.databinding.BaseSwipeRefreshFragmentBinding

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
class TestFragment :
    BasePagerSwipeRefreshFragment<String, TestViewModel, BaseSwipeRefreshFragmentBinding>() {

    override fun initView(root: View) {
        super.initView(root)
        getTopBar()?.setTitle("Test")
    }

    override fun getRecyclerView(): RecyclerView = getDataBinding().recyclerView

    override fun getLayoutManagerType(): LayoutManagerType = LayoutManagerType.GRID

    override fun getItemSpace(): Int  = 12

    override fun createAdapter(): BaseQuickAdapter<String, *> = TestAdapter()

    override fun getRefreshLayout(): SwipeRefreshLayout = getDataBinding().swipeRefresh

    override fun onItemClick(adapter: BaseQuickAdapter<*, *>, view: View, position: Int) {
        startFragment(MainFragment())
    }

}