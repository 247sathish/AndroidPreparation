Sure! Here's an example of how to use ViewBinding in Android with SDK 33:

1. Enable ViewBinding in your project:
    - Open your app-level `build.gradle` file.
    - Add the following lines inside the `android` block:

      ```groovy
      android {
          // ...
          viewBinding {
              enabled = true
          }
      }
      ```

2. Create a layout file:
    - Open the layout XML file for your activity or fragment (e.g., `activity_main.xml`).
    - Design your layout as usual.

3. Build the project:
    - Sync your project with Gradle to generate the necessary ViewBinding classes.

4. Access views using ViewBinding:
    - Open the code file for your activity or fragment (e.g., `MainActivity.kt`).
    - Import the generated ViewBinding class for your layout.

      ```kotlin
      import com.example.app.databinding.ActivityMainBinding
      ```

    - Declare a private variable for the ViewBinding object inside your class.

      ```kotlin
      private lateinit var binding: ActivityMainBinding
      ```

    - In the `onCreate()` method (for activities) or `onCreateView()` method (for fragments), inflate the layout using the ViewBinding object.

      ```kotlin
      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          binding = ActivityMainBinding.inflate(layoutInflater)
          val view = binding.root
          setContentView(view)
 
          // Access views using binding
          binding.textView.text = "Hello, ViewBinding!"
      }
      ```

    - Access views using the `binding` object followed by the view ID from your layout.

      ```kotlin
      binding.textView.text = "Hello, ViewBinding!"
      ```

That's it! You can now access the views from your layout using ViewBinding. Remember to replace `com.example.app.databinding.ActivityMainBinding` with the generated ViewBinding class corresponding to your layout file.