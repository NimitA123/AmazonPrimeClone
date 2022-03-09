package com.example.tastyappclone.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.FragmentTransaction

import com.example.tastyappclone.R
import com.example.tastyappclone.view.fragment.*

import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private lateinit var homeFragment: HomeFragment
    private lateinit var channelsFragment: ChannelsFragment
    private lateinit var findFragment:FindFragment
    private lateinit var downloadFragment: DownloadFragment
    private lateinit var myStuffFragment:MyStuffFragment
    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
         /*   if (savedInstanceState == null) {
                val fragment =HomeFragment()
                supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment, fragment.javaClass.getSimpleName())
                    .commit()
            }*/
                when (item.itemId) {
                    R.id.home -> {
                        val fragment = HomeFragment()
                        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment, fragment.javaClass.getSimpleName())
                            .commit()
                        true
                    }
                    R.id.Channels -> {
                        val fragment = ChannelsFragment()
                        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment, fragment.javaClass.getSimpleName())
                            .commit()
         true
                    }
                    R.id.Find -> {
                        val fragment = FindFragment()
                        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment, fragment.javaClass.getSimpleName())
                            .commit()
                         true
                    }
                    R.id.MyStuff -> {
                        val fragment = MyStuffFragment()
                        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment, fragment.javaClass.getSimpleName())
                            .commit()
                     true
                    }
                }
                    false

            }


        }


    }