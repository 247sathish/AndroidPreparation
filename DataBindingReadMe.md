https://medium.com/@jencisov/androids-data-binding-with-kotlin-df94a24ffc0f

https://github.com/android/databinding-samples/tree/main/BasicSample/app


id 'kotlin-kapt'

dataBinding {
enabled = true
}

compileOptions {
sourceCompatibility JavaVersion.VERSION_17
targetCompatibility JavaVersion.VERSION_17
}

kotlinOptions {
jvmTarget = '17'
}




Certainly! Here's a more detailed example of how to use Data Binding in Android with SDK 33:

1. Enable Data Binding in your project:
   - Open your app-level `build.gradle` file.
   - Add the following lines inside the `android` block:

     ```groovy
     android {
         // ...
         dataBinding {
             enabled = true
         }
     }
     ```

2. Create a layout file:
   - Open the layout XML file for your activity or fragment (e.g., `activity_main.xml`).
   - Wrap your layout code with the `<layout>` tag.
   - Design your layout as usual.

     ```xml
     <layout xmlns:android="http://schemas.android.com/apk/res/android">
         <LinearLayout
             android:layout_width="match_parent"
             android:layout_height="match_parent"
             android:orientation="vertical">

             <TextView
                 android:id="@+id/textView"
                 android:layout_width="wrap_content"
                 android:layout_height="wrap_content"
                 android:text="@{viewModel.text}" />

         </LinearLayout>
     </layout>
     ```

3. Create a ViewModel class:
   - Create a Kotlin class for your ViewModel (e.g., `MainViewModel.kt`).
   - Define the data properties and their corresponding getter methods.

     ```kotlin
     import androidx.databinding.BaseObservable
     import androidx.databinding.Bindable
     import androidx.databinding.library.baseAdapters.BR

     class MainViewModel : BaseObservable() {

         private var _text: String = ""

         @Bindable
         fun getText(): String {
             return _text
         }

         fun setText(text: String) {
             _text = text
             notifyPropertyChanged(BR.text)
         }
     }
     ```

4. Modify the activity or fragment class:
   - Open the code file for your activity or fragment (e.g., `MainActivity.kt`).
   - Import the generated Data Binding class for your layout.

     ```kotlin
     import com.example.app.databinding.ActivityMainBinding
     ```

   - Declare a private variable for the Data Binding object inside your class.

     ```kotlin
     private lateinit var binding: ActivityMainBinding
     private val viewModel = MainViewModel()
     ```

   - In the `onCreate()` method (for activities) or `onCreateView()` method (for fragments), inflate the layout using the Data Binding object.

     ```kotlin
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
         binding.lifecycleOwner = this
         binding.viewModel = viewModel

         // Access views using binding
         viewModel.setText("Hello, Data Binding!")
     }
     ```

   - Access views using the `binding` object followed by the view ID from your layout.

     ```kotlin
     viewModel.setText("Hello, Data Binding!")
     ```

That's it! With Data Binding, you can easily bind data from your ViewModel to your layout. Changes in the ViewModel will automatically update the corresponding views in the layout, and user interactions with the views can be directly handled in the ViewModel.