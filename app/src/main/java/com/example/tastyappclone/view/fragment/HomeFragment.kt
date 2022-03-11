package com.example.tastyappclone.view.fragment


import android.net.Network
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import androidx.recyclerview.widget.GridLayoutManager
import com.example.tastyappclone.R
import com.example.tastyappclone.adapter.KidsAdapter
import com.example.tastyappclone.adapter.PopularAdapter
import com.example.tastyappclone.adapter.TastyAdapter
import com.example.tastyappclone.adapter.ThrillerAdapter
import com.example.tastyappclone.data.model.DataDTO
import com.example.tastyappclone.data.model.Kids.DataDtO
import com.example.tastyappclone.data.model.Popular.PopularDataDTO
import com.example.tastyappclone.data.model.Thriller.ThrillerDataDTO
import com.example.tastyappclone.data.remoteDatabase.Netw
import com.example.tastyappclone.data.remoteDatabase.TastyService
import com.example.tastyappclone.reposirity.TastyReposirity
import com.example.tastyappclone.viewModel.MainTastyAppViewModel
import com.example.tastyappclone.viewModel.TastyAppViewModel
import kotlinx.android.synthetic.main.fragment_home.*



class HomeFragment : Fragment() {
    private var arrayList = arrayListOf<DataDTO>()
    private var arrayList1 = mutableListOf<DataDtO>()
    private var arrayList2 = arrayListOf<PopularDataDTO>()
    private var arrayList3 = arrayListOf<ThrillerDataDTO>()
    private lateinit var tastyResposirity: TastyReposirity
    private lateinit var tastyAppViewModel1: TastyAppViewModel
    private lateinit var adapter:TastyAdapter
    private lateinit var kidsAdapter: KidsAdapter
    private lateinit var popularAdapter: PopularAdapter
    private lateinit var thrillerAdapter: ThrillerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val apiClient:TastyService = Netw.getResponse().create(TastyService::class.java)
        tastyResposirity = TastyReposirity(apiClient)
        tastyAppViewModel1 = ViewModelProvider(this, MainTastyAppViewModel(tastyResposirity)).get(TastyAppViewModel::class.java)
        super.onViewCreated(view, savedInstanceState)
        TopMoviesbuildData()
        KidsSMoviesbuildData()
        PopularMoviesbuildData()
        ThrillerMoviesbuildData()
    }
    private fun ThrillerMoviesbuildData() {
        tastyAppViewModel1.thrillerData.observe(viewLifecycleOwner, Observer {
            arrayList3 =  it.data as ArrayList<ThrillerDataDTO>
            Log.d("Nimit", it.toString())
            setAdapter3()

        })
    }

    private fun setAdapter3() {
        thrillerAdapter = ThrillerAdapter(arrayList3)
        val gridLayoutManager = GridLayoutManager(context,  1, GridLayoutManager.HORIZONTAL, true)
        rvRecyclerView3.adapter = thrillerAdapter
        rvRecyclerView3.layoutManager = gridLayoutManager
    }

    private fun PopularMoviesbuildData() {
        tastyAppViewModel1.actionData.observe(viewLifecycleOwner, Observer {
            arrayList2 = it.data as ArrayList<PopularDataDTO>
            Log.d("Nimit", it.toString())
            setAdapter2()

        })
    }

    private fun setAdapter2() {
        popularAdapter = PopularAdapter(arrayList2)
        val gridLayoutManager = GridLayoutManager(context,  1, GridLayoutManager.HORIZONTAL, true)
        rvRecyclerView2.adapter = popularAdapter
        rvRecyclerView2.layoutManager = gridLayoutManager

    }

    private fun KidsSMoviesbuildData() {
        tastyAppViewModel1.kidsData.observe(viewLifecycleOwner, Observer {
            arrayList1 = it.data as MutableList<DataDtO>
            //  Log.d("Nimit", it.toString())
            setAdapter1()

        })
    }

    //This function is responsible for fetching data from the ViewModel
    private fun TopMoviesbuildData() {

        tastyAppViewModel1.tastyData.observe(viewLifecycleOwner, Observer {


            if(arrayList!= null){
                arrayList = it.data as ArrayList<DataDTO>
                setAdapter()
            }else{

            }

        })



    }

    private fun setAdapter1() {
        kidsAdapter= KidsAdapter(arrayList1)
        val gridLayoutManager = GridLayoutManager(context,  1, GridLayoutManager.HORIZONTAL, true)
        rvRecyclerView1.adapter = kidsAdapter
        rvRecyclerView1.layoutManager = gridLayoutManager

    }

    //This function is responsible for setting data into the adapter class
    private fun setAdapter() {
        adapter = TastyAdapter(arrayList)
        val gridLayoutManager = GridLayoutManager(context,  1, GridLayoutManager.HORIZONTAL, true)
        rvRecyclerView.adapter = adapter
        rvRecyclerView.layoutManager = gridLayoutManager


    }

    }

