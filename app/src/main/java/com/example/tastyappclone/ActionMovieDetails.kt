package com.example.tastyappclone

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_movie_details.*

class ActionMovieDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_movie_details)
        var intent = intent
        var moviesImage = intent.getStringExtra("image").toString()
        Picasso.get().load(moviesImage).into(MoviesImage)
        var moviesName = intent.getStringExtra("moviesName").toString()
        MovieName.text = moviesName
        var moviesDescription = intent.getStringExtra("MoviesDescription").toString()
        MovieDescription.text = moviesDescription
        var year = intent.getStringExtra("Year").toString()
        MovieDate.text = "Year:- " +year
        var rating = intent.getStringExtra("rating").toString()
        MovieRating.text = "Rating "+rating+"*"
        var directorImage = intent.getStringExtra("directorImage").toString()
        Picasso.get().load(directorImage).into(DirectorImage)
        WatchButton.setOnClickListener {
            var movieVideo = intent.getStringExtra("MovieVideo").toString()
            Log.d("Yuvan", movieVideo)
            if(movieVideo!= null) {
                Log.d("Yuvan", movieVideo)
                val webIntent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(movieVideo)
                )
                try {
                    this.startActivity(webIntent)
                } catch (ex: ActivityNotFoundException) {
                }
            }
            else{
                Toast.makeText(applicationContext, "MovieDetail", Toast.LENGTH_LONG).show()
                Log.d("Yuvan", movieVideo)
            }
            /* var intent = Intent(this, MovieVideo::class.java)
             intent.putExtra("movieVideo", movieVideo)
             startActivity(intent)*/
        }

    }


}