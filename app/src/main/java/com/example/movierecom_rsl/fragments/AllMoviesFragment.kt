package com.example.movierecom_rsl.fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonArrayRequest
import com.example.movierecom_rsl.AdapterForAllMovies
import com.example.movierecom_rsl.MovieDetailActivity
import com.example.movierecom_rsl.MovieModelClass
import com.example.movierecom_rsl.R
import com.example.movierecom_rsl.VolleySingelton
import org.json.JSONArray
import org.json.JSONObject

class AllMoviesFragment : Fragment() {

    val API_URL: String = "https://mocki.io/v1/13fc070d-690a-40ef-86ea-4090b8f68026"

    private lateinit var recyclerView: RecyclerView
    private lateinit var requestQueue: RequestQueue
    private lateinit var movieList: ArrayList<MovieModelClass>

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_all_movies, container, false)
        // Find ImageButtons by ID
        val imageButton1: ImageButton = view.findViewById(R.id.imageButton1)
        val imageButton2: ImageButton = view.findViewById(R.id.imageButton2)
        val imageButton3: ImageButton = view.findViewById(R.id.imageButton3)
        val imageButton4: ImageButton = view.findViewById(R.id.imageButton4)
        val imageButton5: ImageButton = view.findViewById(R.id.imageButton5)
        val imageButton6: ImageButton = view.findViewById(R.id.imageButton6)
        val imageButton7: ImageButton = view.findViewById(R.id.imageButton7)

        // Set onClickListeners for each ImageButton and navigate to MovieDetailActivity
        imageButton1.setOnClickListener {
            val intent = Intent(activity, MovieDetailActivity::class.java)
            intent.putExtra("MOVIE_TITLE", "Hit 2")
            intent.putExtra("MOVIE_POSTER", "URL_TO_HIT_2_POSTER")
            intent.putExtra("MOVIE_DESCRIPTION", "A crime thriller movie with twists.")
            intent.putExtra("MOVIE_REVIEWS", "Amazing movie with gripping storylines!")
            startActivity(intent)
        }

        imageButton2.setOnClickListener {
            val intent = Intent(activity, MovieDetailActivity::class.java)
            intent.putExtra("MOVIE_TITLE", "3 Idiots")
            intent.putExtra("MOVIE_POSTER", "URL_TO_3_IDIOTS_POSTER")
            intent.putExtra("MOVIE_DESCRIPTION", "A comedy-drama about friendship and life.")
            intent.putExtra("MOVIE_REVIEWS", "One of the best Bollywood movies ever!")
            startActivity(intent)
        }

        imageButton3.setOnClickListener {
            val intent = Intent(activity, MovieDetailActivity::class.java)
            intent.putExtra("MOVIE_TITLE", "Arjun Reddy")
            intent.putExtra("MOVIE_POSTER", "URL_TO_ARJUN_REDDY_POSTER")
            intent.putExtra("MOVIE_DESCRIPTION", "A love story with intense drama.")
            intent.putExtra("MOVIE_REVIEWS", "Powerful performance by Vijay Deverakonda!")
            startActivity(intent)
        }

        imageButton4.setOnClickListener {
            val intent = Intent(activity, MovieDetailActivity::class.java)
            intent.putExtra("MOVIE_TITLE", "Joker")
            intent.putExtra(
                "MOVIE_POSTER",
                "https://theultimaterabbit.com/2020/01/10/joker-movie-and-blu-ray-review/"
            )
            intent.putExtra("MOVIE_DESCRIPTION", "A dark and psychological thriller.")
            intent.putExtra("MOVIE_REVIEWS", "Masterpiece with excellent acting!")
            startActivity(intent)
        }

        imageButton5.setOnClickListener {
            val intent = Intent(activity, MovieDetailActivity::class.java)
            intent.putExtra("MOVIE_TITLE", "Arjun Reddy")
            intent.putExtra("MOVIE_POSTER", "URL_TO_ARJUN_REDDY_POSTER")
            intent.putExtra("MOVIE_DESCRIPTION", "A love story with intense drama.")
            intent.putExtra("MOVIE_REVIEWS", "Powerful performance by Vijay Deverakonda!")
            startActivity(intent)
        }

        imageButton6.setOnClickListener {
            val intent = Intent(activity, MovieDetailActivity::class.java)
            intent.putExtra("MOVIE_TITLE", "Arjun Reddy")
            intent.putExtra("MOVIE_POSTER", "URL_TO_ARJUN_REDDY_POSTER")
            intent.putExtra("MOVIE_DESCRIPTION", "A love story with intense drama.")
            intent.putExtra("MOVIE_REVIEWS", "Powerful performance by Vijay Deverakonda!")
            startActivity(intent)
        }
        imageButton7.setOnClickListener {
            val intent = Intent(activity, MovieDetailActivity::class.java)
            intent.putExtra("MOVIE_TITLE", "Arjun Reddy")
            intent.putExtra("MOVIE_POSTER", "URL_TO_ARJUN_REDDY_POSTER")
            intent.putExtra("MOVIE_DESCRIPTION", "A love story with intense drama.")
            intent.putExtra("MOVIE_REVIEWS", "Powerful performance by Vijay Deverakonda!")
            startActivity(intent)
        }

        return view
    }
}
