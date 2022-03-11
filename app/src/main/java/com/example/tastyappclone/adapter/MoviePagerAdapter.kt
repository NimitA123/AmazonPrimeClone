package com.example.tastyappclone.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.tastyappclone.R
import com.example.tastyappclone.data.model.bannerMovie.bannerViewPagerMovieModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.banner_viewpager_item_layout.view.*

class MoviePagerAdapter(var bannerList: List<Int>, var context:Context) : PagerAdapter() {

    init {
        this.context = context
    }

    override fun getCount(): Int {
      return  bannerList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
     return view.equals(view)
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        return container.removeView(`object`as View)

    }


    override fun instantiateItem(container: ViewGroup, position: Int):Any{
        val view =LayoutInflater.from(context).inflate(R.layout.banner_viewpager_item_layout,null)
        Log.d("Sinu", bannerList.size.toString())
        view.banner_imageView.setImageResource(bannerList.get(position))
        container.addView(view)
        return view
      //  view.banner_text.text = bannerList.get(position)


    }
}