package com.androidpreparation.network.volley

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.android.volley.NetworkResponse
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.HttpHeaderParser
import com.android.volley.toolbox.ImageRequest
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.androidpreparation.R
import com.androidpreparation.databinding.ActivityMainBinding
import com.androidpreparation.databinding.ActivityVolleyBinding
import java.nio.charset.Charset

class VolleyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVolleyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volley)
        binding= ActivityVolleyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.strId.setOnClickListener {
            strRequest()
        }

        binding.jsonId.setOnClickListener {
            jsonObjectRequest()
        }

        binding.jsonArrayId.setOnClickListener {
            jsonArrayRequest()
        }

        binding.addPostingId.setOnClickListener {
            postRequest()
        }


        binding.imgId.setOnClickListener {
            imgRequest()
        }

        binding.addingRequestHeaderId.setOnClickListener {
            addingRequestHeader()
        }
        binding.handlingVolleyCacheId.setOnClickListener {
            handlingVolleyCache()
        }
        binding.cancellingRequestId.setOnClickListener {
            cancellingRequest()
        }
        binding.requestPrioritization.setOnClickListener {
            requestPrioritization()
        }



    }


    fun jsonObjectRequest()
    {
        // request queue and initializing it.
        val requestQueue: RequestQueue = Volley.newRequestQueue(applicationContext)
        val url = "https://jsonplaceholder.typicode.com/posts/1"
        val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null,
            { response ->
                // Handle the response
//                val name = response.getString("name")
//                val age = response.getInt("age")
//                println("Name: $name, Age: $age")
                binding.textView.text=response.toString()
            },
            { error ->
                // Handle the error
                println("Error: ${error.message}")
            })

        // Add the request to the RequestQueue
        requestQueue.add(jsonObjectRequest)

    }
    fun jsonArrayRequest()
    {
        // request queue and initializing it.
        val requestQueue: RequestQueue = Volley.newRequestQueue(applicationContext)
        val url = "https://jsonplaceholder.typicode.com/posts"
        val jsonArrayRequest = JsonArrayRequest(Request.Method.GET, url, null,
            { response ->
                // Handle the response
//                for (i in 0 until response.length()) {
//                    val item = response.getJSONObject(i)
//                    val name = item.getString("name")
//                    val age = item.getInt("age")
//                    println("Item $i - Name: $name, Age: $age")
//                }
                binding.textView.text=response.toString()
            },
            { error ->
                // Handle the error
                println("Error: ${error.message}")
            })

        // Add the request to the RequestQueue
        requestQueue.add(jsonArrayRequest)

    }
    fun postRequest()
    {
        // request queue and initializing it.
        val requestQueue: RequestQueue = Volley.newRequestQueue(applicationContext)
        val url = "https://jsonplaceholder.typicode.com/posts"
        val stringRequest = object : StringRequest(Method.POST, url,
            Response.Listener { response ->
                // Handle the response
                println("Response: $response")
                binding.textView.text=response.toString()
            },
            Response.ErrorListener { error ->
                // Handle the error
                println("Error: ${error.message}")
            }) {
            override fun getParams(): Map<String, String> {
                val params = HashMap<String, String>()
                params["param1"] = "value1"
                params["param2"] = "value2"
                return params
            }
        }

        // Add the request to the RequestQueue
        requestQueue.add(stringRequest)

    }
    fun imgRequest()
    {
        // request queue and initializing it.
        val requestQueue: RequestQueue = Volley.newRequestQueue(applicationContext)
        val imageUrl = "https://via.placeholder.com/150"
        val imageRequest = ImageRequest(imageUrl,
            { response ->
                // Handle the response (e.g., set the image to an ImageView)
                binding.imageView2.setImageBitmap(response)
            },
            0, 0,
            null,
            { error ->
                // Handle the error
                println("Error: ${error.message}")
            })

    // Add the request to the RequestQueue
        requestQueue.add(imageRequest)

    }


    fun strRequest()
    {
        // request queue and initializing it.
        val requestQueue: RequestQueue = Volley.newRequestQueue(applicationContext)
        val url = "https://jsonplaceholder.typicode.com/posts/1"
        val stringRequest = StringRequest(Request.Method.GET, url,
            { response ->
                // Handle the response
                println("Response: $response")
                binding.textView.text=response.toString()
            },
            { error ->
                // Handle the error
                println("Error: ${error.message}")
            })
        // Add the request to the RequestQueue
        requestQueue.add(stringRequest)
    }


    fun addingRequestHeader()
    {
        val requestQueue: RequestQueue = Volley.newRequestQueue(applicationContext)
        val url = "https://jsonplaceholder.typicode.com/posts/1"
        val stringRequest = object : StringRequest(Method.GET, url,
            Response.Listener { response ->
                // Handle the response
                println("Response: $response")
                binding.textView.text=response.toString()
            },
            Response.ErrorListener { error ->
                // Handle the error
                println("Error: ${error.message}")
            }) {
            override fun getHeaders(): MutableMap<String, String> {
                val headers = HashMap<String, String>()
                headers["Authorization"] = "Bearer token"
                return headers
            }
        }
        // Add the request to the RequestQueue
        requestQueue.add(stringRequest)
    }



    fun handlingVolleyCache()
    {
        val requestQueue: RequestQueue = Volley.newRequestQueue(applicationContext)
        val url = "https://jsonplaceholder.typicode.com/posts/1"
        val cacheRequest = object : Request<String>(Method.GET, url,
            Response.ErrorListener { error ->
                // Handle the error
                println("Error: ${error.message}")
                binding.textView2.text=error.message.toString()
            }) {
            override fun parseNetworkResponse(response: NetworkResponse): Response<String> {
                val data = String(response.data, Charset.defaultCharset())
                val cacheEntry = HttpHeaderParser.parseCacheHeaders(response)
                return Response.success(data, cacheEntry)
            }

            override fun deliverResponse(response: String) {
                // Handle the response
                println("Response: $response")
                binding.textView.text=response.toString()
            }
        }

        cacheRequest.setShouldCache(true) // Enable caching
        requestQueue.add(cacheRequest)



    }


    fun cancellingRequest()
    {

        val requestQueue: RequestQueue = Volley.newRequestQueue(applicationContext)
        val url = "https://jsonplaceholder.typicode.com/posts/1"
        val stringRequest = StringRequest(Request.Method.GET, url,
            { response ->
                // Handle the response
                println("Response: $response")
                binding.textView.text=response.toString()
            },
            { error ->
                // Handle the error
                println("Error: ${error.message}")
            })

            // Add a tag to the request
                    stringRequest.tag = "stringRequest"

            // Add the request to the RequestQueue
                    requestQueue.add(stringRequest)

            // Cancel the request
                    requestQueue.cancelAll("stringRequest")

    }



    fun requestPrioritization()
    {
        val requestQueue: RequestQueue = Volley.newRequestQueue(applicationContext)
        val url1 = "https://jsonplaceholder.typicode.com/posts/1"
        val url2 = "https://jsonplaceholder.typicode.com/posts/2"

        // Custom implementation of StringRequest to allow priority modification
        class CustomStringRequest(
            method: Int,
            url: String,
            listener: Response.Listener<String>?,
            errorListener: Response.ErrorListener?
        ) : StringRequest(method, url, listener, errorListener) {
            private var priority: Request.Priority = Request.Priority.NORMAL

            fun setPriority(priority: Request.Priority) {
                this.priority = priority
            }

            override fun getPriority(): Request.Priority {
                return priority
            }
        }

        val stringRequest1 = CustomStringRequest(
            Request.Method.GET, url1,
            { response ->
                // Handle the response
                println("Response: $response")
                binding.textView.text=response.toString()
            },
            { error ->
                // Handle the error
                println("Error: ${error.message}")
            })

        val stringRequest2 = CustomStringRequest(
            Request.Method.GET, url2,
            { response ->
                // Handle the response
                println("Response: $response")
                binding.textView2.text=response.toString()
            },
            { error ->
                // Handle the error
                println("Error: ${error.message}")
            })

// Set the priority for the requests
        stringRequest1.setPriority(Request.Priority.LOW)
        stringRequest2.setPriority(Request.Priority.HIGH)

// Add the requests to the RequestQueue
        requestQueue.add(stringRequest1)
        requestQueue.add(stringRequest2)



    }

}