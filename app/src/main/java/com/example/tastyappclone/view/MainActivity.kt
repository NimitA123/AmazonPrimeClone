package com.example.tastyappclone.view

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.tastyappclone.R
import com.example.tastyappclone.adapter.MoviePagerAdapter
import com.example.tastyappclone.data.model.bannerMovie.bannerViewPagerMovieModel
import com.example.tastyappclone.view.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView
    private var bannerList = arrayListOf<bannerViewPagerMovieModel>()
    private lateinit var adapter: MoviePagerAdapter
    lateinit var bannerViewPager:ViewPager
    private var img = listOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // bannerViewPager = findViewById(R.id.bannerViewPager)
        buildSliderData()



        bottomNavigationView = findViewById(R.id.bottom_navigation)
        val fragment = HomeFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, fragment, fragment.javaClass.getSimpleName())
            .commit()
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            if (savedInstanceState == null) {
                val fragment = HomeFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, fragment, fragment.javaClass.getSimpleName())
                    .commit()
            }
            when (item.itemId) {
                R.id.home -> {
                    val fragment = HomeFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, fragment, fragment.javaClass.getSimpleName())
                        .commit()

                }
                R.id.Channels -> {
                    val fragment = ChannelsFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, fragment, fragment.javaClass.getSimpleName())
                        .commit()

                }
                R.id.Find -> {
                    val fragment = FindFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, fragment, fragment.javaClass.getSimpleName())
                        .commit()

                }
                R.id.MyStuff -> {
                    val fragment = MyStuffFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, fragment, fragment.javaClass.getSimpleName())
                        .commit()

                }
            }
            true


        }


    }

 /*   private fun buildSliderAdapter() {
        adapter = MoviePagerAdapter(img, this)
        bannerViewPager.adapter = adapter
        tabLayout.setupWithViewPager(bannerViewPager)


    }*/

    private fun buildSliderData() {
        img = listOf<Int>(R.drawable.bannerimage1, R.drawable.img_1, R.drawable.img, R.drawable.img_2)
        for(i in 0..img.size-1){
           showImage(img[i])
        }
    }

    private fun showImage(i: Int) {
        var imageView = ImageView(this)
        imageView.setBackgroundResource(i)
        viewFlipper.addView(imageView)
        viewFlipper.flipInterval = 3000
        viewFlipper.isAutoStart = true
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left)
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right)


    }


}




