package com.example.tastyappclone.data.model.bannerMovie

class bannerViewPagerMovieModel(var bannerMovieName: String, var bannerImage: Int) {


    fun getbannerImage(): Int {
        return bannerImage
    }
    fun getbannerMovieName(): String{
        return bannerMovieName
    }
}