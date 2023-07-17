Sure! Here's a complete example of using the Architecture Component Paging library in Android:

1. Add the necessary dependencies to your app-level build.gradle file:
```groovy
dependencies {
    // Paging library
    implementation "androidx.paging:paging-runtime-ktx:3.0.0"
}
```

2. Create a data model class to represent your items. For example, let's create a `User` class:
```kotlin
data class User(val id: Int, val name: String)
```

3. Create a data source class that extends the `PagingSource` class. This class is responsible for loading data in chunks (pages) for your paging list. In this example, we'll create a `UserPagingSource`:
```kotlin
class UserPagingSource(private val userService: UserService) : PagingSource<Int, User>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, User> {
        try {
            // Get the current page key from params.key
            val page = params.key ?: 1

            // Make the network request to fetch the users for the current page
            val response = userService.getUsers(page)

            // Extract the list of users from the response
            val users = response.data

            // Calculate the next page key
            val nextPage = if (response.hasMore) page + 1 else null

            // Return the loaded data as LoadResult.Page
            return LoadResult.Page(data = users, prevKey = null, nextKey = nextPage)
        } catch (e: Exception) {
            // Handle the error case and return LoadResult.Error
            return LoadResult.Error(e)
        }
    }
}
```

4. Create a service interface to define the API endpoints. In this example, we'll create a `UserService` interface:
```kotlin
interface UserService {
    @GET("users")
    suspend fun getUsers(@Query("page") page: Int): UserResponse
}
```

5. Create a `PagingConfig` object that defines the configuration for your paging list, such as the page size and prefetch distance. For example:
```kotlin
val pagingConfig = PagingConfig(
    pageSize = 20, // Number of items to load per page
    prefetchDistance = 10, // Number of items to prefetch
    enablePlaceholders = false // Whether to show placeholders for unloaded items
)
```

6. Create a `PagingData` object using the `Pager` class and observe it using `Flow` in your ViewModel. In this example, we'll create a `UserViewModel`:
```kotlin
class UserViewModel(private val userService: UserService) : ViewModel() {
    val pagingData: Flow<PagingData<User>> = Pager(config = pagingConfig) {
        UserPagingSource(userService)
    }.flow
}
```

7. Set up your RecyclerView with the `PagingDataAdapter` and observe the `pagingData` in your activity or fragment:
```kotlin
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = UserAdapter()

        binding.recyclerView.adapter = adapter

        lifecycleScope.launch {
            viewModel.pagingData.collectLatest { pagingData ->
                adapter.submitData(pagingData)
            }
        }
    }
}
```

That's it! This example demonstrates how to use the Architecture Component Paging library to load and display paginated data in a RecyclerView using a ViewModel and a PagingDataAdapter. The library takes care of handling the pagination logic and efficiently loading data

as the user scrolls through the list.


Certainly! Here's an example of the XML layout file for the activity_main.xml:

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recyclerView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:listitem="@layout/item_user" />

</LinearLayout>
```

In the above layout, we have a vertical LinearLayout containing a RecyclerView that will display the list of users. The RecyclerView has an id of "recyclerView" and uses the layout file "item_user" for each item in the list.

To add 30 records in the User model, you can simulate the data by creating a list of User objects in your UserService implementation. Here's an example of how you can do it:

```kotlin
class UserServiceImpl : UserService {
    override suspend fun getUsers(page: Int): UserResponse {
        // Simulate fetching data from a remote API or database
        val userList = generateUserList(30) // Generate a list of 30 users
        return UserResponse(userList, hasMore = false) // Assume there are no more pages for this example
    }

    private fun generateUserList(count: Int): List<User> {
        val userList = mutableListOf<User>()
        for (i in 1..count) {
            val user = User(i, "User $i")
            userList.add(user)
        }
        return userList
    }
}
```

In this example, the `generateUserList()` function creates a list of 30 User objects with IDs ranging from 1 to 30 and names "User 1" to "User 30". The `getUsers()` function returns this list as a UserResponse object.

Remember to use this `UserServiceImpl` implementation in your `UserViewModel` when initializing the `UserService`.

With these changes, your app should display a RecyclerView with 30 user items using the provided XML layout file and data.


Certainly! Here's an example of the item_user.xml layout file:

```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:padding="16dp">

    <TextView
        android:id="@+id/textName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="16sp"
        android:textStyle="bold" />

    <TextView
        android:id="@+id/textId"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="14sp" />

</LinearLayout>
```

In the above layout, we have a vertical LinearLayout containing two TextViews. The first TextView with id "textName" is used to display the user's name, and the second TextView with id "textId" is used to display the user's ID.

You can customize the layout according to your needs, such as adding additional views or styling the existing views. This is just a basic example to display the name and ID of a user in each item of the RecyclerView.






https://sharmadhiraj.medium.com/android-paging-library-step-by-step-implementation-guide-75417753d9b9

