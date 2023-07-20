### Tell all the Android application components

Android application components are the building blocks of an Android app. 
They are the different parts of an app that allow it to perform certain functions and to communicate with other apps and with the system. 

#### There are four main types of Android application components:

1. **_Activities:_** An activity represents a single screen with a user interface. It is the part of the app that the user interacts with.
2. **_Services:_** A service is a component that runs in the background to perform long-running operations or to perform work for remote processes.
3. **_Broadcast receivers:_** A broadcast receiver is a component that listens for and responds to system-wide broadcast announcements. 
4. **_Content providers:_** A content provider manages a shared set of app data that you can store in the file system, in a SQLite database, 
	on the web, or on any other persistent storage location.

#### There are also several other types of Android application components that are used for specific purposes, such as:

1. **_Fragments:_** A fragment represents a portion of a user interface. You can use fragments to build dynamic and reusable UI components that can be combined to create a complete user interface.
2. **_Views:_** A view is a basic building block for user interface components. Views can be used to build an interface from scratch or to combine existing views to create complex layouts.
3. **_Layouts:_** A layout defines the structure for a user interface in an Android app. It can be used to arrange the user interface components in a specific way.
4. **_Resources:_** Resources are external files and static content that your app can use, such as strings, images, and layouts.


### What is the project structure of an Android Application?

The project structure of an Android application typically includes the following directories and files:
1. **_app:_** This directory contains the main source code files for your app, including the build.gradle file that defines how your app is built.
2. **_res:_** This directory contains your app's resources, such as drawables, layouts, and strings.
3. **_manifests:_** This directory contains the AndroidManifest.xml file, which is a required file that defines the fundamental characteristics of your app, such as its package name, minimum required API level, and the components of the app.
4. **_gradle:_** This directory contains the files used by the Gradle build system to build your app.
5. **_build:_** This directory contains the output of the build process, including the APK file that can be installed on a device.
6. **_.gitignore:_** This file lists the files and directories that should be ignored by version control systems, such as Git.
7. **_build.gradle:_** This file defines the build configuration for your app, including the dependencies it needs and the target SDK version.
8. **_proguard-rules.pro:_** This file contains configuration for the ProGuard tool, which is used to shrink, optimize, and obfuscate your code.
9. **_settings.gradle:_** This file is used by the Gradle build system to include projects that are part of your app.
10. **_local.properties:_** This file contains the path to the Android SDK on your development machine.


### What is Context? How is it used?

	In Android, the Context class is a global information object that provides access to system services and application-level resources. It is the most important class in the Android application framework.
	The Context class allows you to:
		•	Access resources and themes
		•	Create new views
		•	Access databases
		•	Access system services
		•	Send and receive broadcasts
	The Context class is often used to:
		•	Retrieve resources, such as strings and layout files
		•	Create and access databases
		•	Start and stop services
		•	Send and receive broadcasts
	The Context class is also used to access system services, such as the window manager, activity manager, and power manager. It is also used to access application-level resources, such as the package manager and the telephony manager.
	There are two types of Context in Android:
		•	Application context: The application context is associated with the lifecycle of an app. It is the context of the current state of the app.
		•	Activity context: The activity context is associated with the lifecycle of an activity. It is the context of the current state of the activity.
	There are several ways to get the Context object in Android:
		•	Use "this" in an Activity or Service. The Activity and Service classes both extend Context, so you can use "this" to get the Context object.
		•	Use "getApplicationContext()" in any class. The Application object extends Context, so you can use "getApplicationContext()" to get the Context object for the entire app.
		•	Use "getContext()" in a View. Some classes, such as View and Service, have a method to retrieve the Context object. For example, you can use "getContext()" to get the Context object for a View.
		•	Use the "ContextWrapper" class. If you need a Context object in a class that does not have access to one, you can use the ContextWrapper class to wrap an existing Context object.


### What is AndroidManifest.xml?

	AndroidManifest.xml is a configuration file that is used to describe the characteristics and requirements of an Android app. It is a required file for all Android apps and is located at the root of the app's project directory.
	The AndroidManifest.xml file contains information about the app, such as:
		•	The app's package name
		•	The components of the app, including activities, services, broadcast receivers, and content providers
		•	The permissions that the app requires, such as access to the internet or the ability to read the phone's contact list
		•	The minimum and target versions of the Android operating system required by the app
		•	The app's hardware and software requirements, such as the required screen size and camera
	The AndroidManifest.xml file is used by the Android system to:
		•	Install the app on a device
		•	Run the app
		•	Verify that the app has the required permissions to access system resources and perform certain actions
		•	Determine which device configurations are supported by the app
	The AndroidManifest.xml file is also used by the Google Play Store to:
		•	Determine the app's compatibility with different devices
		•	Display the app's information to users, such as the app's name, icon, and description
		•	Enforce the app's usage of permissions and hardware requirements
	Overall, the AndroidManifest.xml file is an important part of the Android app development process and is used to ensure that the app functions correctly and is properly distributed and installed on devices.


### What is Application class?

	The Application class in Android is a class that represents the application itself. It is a base class for maintaining global application state and is used to initialize global variables and objects that need to be accessed by the app.
	The Application class is not the same as the Activity class. While an Activity represents a single screen with a user interface, the Application class represents the entire app and is used to manage global application-level components and resources.
	You can create a custom Application class by extending the Android Application class and overriding the "onCreate()" method. In the "onCreate()" method, you can initialize global variables and objects that need to be accessed by the app.
	The Application class is a singleton, which means that there is only one instance of the class that is created for the entire app. You can access the Application object from anywhere in the app using the "getApplication()" method.
	The Application class is useful for:
		•	Initializing global variables and objects that need to be accessed by the app
		•	Managing global application-level resources, such as database connections or network sockets
		•	Performing tasks that need to be done when the app is first launched, such as checking for updates or initializing a cache
	Overall, the Application class is an important part of the Android app development process and is used to manage global application-level components and resources.


### What is Activity and its lifecycle?

	An activity in Android represents a single screen with a user interface. It is the part of an app that the user interacts with.
	The activity lifecycle refers to the different states that an activity goes through as it is created, started, paused, stopped, and destroyed. The activity lifecycle is managed by the Android system, and it is important for developers to understand how the lifecycle works in order to create apps that are efficient and that have a smooth user experience.
	The activity lifecycle has the following states:
		1.	Created: The activity is first created and is in the "created" state. This is the state where you can perform initialization tasks, such as inflating the activity's layout and binding data to the views.
		2.	Started: When the activity becomes visible to the user, it enters the "started" state. This is the state where the activity is running and is active.
		3.	Resumed: If the activity is in the "started" state and the user starts interacting with it, the activity enters the "resumed" state. This is the state where the activity is running and is in the foreground, and the user can interact with it.
		4.	Paused: If another activity enters the foreground, the current activity enters the "paused" state. This is a transient state, and the activity is still visible to the user but is no longer in the foreground.
		5.	Stopped: If the activity is no longer visible to the user, it enters the "stopped" state. This is a transient state, and the activity is still in memory but is not visible to the user.
		6.	Destroyed: If the activity is no longer needed and is being removed from memory, it enters the "destroyed" state. This is the final state of the activity, and the activity is no longer in memory.
	The activity lifecycle is managed by the Android system, and it is important for developers to understand how the lifecycle works in order to create apps that are efficient and that have a smooth user experience.

### Activity lifecycle scenarios

	https://www.javacodegeeks.com/2020/08/android-activity-life-cycle-the-complete-guide.html
	Activity Life Cycle (on app launch)
		Activity A: onCreate()
		Activity A: onStart() 
		Activity A: onResume() 
	Launching ActivityB over ActivityA *Important*
		Activity A: onPause() 
		Activity B: onCreate
		Activity B: onStart() 
		Activity B: onResume() 
		Activity A: onStop() 
		Activity A: onSaveInstanceState() 
		Important point to note here is that ActivityA is stopped (not destroyed) after ActivityB has been created and is interactive.
	Pressing Back Button from ActivityB 
		Activity B: onPause() 
		Activity A: onRestart()
		Activity A: onStart() 
		Activity A: onResume() 
		Activity B: onStop() 
		Activity B: onDestroy()
		Here we see that at the end, ActivityB is destroyed. Notice that when launching B on A, ActivityA wasn’t destroyed but stopped, and it’s process lived on.
	Pressing Back Button from ActivityA
		Activity A: onPause() 
		Activity A: onStop() 
		Activity A: onSaveInstanceState()
	Return back application
		Activity A: onRestart()
		Activity A: onStart() 
		Activity A: onResume() 
	mobile screen off timing or Pressing home button from  and return back to application
		Activity A: onPause() 
		Activity A: onStop() 
		Activity A: onSaveInstanceState()	
	And when you come back from paused state (by pressing recents button on android), following is the sequence:
		Activity A: onRestart()
		Activity A: onStart() 
		Activity A: onResume()
	Rotating the device (activity life cycle in orientation change) *Important*
		Activity A: onPause() 
		Activity A: onStop() 
		Activity A: onSaveInstanceState() 
		Activity A: onDestroy() 
		Activity A: onCreate
		Activity A: onStart() 
		Activity A: onRestoreInstanceState()
		Activity A: onResume() 
		->You can get the key value pairs you store from onSaveInstanceState, inside onRestoreInstanceState.
	Receiving a phone call while in ActivityA
		->onPause() -Activity A
		->onStop() -Activity A
		->onSaveInstanceState() -Activity A
		->onRestart() -Activity A
		->onStart() -Activity A
		->onResume() -Activity A
	Which Lifecycle method will get called when a dialog appears in an activiy?
		https://medium.com/android-news/in-depth-analysis-of-activitys-lifecycle-676179d8a520
		Nothing Happen:
			A new, semi-transparent activity (such as a dialog) opens. As long as the activity is still partially visible but not in focus, it remains paused.

### What is the difference between onCreate() and onStart()

	onCreate() and onStart() are two methods that are part of the Android Activity lifecycle. They are called when an activity is created and started, respectively.
	onCreate() is called when the activity is first created. It is used to perform setup for the activity, such as inflating the activity's user interface and initializing class variables.
	onStart() is called after onCreate(), when the activity is becoming visible to the user. It is used to start any required animations or UI updates, as well as to begin any tasks that need to run while the activity is visible to the user.
	In general, onCreate() is used for setup that needs to be done when the activity is first created, and onStart() is used for tasks that need to be performed when the activity becomes visible to the user.


### When  onDestroy is called ?

	The activity is finishing, either because the user has requested it (by pressing the back button) or because the system is destroying the activity due to low memory. In either case, onDestroy() will be called after onStop().

### When only onDestroy is called for an activity without onPause() and onStop()?

	This happens when we call finish method to activity Example: inside your activity call this.finish();

### Why do we need to call setContentView() in onCreate() of Activity class?

	1.onResume you may call it serval times. onCreate is just one time.
	2.The onResume() method is called every time the activity is resumed, not just when it is first created. If you called setContentView() in onResume(), the layout would be set every time the activity was resumed, which could cause performance issues.


### What is onSavedInstanceState() and onRestoreInstanceState() in activity?

	onSaveInstanceState() and onRestoreInstanceState() are two methods that are part of the Android Activity lifecycle. They are used to save and restore the state of an activity, respectively.

	onSaveInstanceState() is called when the activity is about to be destroyed, and is used to save the activity's current state. This can be useful if you want to preserve the activity's state when the activity is being destroyed, for example, if the activity is being destroyed due to a configuration change (such as the device being rotated). The state can be saved in a bundle, which is a mapping from string keys to values, and passed as an argument to onSaveInstanceState().

	onRestoreInstanceState() is called after onStart() when the activity is being recreated, and is used to restore the activity's state from a previously saved bundle. This can be useful if you want to restore the activity's state when the activity is being recreated, for example, if the activity is being recreated due to a configuration change.

	In general, onSaveInstanceState() is used to save the state of an activity when the activity is being destroyed, and onRestoreInstanceState() is used to restore the saved state when the activity is being recreated.
	
		@Override
		public void onSaveInstanceState(Bundle outState) {
			super.onSaveInstanceState(outState);
			outState.putString("editTextContents", mEditText.getText().toString());
		}
	
		@Override
		public void onRestoreInstanceState(Bundle savedInstanceState) {
			super.onRestoreInstanceState(savedInstanceState);
			mEditText.setText(savedInstanceState.getString("editTextContents"));
		}


### What is Fragment and its lifecycle.

	A Fragment is a modular piece of a larger user interface or activity, which allows you to build reusable and flexible UI components. 
	Fragments represent multiple screen inside one activity.
	The Fragment lifecycle has several methods that are called in different stages of its lifecycle. These methods are:
		1.onAttach(Activity)  called only once when it is attached with activity.
		2.onCreate(Bundle)   used to initialize the fragment.
		3.onCreateView(LayoutInflater, ViewGroup, Bundle) creates and returns view hierarchy.
		4.onActivityCreated(Bundle) 	It is invoked after the completion of onCreate() method.
		5.onViewStateRestored(Bundle)  	It provides information to the fragment that all the saved state of fragment view hierarchy has been restored.
		6.onStart() makes the fragment visible.
		7.onResume() makes the fragment interactive.
		8.onPause() is called when fragment is no longer interactive.
		9.onStop() is called when fragment is no longer visible.
		10.onDestroyView() allows the fragment to clean up resources.
		11.onDestroy() allows the fragment to do final clean up of fragment state.
		12.onDetach() It is called immediately prior to the fragment no longer being associated with its activity.


### What are "launch modes"?

	https://ayusch.com/android-launch-modes-explained/
	1.Standard
		This is the default launch mode. If you don’t specify any launch mode, activity will open with standard launch mode.
		This is the simplest of all. It’ll just launch one activity over the other. Even if the activity is already present.
		Let’s say we have five Activities. A, B, C, D, and E all are defined as Standard.
		So, our stack can be like this: A-B-C-A-A-B-B.
		
	2.SingleTop
		1.If the Activity is present on the top, then a new instance is NOT created. Instead the onNewIntent() method is invoked.
		2.If the activity is NOT present on the top, then a new instance is created and added to the top. Just like the standard launch mode.
		Let’s say we have three Activities: A, B, and C. B is defined as singleTop.
		Step 1: Launch A -> A
		Step 2: Launch B -> A-B 
		Step 3: Launch C -> A-B-C 
		Step 4: Launch B -> A-B-C-B
		Step 5: Launch B -> A-B-C-B*
		
	3.SingleTask
		If an activity has SingleTask launch mode, then a new Task is created when the activity is launched the first time.
		And this activity instance is placed at the root. 
		1.If an Activity is present on top, then a new instance is NOT created. Instead the onNewIntent() method is invoked.
		2.If an instance of the Activity is already present but NOT ON TOP, it pops all the other activities and invokes the onNewIntent() method.
		
	4.SingleInstance
		In this android launch mode, just like Single Task a new Task is created and the activity placed at the root.
		But this new task will only contain that activity instance and nothing else. 
		If a new activity is launched from this, then it’s done in a separate task.
		1.If an instance of the activity exists in a different task, then onNewIntent() method is called for that activity.
		2.If a new Activity is launched from a singleInstance activity, it’s launched in a separate task
	
	Difference between singleTask and singleInstance :
		In singleTask, a new Task is launched and that new task can contain other activities as well. 
		In singleInstance, a new Task is launched and that cannot contain other activities.


### What is the difference between a Fragment and an Activity?

	An Activity represents a single screen in an Android app. It is typically used to display UI elements and handle user interactions.
	A Fragment represents a portion of a user interface or a behavior that can be attached to an Activity. A Fragment is a reusable component that can be used in different parts of an app's UI, or in multiple apps.
	One key difference between an Activity and a Fragment is that an Activity represents a single screen, while a Fragment represents a portion of a screen. This means that an Activity is typically used to display a complete UI, while a Fragment is used to display a part of a UI.
	Another difference is that an Activity has its own lifecycle and receives its own input events, while a Fragment is closely tied to the Activity it is associated with and relies on the Activity to receive input events.


### When should you use a Fragment rather than an Activity?

	There are a few situations where it might make sense to use a Fragment rather than an Activity:
	When you want to build a user interface that can be reused in multiple places in your app. Because Fragments are reusable components, you can use a single Fragment to build a user interface that can be used in multiple Activities. This can help to reduce the complexity of your code and make it easier to maintain.
	When you want to build a user interface that can be added or removed from an Activity at runtime. Because Fragments can be added or removed from an Activity at runtime, they are more flexible than Activities and can be used to build user interfaces that are more dynamic.
	When you want to build a user interface that can be used on both phones and tablets. Because Fragments can be combined to build a user interface that spans multiple screens, they are well-suited for building user interfaces that can be used on both phones and tablets.
	Overall, Fragments are a useful tool for building complex and reusable user interfaces, and they are particularly well-suited for building user interfaces that can be used on both phones and tablets. However, it's important to consider the trade-offs between Fragments and Activities when deciding which to use in your app.

### What is the difference between FragmentPagerAdapter vs FragmentStatePagerAdapter?

	FragmentPagerAdapter and FragmentStatePagerAdapter are both implementations of the PagerAdapter class in the Android support library, and they are used to populate a ViewPager with Fragments.
	There are a few key differences between FragmentPagerAdapter and FragmentStatePagerAdapter:
	1.	FragmentPagerAdapter keeps all of the Fragments in memory, while FragmentStatePagerAdapter only keeps the Fragments in memory that are currently visible to the user. This means that FragmentStatePagerAdapter is better suited for handling large numbers of Fragments, as it will use less memory than FragmentPagerAdapter.
	2.	FragmentPagerAdapter is generally easier to use and more straightforward than FragmentStatePagerAdapter, as it does not require you to implement additional methods for saving and restoring the state of the Fragments.
	3.	FragmentPagerAdapter is generally better suited for situations where the Fragments in the adapter do not change very often, while FragmentStatePagerAdapter is better suited for situations where the Fragments in the adapter are frequently updated or replaced.
	Overall, it's important to choose the right PagerAdapter for your use case. If you are dealing with a small number of Fragments that do not change very often, FragmentPagerAdapter may be the best choice. If you are dealing with a large number of Fragments that are frequently updated or replaced, FragmentStatePagerAdapter may be a better choice.

### What is the difference between add(), replace(), and addToBackStack()?

	add(), replace(), and addToBackStack() are all methods that can be used when performing Fragment transactions in Android.
	add() is used to add a Fragment to an Activity. When a Fragment is added to an Activity using add(), it is placed on top of the existing Fragments in the Activity. The Fragment is not added to the back stack, so the user cannot navigate back to the previous Fragment by pressing the back button.
	replace() is used to replace a Fragment in an Activity. When a Fragment is replaced using replace(), the new Fragment is placed on top of the existing Fragments in the Activity, and the previous Fragment is removed. The Fragment is not added to the back stack, so the user cannot navigate back to the previous Fragment by pressing the back button.
	addToBackStack() is used to add a Fragment transaction to the back stack. When a Fragment transaction is added to the back stack, the user can navigate back to the previous Fragment by pressing the back button.
	Overall, add() and replace() are used to add or replace Fragments in an Activity, while addToBackStack() is used to allow the user to navigate back to the previous Fragment by pressing the back button.

### Why is it recommended to use only the default constructor to create a Fragment?

	It is recommended to use only the default constructor to create a Fragment because the system may need to re-create the Fragment after it has been destroyed, and it will do so using the default constructor.
	If you need to pass arguments to a Fragment, you should use the setArguments() method to supply the arguments after the Fragment has been created, but before it is added to the FragmentManager. This will allow the system to properly recreate the Fragment if it needs to.
	Here is an example of how you might use the default constructor and setArguments() to pass arguments to a Fragment:
		MyFragment fragment = new MyFragment();
		Bundle args = new Bundle();
		args.putInt("key", value);
		fragment.setArguments(args);
	By using the default constructor and setArguments(), you can ensure that your Fragment is properly initialized and that it can be properly recreated if necessary.

### How would you communicate between two Fragments?

There are a few different ways you can communicate between two Fragments:
1.	Use an interface: You can define an interface in the Fragment that needs to communicate with another Fragment, and implement that interface in the host Activity. The first Fragment can then call methods on the interface to send data to the second Fragment, which will be received by the host Activity and forwarded to the second Fragment.
2.	Use a ViewModel: You can use a ViewModel to store shared data and communicate between Fragments. The ViewModel will survive configuration changes, so it is a good choice for storing data that needs to be shared between Fragments.
3.	Use a shared ViewModel: If you are using the Android Architecture Components library, you can use the sharedViewModel attribute to share a ViewModel between Fragments. This allows you to store shared data in a ViewModel and have it automatically shared between Fragments.
4.	Use arguments: You can pass data between Fragments by using the arguments Bundle. You can put data in the Bundle when you create the first Fragment, and then access the data in the second Fragment by reading the arguments from the Bundle.
Overall, there are a few different ways you can communicate between Fragments, and the best approach will depend on your specific needs.

### What is retained Fragment?

	A retained Fragment is a Fragment that is not destroyed when the host Activity is destroyed. Retained Fragments are useful for storing data that needs to be shared between Fragments or between an Activity and a Fragment.
	To create a retained Fragment, you should override the onCreate() method and set the setRetainInstance() method to true. This will prevent the Fragment from being destroyed when the host Activity is destroyed.
	Here is an example of how you might create a retained Fragment:
	public class MyRetainedFragment extends Fragment {

		@Override
		public void onCreate(@Nullable Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setRetainInstance(true);
		}
	}
	
	You can then use the retained Fragment to store data that needs to be shared between Fragments or between an Activity and a Fragment.
	It's important to note that retained Fragments are not the same as headless Fragments, which are Fragments that do not have a user interface. Headless Fragments are often used for background tasks that do not need to interact with the user.


### What is View in Android?

	In Android, a View is a class that represents a basic building block for user interface (UI) components. Views are used to create the visual structure of an app's UI, and to handle user interactions with the UI.
	Each View occupies a rectangular area on the screen and is responsible for drawing and event handling within that area. Views are subclassed to create more specific UI components, such as buttons, text fields, and lists.
	The View class is the base class for all UI components in Android. It provides several methods that you can override to customize the appearance and behavior of your View, such as onDraw() for custom drawing, onMeasure() for custom layout, and onTouchEvent() for handling touch events.
	Overall, Views are an essential part of the Android UI system and are used to create and interact with UI components in Android apps.

### What is ViewGroup in Android?

	In Android, a ViewGroup is a subclass of View that is used to contain other Views and ViewGroups. ViewGroup is the base class for layouts, which are used to define the structure of the user interface.
	ViewGroups are used to organize Views into a hierarchy, with the top-level ViewGroup being the root of the hierarchy. This hierarchy is used to define the layout of the user interface.
	There are several different types of ViewGroups available in the Android framework, including LinearLayout, RelativeLayout, and ConstraintLayout. Each type of ViewGroup has its own set of layout parameters that can be used to control the position and size of the Views it contains.
	You can define a ViewGroup in your app's layout XML file, or you can create a ViewGroup programmatically in your Java code.

### Difference between View.GONE and View.INVISIBLE?

	View.GONE This view is invisible, and it doesn't take any space for layout purposes.
	View.INVISIBLE This view is invisible, but it still takes up space for layout purposes.

### Can you a create custom view? How?

	Yes, you can create a custom View in Android by extending the View class or one of its subclasses and overriding one or more of its methods.
	To create a custom View, you will need to do the following:
		1.	Create a new class that extends View or one of its subclasses.
		2.	Override the onDraw() method to draw the View on the canvas.

### What are ViewGroups and how they are different from the Views?

	Overall, the main difference between Views and ViewGroups is that Views are the basic UI elements(EditText, Button, CheckBox etc) that are used to display content and handle user input, while ViewGroups are used to organize Views into a hierarchy and define the layout of the user interface.

### What is a Canvas?

	In Android, a Canvas is an object that is used to draw graphics onto a View. The Canvas class provides methods for drawing text, lines, bitmaps, and other graphics objects onto the View.
	A Canvas is associated with a Paint object, which is used to control the style and color of the graphics drawn onto the Canvas.
	You can draw onto a Canvas in your custom View by overriding the onDraw() method and calling the appropriate Canvas drawing methods.

### What is a SurfaceView?

	In Android, a SurfaceView is a subclass of View that is used to display graphics that are drawn onto a separate Surface. A Surface is an off-screen buffer that is used to draw graphics and control the pixels on the screen.
	SurfaceView is useful for displaying graphics that need to be updated frequently or that require a high frame rate, such as games or video playback. Because the graphics are drawn onto a separate Surface, the system can composite the SurfaceView onto the screen without blocking the UI thread.
	To draw onto a SurfaceView, you will need to create a SurfaceHolder and implement a Thread that draws onto the Surface. You can then use the Canvas and Paint classes to draw onto the Surface.

### Explain some Layout?

	1.	LinearLayout: A layout that arranges its children in a single column or row. Children can be aligned vertically or horizontally within the layout.
	2.	RelativeLayout: A layout that allows children to be positioned relative to one another or to the parent layout.
	3.	ConstraintLayout: A layout that allows children to be positioned using constraints. Children can be constrained to the parent layout or to other children within the layout.
	4.	FrameLayout: A layout that allows children to be overlaid on top of one another. Only the topmost child is visible at a given time.
	5.	GridLayout: A layout that arranges its children in a grid of rows and columns. Children can be positioned within the grid using row and column indices.
	6.	CoordinatorLayout: A layout that is used to coordinate the behavior of child views. It is often used in conjunction with FloatingActionButton to implement material design elements.

### Do you know what is the view tree?

	The view tree is an important part of the Android user interface system, and it plays a key role in organizing and rendering the user interface on the screen.

### What is the difference between ListView and RecyclerView?

	ListView and RecyclerView are both used to display a scrollable list of items in Android. However, there are several key differences between the two classes:
		1.	ListView is an older class that was introduced in Android 1.0, while RecyclerView is a newer class that was introduced in Android 5.0 (Lollipop).
		2.	ListView uses an Adapter to bind the list of items to the ListView, while RecyclerView uses a LayoutManager to position the items in the list.
		3.	RecyclerView has better performance and memory efficiency than ListView, because it uses a view recycling mechanism to reuse views as the user scrolls the list. This means that RecyclerView can handle large lists more efficiently than ListView.
		4.	RecyclerView allows for more customization and flexibility than ListView, because you can use any ViewGroup as a parent for the list items, and you can easily add dividers, headers, and footers to the list.
	Overall, while ListView is a powerful and widely used class, RecyclerView is generally a better choice for most applications due to its improved performance and customization options.

### How does RecyclerView work internally?

	RecyclerView works by using a view recycling mechanism to reuse views as the user scrolls the list. When a RecyclerView is first displayed, it creates a fixed number of views to display the visible items. As the user scrolls the list, the RecyclerView removes the views that are no longer visible and creates new views to display the newly visible items.
	Overall, RecyclerView uses a combination of view recycling and a LayoutManager and Adapter to efficiently display and bind data to a scrollable list of items.

### ScrapView?

	ScrapView is a term that is sometimes used to refer to a View that is temporarily created and used by the RecyclerView to display items as the user scrolls the list. The RecyclerView maintains a list of ScrapViews that it can use to quickly create new views as needed, rather than creating a new view from scratch every time.
	When the RecyclerView needs to create a new view, it first checks if there are any ScrapViews available to reuse. If there are, it will use one of the ScrapViews and bind the new data to it. If there are no ScrapViews available, it will create a new view using the Adapter's onCreateViewHolder() method.
	Using ScrapViews helps to improve the performance of the RecyclerView, because it reduces the number of views that need to be created and garbage collected as the user scrolls the list. However, it is important to note that ScrapView is not an official term, and the RecyclerView does not have a ScrapView class or property. Instead, it is a concept used to describe the view recycling mechanism used by the RecyclerView.

### ScrapView?

	ScrapView is the view in RecyclerView which was once visible and now are not visible on the phone's screen to the user.

### dirty views?

	The views which we take from scrap view collection and then after re-bound happens by the recyclerView adapter before it is drawn to the screen are called dirty views.

### What is the ViewHolder pattern? Why should we use it?

	ViewHolder design pattern is used to speed up rendering of your ListView or RecyclerViews - actually to make it work smoothly. 
	Your code might call findViewById() frequently during the scrolling of ListView, which can slow down performance.

### RecyclerView Optimization - Scrolling Performance Improvement

	Use the ViewHolder pattern: The ViewHolder pattern is a common pattern used in Android to improve the performance of ListViews and RecyclerViews. It is a pattern that is used to improve the performance of list-based views by reducing the number of calls to the findViewById() method, which can be expensive in terms of performance.
	Use the ConstraintLayout: The ConstraintLayout is a ViewGroup that allows you to position and size views using constraints. It is more efficient than other layouts, such as RelativeLayout and LinearLayout, because it uses a flat view hierarchy and allows views to be positioned directly on the canvas.
	Use RecyclerView.ViewHolder: The RecyclerView.ViewHolder is a static inner class that holds references to the views in each list item. By using the ViewHolder pattern, the Adapter can avoid calling the findViewById() method every time it needs to bind data to a list item, because the views are already stored in the ViewHolder.
	Use RecyclerView.ItemAnimator: The RecyclerView.ItemAnimator is a class that is responsible for animating the addition, removal, and movement of items in the RecyclerView. By default, the RecyclerView uses a DefaultItemAnimator, which animates changes to the list using simple fade-in and fade-out effects. You can create a custom ItemAnimator to customize the animation of changes to the list.
	Use RecyclerView.ItemDecoration: The RecyclerView.ItemDecoration is a class that is used to draw decorations around the items in the RecyclerView. By default, the RecyclerView does not draw any decorations around its items. You can use an ItemDecoration to add dividers, margins, or other visual elements to the list.
	By using these strategies, you can improve the scrolling performance of your RecyclerView and make it more efficient and smooth
	
	1.Set a specific width and height to ImageView in RecyclerView items
	2.Avoid using NestedView
	3.Use the setHasFixedsize method
	4.Use the image loading library for loading images
	5.Do less work in the OnBindViewHolder method
	6.Use the NotifyItem method for your RecyclerView

### What is SnapHelper?

	SnapHelper is a helper class that is used to snap any child of our RecyclerView. 
	With the help of this class, we can display the specific number of RecyclerView items on our screen, 
	and we can avoid the RecyclerView children's display inside our RecyclerView.

### What is Dialog in Android?

	A Dialog in Android is a small window that appears on top of the current Activity. 
	Dialogs are useful for displaying additional content or prompting the user for input without leaving the current Activity.

### What is Toast in Android?

	A Toast in Android is a small message that is displayed on the screen for a short period of time. It is used to provide simple feedback about an operation or to display a simple message. Toasts do not interrupt the user and do not require any action to be taken. They automatically disappear after a short period of time.
	Toasts are created and displayed in an Activity or Fragment by calling the Toast.makeText() method and then calling the show() method on the Toast object. Toasts can be customized with different text styles and gravity settings, and they can be positioned on the screen using the setGravity() and setMargin() methods.
	Toasts are useful for displaying simple feedback or messages to the user. They are an important part of the Android UI and are often used in application development.


### What the difference between Dialog and Dialog Fragment?

	Dialog: A dialog is a small window that prompts the user to make a decision or enter additional information.
	DialogFragment: A DialogFragment is a special fragment subclass that is designed for creating and hosting dialogs. 
	It allows the FragmentManager to manage the state of the dialog and automatically restore the dialog when a configuration change occurs.
	The main difference between Dialogs and DialogFragments is the way that they are displayed and the fact that DialogFragments are retained across configuration changes.

### What is an Intent ?

	An Intent is basically a message ,that message is passed between components (such as Activities, Services, Broadcast Receivers, and Content Providers).
	There are two types of intents in android:
	Implicit intent is used to invoke the system components
		Intent i = newIntent(android.content.Intent.ACTION_VIEW,Uri.parse(“http://www.amazon.com”));
		startActivity(i);
	Explicit intent is used to invoke the activity class
		Intent intent = newIntent (this, SecondActivity.class);
		startActivity(intent);

### Pass data between activities-in-android-application

	There are several ways to pass data between Activitys in an Android application:
		1.	Use Intent extras: You can pass data between Activitys using Intent extras. To pass data using Intent extras, you can use the putExtra() method of the Intent to add data to the Intent, and then start the Activity using the Intent. To retrieve the data in the receiving Activity, you can use the getIntent() method to get the Intent that started the Activity, and then use the getXXXExtra() methods to retrieve the data from the Intent.
		2.	Use a shared view model: You can use a shared ViewModel to pass data between Activitys. A ViewModel is a class that is responsible for preparing and managing the data for an Activity or Fragment. To use a shared ViewModel, you can create a ViewModel class that extends the AndroidViewModel class, and then use the ViewModelProvider class to create a shared instance of the ViewModel. You can then use the ViewModel to store and retrieve data that needs to be shared between Activitys.
		3.	Use a shared repository: You can use a shared repository to pass data between Activitys. A repository is a class that is responsible for managing data sources and providing a clean API for data access. To use a shared repository, you can create a repository class and use it to store and retrieve data that needs to be shared between Activitys.
		4.	Use a global singleton: You can use a global singleton to pass data between Activitys. A singleton is a class that can only have one instance at any given time. To use a singleton to pass data between Activitys, you can create a singleton class and use it to store and retrieve data that needs to be shared between Activitys.
	By using these strategies, you can pass data between Activitys in your Android application.

	In your current Activity, create a new Intent:
		String value="Hello world";
		Intent i = new Intent(CurrentActivity.this, NewActivity.class);    
		i.putExtra("key",value);
		startActivity(i);
	Then in the new Activity, retrieve those values:
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			String value = extras.getString("key");
			//The key argument here must match that used in the other activity
		}

### how-to-manage-startactivityforresult-on-android

	The startActivityForResult() method is used to start a new Activity and receive a result from the Activity when it finishes. To manage startActivityForResult() on Android, you can follow these steps:
		1.	Call startActivityForResult(): To start an Activity for a result, you can call the startActivityForResult() method and pass in an Intent that describes the Activity to be started and a request code. The request code is an integer value that is used to identify the request when the result is returned.
		2.	Implement onActivityResult(): To receive the result from the Activity, you need to implement the onActivityResult() method in the Activity or Fragment that called startActivityForResult(). The onActivityResult() method is called when the started Activity finishes, and it receives the request code, result code, and data as arguments.
		3.	Check the request code and result code: In the onActivityResult() method, you can check the request code and result code to determine the result of the Activity. The request code is used to identify the request, and the result code is an integer value that indicates the result of the Activity.
		4.	Extract the data from the intent: If the result code is RESULT_OK, you can extract the data from the Intent using the getXXXExtra() methods. The data is stored in the Intent as extras, and you can retrieve it using the appropriate getXXXExtra() method, depending on the type of data.
	By following these steps, you can manage startActivityForResult() on Android and receive a result from a started Activity.
	
	https://stackoverflow.com/questions/10407159/how-to-manage-startactivityforresult-on-android
	From your FirstActivity, call the SecondActivity using the startActivityForResult() method.
		For example:
			int LAUNCH_SECOND_ACTIVITY = 1
			Intent i = new Intent(this, SecondActivity.class);
			startActivityForResult(i, LAUNCH_SECOND_ACTIVITY);
	In your SecondActivity, set the data which you want to return back to FirstActivity. If you don't want to return back, don't set any.
		For example: In SecondActivity if you want to send back data:
			Intent returnIntent = new Intent();
			returnIntent.putExtra("result",result);
			setResult(Activity.RESULT_OK,returnIntent);
			finish();
	If you don't want to return data:
			Intent returnIntent = new Intent();
			setResult(Activity.RESULT_CANCELED, returnIntent);
			finish();
	Now in your FirstActivity class, write the following code for the onActivityResult() method.
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		if (requestCode == LAUNCH_SECOND_ACTIVITY) {
			if(resultCode == Activity.RESULT_OK){
				String result=data.getStringExtra("result");
			}
			if (resultCode == Activity.RESULT_CANCELED) {
				// Write your code if there's no result
			}
		}
	} 


### What is a BroadcastReceiver?

	A Broadcast Receiver in Android is a component that allows an app to respond to system-wide broadcasts, which are messages sent by the operating system or other apps to notify of certain events or changes in the environment. These events can include things like incoming phone calls, low battery warnings, and changes in network connectivity.

	A Broadcast Receiver is a class that extends the BroadcastReceiver class and implements the onReceive() method. The onReceive() method is called when the Broadcast Receiver receives a broadcast, and it is passed an Intent that contains the broadcast data.

	To use a Broadcast Receiver, you need to register it in the app's manifest file, which makes it known to the system and allows it to receive broadcast intents. Additionally, you can register a Broadcast Receiver dynamically in your app code, in which case it will only be active for the duration of the onReceive() method call.

	Here is an example of how to create a Broadcast Receiver and register it in the app's manifest file:

	Copy code
		public class MyBroadcastReceiver extends BroadcastReceiver {
			@Override
			public void onReceive(Context context, Intent intent) {
				// perform action here
				if (intent.getAction().equals(Intent.ACTION_BATTERY_LOW)) {
					Toast.makeText(context, "Battery is low!", Toast.LENGTH_LONG).show();
				}
			}
		}
	And in the app's AndroidManifest.xml file:

	Copy code
		<receiver android:name=".MyBroadcastReceiver">
			<intent-filter>
				<action android:name="android.intent.action.BATTERY_LOW" />
			</intent-filter>
		</receiver>
	In this example, the MyBroadcastReceiver class is extending the BroadcastReceiver class and overriding the onReceive() method, which will listen to intent action "android.intent.action.BATTERY_LOW" and it will show a toast message when the battery is low.

	Broadcast Receivers are useful for responding to system-wide events, such as the device booting up, changes in network connectivity, or low battery warnings. They can also be used to receive broadcasts from other apps and perform actions based on the received data. It's worth noting that Broadcast Receivers are not suitable for long-running tasks or background services. Also, Android 8.0 Oreo introduced background execution limits which will affect the broadcast


### What is a LocalBroadcastManager?

	LocalBroadcastManager is a utility class in Android that allows for the sending and receiving of local broadcasts, which are broadcasts that are limited to the app process in which they were sent. This means that the broadcast is only sent to BroadcastReceivers that are registered within the same app, and it will not be sent to BroadcastReceivers in other apps or to system components.

	LocalBroadcastManager can be used in place of the standard Context.sendBroadcast() method to send and Context.registerReceiver() method to register for local broadcasts.

	The main advantage of using LocalBroadcastManager is that it provides a more secure and efficient way to communicate between different components within your app, because the broadcasts are not sent outside the app and thus cannot be intercepted by other apps or malicious actors.

	Here's an example of how you might use LocalBroadcastManager to send a local broadcast:

	Copy code
	LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);
	Intent intent = new Intent("my-custom-event");
	localBroadcastManager.sendBroadcast(intent);
	And, an example of how you might register a BroadcastReceiver to receive a local broadcast:

	Copy code
	LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);
	localBroadcastManager.registerReceiver(myReceiver, new IntentFilter("my-custom-event"));
	It's worth noting that, LocalBroadcastManager is not suitable for cross-process communication, it's just suitable for communication within the process.


### What is the function of an IntentFilter?

	An IntentFilter is an object used in Android development to register an activity, service, or broadcast receiver for certain actions. It is used to specify the types of intents that an activity, service, or broadcast receiver can respond to. An IntentFilter can be used to specify a combination of actions, categories, and data that an Intent should match.

	Here is an example of how an IntentFilter is used to register an activity in an Android app:

	Copy code
	<activity android:name=".PhotoViewerActivity">
		<intent-filter>
			<action android:name="android.intent.action.VIEW" />
			<category android:name="android.intent.category.DEFAULT" />
			<data android:mimeType="image/*" />
		</intent-filter>
	</activity>
	In this example, the activity named "PhotoViewerActivity" is being registered with an IntentFilter. The IntentFilter specifies that the activity can handle Intents with the action "android.intent.action.VIEW", and that the data type of the Intent should be "image/*". It also specifies that the activity should be placed in the default category.

	When an Intent is sent with the action "android.intent.action.VIEW" and the data type "image/*", Android will match this Intent to the IntentFilter registered by the PhotoViewerActivity and launch that activity to display the selected image.

	Here's an example of how an IntentFilter is used to register a broadcast receiver:

	Copy code
	<receiver android:name=".BatteryReceiver">
		<intent-filter>
			<action android:name="android.intent.action.BATTERY_LOW" />
		</intent-filter>
	</receiver>
	In this example, the broadcast receiver named "BatteryReceiver" is being registered with an IntentFilter. The IntentFilter specifies that the broadcast receiver can handle Intents with the action "android.intent.action.BATTERY_LOW". When the device battery is low the system sends broadcast Intent with the action "android.intent.action.BATTERY_LOW" to all the apps which have registered with that action, thus the broadcast receiver of the app will receive it and can take necessary action.

	In summary, an IntentFilter is a powerful tool that allows Android apps to be more modular and flexible by specifying the types of Intents that an activity, service, or broadcast receiver can handle. It is used to register an activity, service, or broadcast receiver for certain actions and it also allows for specifying the types of intents that an activity, service, or broadcast receiver can respond to.


### What is a Sticky Intent?

	Intent - is a message passing mechanism between components of Android, except for Content Provider. You can use Intent to start any component.

	Sticky Intent - Sticks with Android, for future broadcast listeners. For example if BATTERY_LOW event occurs then that Intent will stick with Android so that any future requests for BATTERY_LOW, will return the Intent.

	Pending Intent - If you want some one to perform any Intent operation at future point of time on behalf of you, then we will use Pending Intent.

### What are the different types of Broadcasts receivers?

	Local broadcasts: These broadcasts are sent within the app and are not transmitted to other apps.
	System broadcasts: These broadcasts are sent by the Android system and are broadcasted to all registered receivers. Examples of system broadcasts include: battery low, screen on/off, and incoming call.
	
	Types of Broadcasts
	There are two types of broadcasts received by receivers and they are:
		1. Normal Broadcasts:
			These are asynchronous broadcasts.
			Receivers of this type of broadcasts may run in any order, sometimes altogether.
			This is efficient.
			Receivers cannot use the result.
			They cannot abort the included APIs.
			These broadcasts are sent with Context.sendBroadcas

		2. Ordered Broadcasts
			These are synchronous broadcasts.
			One broadcast is delivered to one receiver at a time.
			Receivers can use the result. In fact as each receiver executes, result is passed to next receiver.
			Receiver can abort the broadcast and hence no broadcast is received by other receivers.
			The order of receivers is managed and controlled by the attribute android:priority in corresponding intent-filter.
			If receivers will have same priority then they may run in any order.


### What is service ?

An Android service is a component that is designed to do some work without affecting the user interface. It is designed to run indefinitely.
Services are used to perform long-running operations, such as playing music or downloading data.
Services can also be used for interprocess communication (IPC) between Android applications.

### Service vs IntentService?

In Android, both Service and IntentService are used for background tasks, but there are some differences between them:
Purpose: A Service runs in the main thread of an application and can be used for long-running operations that don't need to return a result to the caller.
An IntentService, on the other hand, is specifically designed to handle asynchronous requests (expressed as "intents") on a separate worker thread.
Life cycle: A Service runs indefinitely until it is stopped, while an IntentService automatically stops itself after all start requests have been handled.
Background threads: A Service runs on the main thread, so it can block the UI if not properly managed. An IntentService automatically creates a worker thread to handle background tasks.
Result handling: A Service can't return a result to the caller, while an IntentService can send a result back to the caller using a broadcast intent.
Stopping: A Service can be stopped manually using the stopSelf() or stopService() method, while an IntentService stops itself automatically once all start requests have been handled.

### What is a JobScheduler?

In Android, JobScheduler is a system service that schedules tasks to run in the background, outside of the main application process. It is designed to run tasks at specific times or in response to certain events, such as network connectivity changes or the device entering a low-power state.
Advantages of the job scheduler API
Tasks that should be done once the device is connect to a power supply.
Tasks that require network access or a Wi-Fi connection.
Task that are not critical or user facing.
Tasks that should be running on a regular basis as batch where the timing is not critical.


### How can two distinct Android apps interact?

Two distinct Android apps can interact with each other through several methods:
1.Intents: An Intent is a message that is sent from one app to another, asking the recipient app to perform an action. Intents can be used to start an activity, deliver data, or execute a background service in another app.

		2.Content Providers: A Content Provider is a component that manages a shared set of data and provides it to other apps through a standardized interface. Apps can use Content Providers to share data, such as contacts or media files, between each other.

		3.Broadcast Receivers: Broadcast Receivers are components that listen for broadcast Intents and respond to them. Apps can use broadcast Intents to communicate with each other and share data.

		4.Binder IPC (Inter-Process Communication): Binder IPC is a mechanism that enables apps to communicate with each other through a system service running in the Android system. Binder IPC provides a low-level, direct communication channel between apps and is used by many Android system services, such as the Activity Manager and Content Providers.

		5.AIDL (Android Interface Definition Language): AIDL is a language that can be used to define remote interfaces for inter-process communication between Android apps. AIDL enables apps to communicate with each other and share complex data structures, even across process boundaries.


### Is it possible to run an Android app in multiple processes? How?

Yes, it is possible to run an Android app in multiple processes. This can be accomplished by specifying the android:process attribute in the AndroidManifest.xml file for the component you want to run in a separate process.

	For example, if you want a service to run in a separate process, you can specify the process attribute in the <service> tag as follows:
		Copy code
		<service android:name=".MyService"
				 android:process=":process_name" />
				 
	In this example, the service will run in a separate process with the name "process_name". You can also specify the process attribute for activities, broadcast receivers, and content providers in a similar manner.

	It's important to note that running components in separate processes can impact performance and battery life, as it increases the overhead of inter-process communication. Additionally, it makes the application more complex and harder to manage, as the components in different processes may have different lifecycles and context.

	Therefore, it's usually recommended to only use multiple processes when it's necessary for security or functional requirements.


### What can you use for background processing in Android?

In Android, there are several options for background processing:

		1.Services: Services are components that run in the background to perform long-running tasks or background work. They can be started by another component or run independently.

		2.IntentServices: IntentServices are a type of service that handle each incoming Intent in a separate worker thread. They are well suited for performing background tasks that do not require interaction with the main application process.

		3.AsyncTask: AsyncTask is a helper class that enables you to perform background tasks and publish results on the UI thread without having to manipulate threads and/or handlers.

		4.Threads: Threads are separate paths of execution within an application. You can use threads to perform background tasks without affecting the UI.

		5.Handlers: Handlers are components that allow you to schedule messages and runnables to be executed on a thread's message queue. They are often used in conjunction with threads to perform background work.

		6.JobScheduler: JobScheduler is a system service that schedules tasks to run in the background, outside of the main application process. It provides a convenient way for developers to schedule tasks that are guaranteed to run even if the device is restarted or the application is not running.

		7.WorkManager: WorkManager is a library for Android that provides an API for scheduling deferrable, asynchronous tasks that are guaranteed to execute eventually. WorkManager is suitable for tasks that are guaranteed to run even if the application is restarted.

	The choice of the method for background processing depends on the specific requirements of the task, such as the desired level of control over the execution, the need for a UI thread, the desired battery usage, and the desired compatibility with older versions of Android.


### What can you use for background processing in kotlin?

In Kotlin, there are several options for background processing:

		1.Coroutines: Coroutines are a lightweight concurrency construct in Kotlin that allow you to write asynchronous, non-blocking code in a sequential, easy-to-read style. They can be used for background processing and perform long-running tasks.

		2.Threads: Threads are separate paths of execution within an application. You can use threads to perform background tasks in Kotlin, just as you would in Java.

		3.Executors: Executors provide a simple way to manage and run background tasks. They allow you to execute tasks in the background using a pool of threads.

		4.AsyncTask: You can use AsyncTask to perform background tasks in Kotlin, just as you would in Java. However, AsyncTask can be less convenient to use than coroutines or other solutions, due to its limitations and the need for thread handling.

	The choice of the method for background processing depends on the specific requirements of the task, such as the desired level of control over the execution, the need for a UI thread, and the desired compatibility with other Java libraries and components.

	In general, coroutines are the preferred solution for background processing in Kotlin, due to their conciseness, flexibility, and performance. However, you may also consider using threads, executors, or AsyncTask, depending on the specific requirements of your task and your development environment.


### What is a ContentProvider and what is it typically used for?

	ContentProvider is mainly used for access data from one application to another application.
	For example by using ContentProvider we can get phone contacts,call log from phone to our own application in android.
	we can also access data which are stored in (sqlite)databases.
	
	A ContentProvider is a component in Android that provides access to a structured set of data. It acts as an intermediary between an application and the data store, enabling data sharing and management between multiple applications.

	ContentProviders are typically used for:

		1.Sharing data: ContentProviders allow applications to share data with each other by providing a standardized interface for accessing and modifying the data.

		2.Centralizing data: ContentProviders allow you to centralize data storage and management in a single location, making it easier to maintain and secure the data.

		3.Protecting data: ContentProviders offer a secure way to access and modify data by controlling access to the data through permissions.

		4.Data synchronization: ContentProviders can be used to keep data synchronized between multiple applications, or between an application and a server.

		5.Querying data: ContentProviders allow you to query data using a standardized SQL-based interface, making it easier to retrieve the data you need.

	In summary, ContentProviders are used in Android to provide a centralized, secure, and flexible way to access and manage structured data. They are an essential component for applications that require data sharing and synchronization, or that need to centralize data storage and management.

### Why should you avoid to run non-ui code on the main thread?

	Running non-UI code on the main thread, also known as the UI thread, can lead to several performance issues in Android:

		1.Slow performance: Non-UI code can block the UI thread, causing the user interface to become unresponsive. This can lead to slow performance, janky animations, and an overall poor user experience.

		2.ANR (Application Not Responding) Errors: When the main thread is blocked for too long, the Android system may kill the app and display an "Application Not Responding" (ANR) error message.

		3.Limited Concurrency: The main thread is responsible for handling all UI-related events and updates, so if it is blocked by a long-running task, it cannot perform other tasks in parallel, leading to limited concurrency.

		4.Reduced Battery Life: Running long-running tasks on the main thread can reduce battery life, as the processor must continuously work to keep the app running.

	To avoid these issues, it's recommended to run non-UI code in a separate thread, such as using a worker thread, a Service, an IntentService, a Coroutine, an AsyncTask, or a Handler, depending on the specific requirements of your task and your development environment. This way, the main thread can be free to handle UI-related events and updates, ensuring a smooth and responsive user experience.

### What is ANR? How can the ANR be prevented?

ANR stands for "Application Not Responding." It is an error message displayed by the Android system when an app takes too long to respond to user input or system events.

	ANRs occur when the main thread of an app is blocked for too long by a long-running task, causing the app to become unresponsive. The Android system will kill the app and display the ANR error message if it detects that the main thread has been blocked for a certain period of time (usually 5 seconds).

	To prevent ANRs, you should avoid running long-running tasks, such as network requests or database operations, on the main thread. Instead, you should run these tasks in a separate thread, such as using a worker thread, a Service, an IntentService, a Coroutine, an AsyncTask, or a Handler, depending on the specific requirements of your task and your development environment. This way, the main thread remains free to handle user input and system events, ensuring a responsive user experience.

	In addition, it's also important to optimize your code and to avoid blocking the main thread with excessive computation, I/O operations, or other intensive tasks. You can use tools like Traceview and Systrace to diagnose performance issues and identify areas of your code that can be optimized.

### What is an AsyncTask(Deprecated in API level 30) ?

AsyncTask is a class in the Android framework that allows you to run tasks in the background and update the UI on the main thread. It provides a convenient way to perform background tasks and update the UI without having to manage the lifecycle of separate threads yourself.

	*AsyncTask is designed for short, quick background tasks that do not require a long-running process. It provides an easy way to run code in the background and update the UI on the main thread.

	*AsyncTask is deprecated in API level 30 and higher, meaning that it is no longer recommended for use in new projects. Instead, other options such as worker threads, Services, IntentServices, Coroutines, or Handlers, should be used for background processing in Android.

	AsyncTask should only be used in older projects that require backward compatibility with older versions of Android, or for very simple background tasks that do not require a more advanced approach to background processing.

### What are the problems in AsyncTask?

AsyncTask is a convenient class in the Android framework for running tasks in the background, but it also has several limitations and problems that need to be considered:

	Context Leaks: AsyncTask has a reference to the Activity context, which can cause a memory leak if the Activity is destroyed before the AsyncTask is completed.

	Concurrent Execution: AsyncTask only allows one task to be executed at a time, making it difficult to manage multiple tasks at once.

	Configuration Changes: AsyncTask does not handle configuration changes, such as screen rotations, which can result in unexpected behavior.

	Poor Error Handling: AsyncTask does not provide an effective way to handle errors and exceptions that may occur during background processing.

	Deprecated in API level 30: AsyncTask is deprecated in API level 30 and higher, which means it is no longer recommended for use in new projects. Instead, it is recommended to use worker threads, Services, IntentServices, Coroutines, or Handlers for background processing.

	For these reasons, it is often recommended to use other methods, such as worker threads, Services, IntentServices, Coroutines, or Handlers, for background processing in Android, rather than relying solely on AsyncTask.


### When would you use java thread instead of an AsyncTask?

	You may use a Java Thread instead of an AsyncTask in the following scenarios:

	1.Long-running tasks: If you have a task that will take a long time to complete, it is recommended to use a Java Thread instead of an AsyncTask, as AsyncTask is designed for short, quick background tasks.

	2.Concurrent Execution: If you need to execute multiple tasks concurrently, you should use a Java Thread instead of an AsyncTask, as AsyncTask only allows one task to be executed at a time.

	3.Handling configuration changes: If you need to handle configuration changes, such as screen rotations, you should use a Java Thread instead of an AsyncTask, as AsyncTask does not handle these changes.

	4.Error handling: If you need to handle errors and exceptions that may occur during background processing, you should use a Java Thread instead of an AsyncTask, as AsyncTask provides limited error handling capabilities.

	5.Deprecation in API level 30: If you are developing an app that targets API level 30 or higher, it is recommended to use a Java Thread instead of an AsyncTask, as AsyncTask is deprecated in API level 30 and higher.

	In general, if you need more control and flexibility over your background processing, or if you need to handle more complex scenarios, you should use a Java Thread instead of an AsyncTask.

### What is a Loader? (Deprecated)

	A Loader is a component in the Android framework that allows you to load data asynchronously in the background, so that your app can display the results in the UI without being blocked by the loading process. Loaders were introduced in Android 3.0 (API level 11) as a way to simplify background data loading and provide a mechanism for managing the data load process across the Activity or Fragment lifecycle.
	
	The Loader class provides a simple and convenient way to load data from a ContentProvider or other data source, and it automatically takes care of monitoring the data source for changes and re-loading the data as necessary. Loaders also handle configuration changes, such as screen rotations, so that the data load process is not interrupted or lost.

	However, Loaders have been deprecated in API level 30 and higher, and it is recommended to use other methods, such as Coroutines or LiveData, for background data loading in modern Android apps. These newer components provide more robust and flexible ways to manage and update data in response to changes in the underlying data source.

### What is the relationship between the life cycle of an AsyncTask and an Activity? What problems can this result in? How can these problems be avoided?


	An AsyncTask is not tied to the life cycle of the Activity that contains it. 
	So, for example, if you start an AsyncTask inside an Activity and the user rotates the device, 
	the Activity will be destroyed (and a new Activity instance will be created) but the AsyncTask will not die but instead goes on living until it complete.
	
	For these reasons, using AsyncTasks for long-running background tasks is generally a bad idea . 
	Rather, for long-running background tasks, a different mechanism (such as a service) should be employed.

### Explain Looper, Handler and HandlerThread

	Looper, Handler, and HandlerThread are related Android classes that provide a way for executing code in the background on a separate thread from the main thread.

		1.Looper: Looper is used to run a message loop for a thread. It's responsible for processing messages in a queue and dispatching them to the appropriate handlers. A Looper object can only be associated with a single thread.

		2.Handler: A Handler allows you to send and process Message and Runnable objects associated with a thread's MessageQueue. You can use a Handler to post tasks to be executed on the main thread, or to post tasks to be executed on another thread through a HandlerThread.

		3.HandlerThread: A HandlerThread is a subclass of Thread that is specifically designed to be used with a Handler. It's used to create a background thread that can run tasks concurrently with the main thread. The main advantage of using a HandlerThread is that it provides a Looper, making it easier to post tasks to the thread.

	By using Looper, Handler, and HandlerThread, you can run code in the background and communicate with the main thread in a safe and efficient manner, without the risk of ANR (Application Not Responding) errors.


### How does the threading work in Android?

	When an application is launched in Android, it creates the first thread of execution, known as the “main” thread. 
	The main thread is responsible for dispatching events to the appropriate user interface widgets as well as communicating with components from the Android UI toolkit.


### Android Memory Leak and Garbage Collection

	A memory leak is basically a failure of releasing unused objects from the memory.
	Android garbage collection is an automatic process which removes unused objects from memory.

### how to avoid memory leak

	Do not create unnecessary objects.
	Avoid String Concatenation.
	Use String Builder.
	Do not store a massive amount of data in the session.

### How to persist data in an Android app?

	There are several ways to persist data in an Android app:

		1.Shared Preferences: Store simple key-value pairs of primitive data types in a private file on the device.

		2.Internal Storage: Store private data on the device file system.

		3.External Storage: Store public data on the shared external file system.

		4.SQLite Database: Store structured data in a private database.

		5.Room: A library that provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite.

		6.Network: Store data on a remote server through a network connection, such as RESTful API.


### What is ORM? How does it work?

	ORM stands for Object-Relational Mapping. It is a programming technique that maps objects in an application to data stored in a relational database management system. ORM provides an abstract layer between the application and the database, allowing developers to interact with the database through objects and classes rather than writing raw SQL queries.

	ORM works by taking data from the database and converting it into objects in the application, and vice versa. When an application wants to persist an object to the database, the ORM layer converts the object into SQL statements, which are then executed against the database to persist the data. When the application needs to retrieve data from the database, the ORM layer converts the results of SQL queries into objects in the application. This way, the application can interact with the database using a high-level, object-oriented API, while the ORM layer takes care of the low-level details of converting data between the database and the application.

### How would you preserve Activity state during a screen rotation?

	To preserve the state of an Activity during a screen rotation, you can use the following methods:

		1.Use the onSaveInstanceState method: This method is called before an Activity is destroyed, so you can use it to save important data in a Bundle object. When the Activity is recreated after a screen rotation, the saved data can be restored from the Bundle using the onCreate or onRestoreInstanceState method.

		2.Use a ViewModel: The ViewModel class is part of the Android Architecture Components and provides a way to store data that needs to persist across Activity or Fragment recreations. A ViewModel is scoped to the lifecycle of an Activity, so it can survive a screen rotation and be reused for the recreated Activity.

		3.Use saved instance state bundle: The saved instance state bundle is a bundle that you can use to store any data you want to preserve between activity recreations. This bundle is passed to the onCreate method of the recreated activity so that you can use it to restore your saved data.

	Note: It's also important to keep in mind that preserving the state of an Activity during a screen rotation can consume additional resources, so it's important to only store the data that's necessary for the correct functioning of the Activity.


### What are different ways to store data in your Android app?

	In an Android app, data can be stored in several ways:

	Shared Preferences: Store small amounts of key-value pairs of primitive data types.

		1.Internal Storage: Store data on the device's internal storage.

		2.External Storage: Store data on external storage (SD card) if it's available.

		3.SQLite Database: Store structured data using a private database.

		4.Room Persistence Library: A library built on top of SQLite that provides an abstract layer for interacting with a database.

		5.Cloud Storage: Store data on cloud servers, such as Firebase Realtime Database or Firebase Storage.

		6.Network Connection: Fetch data from a remote server over a network connection.


### Explain Scoped Storage in Android?

	Scoped Storage is a storage feature introduced in Android 10 (API level 29) that changes the way apps access external storage on a device. The main goal of Scoped Storage is to enhance privacy and security for users by limiting access to external storage by apps.

	With Scoped Storage, each app has its own private directory on external storage, and other apps cannot access these directories. In addition, apps can access only specific directories that are scoped to the app's use case, such as music, photos, or downloads.

	Apps can request access to specific files or directories using the Storage Access Framework (SAF), which displays a system dialog to the user asking for permission to access the specific files. Once granted, the app can access the requested files.

	Scoped Storage also introduces a new file-selection UI, making it easier for users to pick files and share them with apps.

	Overall, Scoped Storage is aimed at improving the privacy and security of user data while still allowing apps to access external storage.


### What is commit() and apply() in SharedPreferences?

	commit() and apply() are two methods in Android's SharedPreferences class that allow you to save data in the form of key-value pairs. Both methods are used to persist changes made to the shared preferences.

	The main difference between the two methods is the way they save the data:

		1.commit(): This method writes the data synchronously to the shared preferences file, blocking the calling thread until the write operation is complete. commit() returns a boolean value indicating whether the write operation was successful.

		2.apply(): This method writes the data asynchronously to the shared preferences file, without blocking the calling thread. apply() does not return a value, so there is no way to know whether the write operation was successful or not.

	In general, apply() is recommended for most use cases because it is faster than commit(), and it does not block the calling thread. However, if you need to ensure that the data is written to the shared preferences before moving on to other tasks, you should use commit().


### What is a SpannableString?

	A SpannableString has immutable text, but its span information is mutable. 
	Use a SpannableString when your text doesn't need to be changed but the styling does. 
	Spans are ranges over the text that include styling information like color, heighliting, italics, links, etc


### How to implement Dark mode in any application?

	Make sure to change the default theme from Theme.AppCompat.Light.DarkActionBar to Theme.AppCompat.DayNight.DarkActionBar in the styles.xml file 
	and then do AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES) to switch to the night mode.

### How to generate dynamic colors based in image?

	To generate dynamic colors based on an image in Android, you can follow these steps:
		1.Load the image into a Bitmap object.
		2.Use the Palette library to extract the dominant colors from the Bitmap.
		3.Choose the color that you want to use for your dynamic color.
		4.Apply the chosen color to your UI elements.
	Here's some code to get you started:
		Bitmap myBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.my_image);
		Palette palette = Palette.from(myBitmap).generate();
		int color = palette.getDominantColor(ContextCompat.getColor(this, R.color.default_color));
		// Use color as the background color for your UI element
		myView.setBackgroundColor(color);
		
	Note: In the example code, R.drawable.my_image should be replaced with the image you want to use, and myView should be replaced with the name of your UI element.


### Explain about Density Independence Pixel

	Density-independent pixels, written as dp (pronounced "dips"), are flexible units that scale to have uniform dimensions on any screen.
	They provide a flexible way to accommodate a design across platforms. 
	Material UIs use density-independent pixels to display elements consistently on screens with different densities.


### What is the onTrimMemory() method?

	onTrimMemory(): Called when the operating system has determined that it is a good time for a process to trim unneeded memory from its process.
	This will happen for example when it goes in the background and there is not enough memory to keep as many background processes running as desired.


### What causes OutOfMemoryError?

	An OutOfMemoryError occurs when a Java program attempts to allocate more memory than is available in the heap, causing the JVM to crash. This can happen if a program creates too many objects, the objects are too large, or if the memory leak exists in the program. 
	It can also occur if the maximum heap size is set too low.

### How do you find memory leaks in Android applications?

	To find memory leaks in Android applications, you can use tools like the Android Profiler in Android Studio, MAT (Memory Analyzer Tool) or LeakCanary.
	These tools allow you to monitor memory usage, track memory allocations, and identify potential memory leaks by analyzing the heap dump.
	Additionally, you can also use logcat to check for memory warnings and use methods such as the Traceview tool to analyze the performance of your app. 
	By identifying the source of the leak, you can fix the code that is causing the leak and improve the overall performance of your app.



### How do you overcome memory leaks?

	Memory leaks can be overcome by following best practices and techniques such as:

		Avoiding memory leaks by using weak references, static references, and static inner classes.

		Releasing resources when they are no longer needed, such as closing database connections, unregistering broadcast receivers, and removing callbacks.

		Using efficient data structures, such as recycling views in ListViews, instead of creating new objects.

		Avoiding memory-intensive operations on the main thread and using background threads instead.

		Avoiding memory leaks caused by retaining anonymous inner classes by making them static or using a weak reference.

		Avoiding memory leaks caused by retain cycles by using a weak reference for one of the references.

		Monitoring memory usage and heap dumps to identify the source of the leak and fix it.

	By following these best practices, you can minimize the risk of memory leaks in your app and ensure that it performs well and runs smoothly.

### How to reduce battery usage in an android application?

	There are several ways to reduce battery usage in an Android application:

		1.Optimize your code for efficiency and reduce resource usage.
		2.Minimize the use of background services, or only use them when necessary.
		3.Use wake locks judiciously to keep the device awake only when necessary.
		4.Avoid using high-frequency location updates and use lower-power alternatives like Geofencing API.
		5.Minimize network usage by using efficient network calls and caching data when appropriate.
		6.Use Google Play's Battery Saver feature to automatically reduce battery usage when the device's battery is low.
		7.Use the JobScheduler API to schedule tasks to run in the background.
		8.Unregister receivers and listeners when they're no longer needed.
	
	These are some of the ways to reduce battery usage in an Android application. Implementing these suggestions will help you create more energy-efficient applications that conserve battery life for users.

### What is Doze? What about App Standby?

	Doze and App Standby are two battery optimization features in Android that help to conserve battery life by reducing resource usage when the device is idle.

		1.Doze: Doze is a battery optimization feature in Android that limits the background activity of apps when the device is not being used. When the device enters Doze mode, network access and background processing are limited, and alarms and syncing are deferred. This results in a significant reduction in battery usage.

		2.App Standby: App Standby is a battery optimization feature in Android that restricts the background activity of rarely used apps. When the system determines that an app is not being used, it will place the app in App Standby mode, which restricts its network access and background processing. This helps to conserve battery life.

	Both Doze and App Standby help to conserve battery life, but they do so in different ways. Doze is focused on reducing battery usage when the device is idle, while App Standby is focused on restricting the background activity of rarely used apps.


### How do you support different types of resolutions?

	res/layout/my_layout.xml             // layout for normal screen size ("default")
	res/layout-small/my_layout.xml       // layout for small screen size
	res/layout-large/my_layout.xml       // layout for large screen size
	res/layout-xlarge/my_layout.xml      // layout for extra large screen size
	res/layout-xlarge-land/my_layout.xml // layout for extra large in landscape orientation

	res/drawable-mdpi/my_icon.png        // bitmap for medium density
	res/drawable-hdpi/my_icon.png        // bitmap for high density
	res/drawable-xhdpi/my_icon.png       // bitmap for extra high density

### What are the different protection levels in permission?

In Android, there are several protection levels that can be assigned to permissions:
1.Normal: These permissions pose minimal risk to the user's privacy or the device's operation.
Normal Permissions:INTERNET,SET_ALARM,SET_WALLPAPER,BLUETOOTH,ACCESS_NETWORK_STATE,ACCESS_WIFI_STATE

		2.Dangerous: These permissions pose a potential risk to the user's privacy or the device's operation, and therefore require the user to grant the permission explicitly.
			Dangerous Permissions:READ_CALENDAR,WRITE_CALENDAR,CAMERA,ACCESS_FINE_LOCATION,ACCESS_COARSE_LOCATION,SEND_SMS,RECEIVE_SMS
		3.Signature: These permissions are automatically granted to apps signed with the same certificate as the app requesting the permission.
			Signature Permissions:BIND_AUTOFILL_SERVICE,BIND_ACCESSIBILITY_SERVICE,BIND_INPUT_METHOD,BIND_WALLPAPER,READ_VOICEMAIL,WRITE_VOICEMAIL
		4.Signature Or System: These permissions are automatically granted to apps signed with the same certificate as the app requesting the permission, or to apps pre-installed on the system image.
		5.System: These permissions are only available to apps pre-installed on the system image.


### What are the differences between Dalvik and ART?

	DALVIK VIRTUAL MACHINE
		DVM converts bytecode every time you launch a specific app.
		
	ANDROID RUN TIME
		ART converts it just once at the time of app installation. That makes CPU execution easier. Improved battery life due to faster execution.		


### What is DEX?

	In the context of Android, DEX refers to Dalvik Executable format, which is a file format used by the Android operating system to store compiled Android application code. The DEX format is optimized for memory-limited devices, such as smartphones, and allows multiple DEX files to be packaged in an APK (Android Package) file. The DEX files contain bytecode that is executed by the Dalvik virtual machine on the Android device, which enables the execution of Android apps. The DEX format has been replaced by the Android Runtime (ART) since Android 4.4 KitKat, but the DEX format is still supported for compatibility reasons.


### Can you manually call the Garbage collector?

	Yes, you can manually call the garbage collector in Android using System.gc(), but it is generally not recommended to do so. 
	The Android system manages the memory used by your app and automatically runs the garbage collector when necessary. 
	By manually calling the garbage collector, you may interfere with the normal operation of the system and cause unexpected behavior.
	Instead, it's best to let the system handle memory management and focus on optimizing your app's performance through other means such as reducing memory usage, avoiding memory leaks, and avoiding memory-intensive operations.

### What is Android Jetpack ?

	Android Jetpack is a set of libraries, tools, and guidance for Android app development. 
	It was introduced by Google to provide developers with a modern and robust set of components that make it easier to build high-quality apps for Android. 
	Jetpack includes libraries for tasks such as data binding, navigation, and live data, as well as tools for app testing and architecture. 
	The libraries are designed to work together, and provide a consistent, compatible, and testable set of components for building Android apps. 
	The goal of Android Jetpack is to help developers write better code, faster, and with less effort, by taking care of many of the underlying complexities of the Android platform.
	These software components have been arranged in 4 categories which are as follows:
		Foundation Components:
			Backward compatibility,Testing,Kotlin language support.
			All the foundation components are as follows:
				App Compat
				Android KTX
				Multidex
				Test		
		Architecture Components
			The architecture components help us in building:
				Robust Apps
				Testable Apps
				Maintainable Apps
			All the architecture components are as follows:
				Data Binding
				Lifecycles
				LiveData
				Navigation
				Paging
				Room
				ViewModel
				WorkManager		
		Behavior Components
			The behavior components help in the integration with standard Android services like
				Notifications
				Permissions
				Sharing
				Assistant
			All the behavior components are as follows:
				Download Manager
				Media & playback
				Notifications
				Permissions
				Preferences
				Sharing
				Slices		

		UI Components
			The UI components provide widgets and helpers to make your app not only easy, but delightful to use.
			All the UI components are as follows:
				Animation and transitions
				Auto
				Emoji
				Fragment
				Layout
				Palette
				TV
				Wear

### What is the room database in Android?

	Room is an Android library that provides an abstraction layer over SQLite, making it easier to interact with databases in Android apps. 
	Room provides a simple and efficient way to access relational data in your app, allowing you to define your data using Java objects (entities) and the relationships between them. Room takes care of creating the database tables and performing common database operations, such as inserting, updating, and deleting data. 
	Room also provides compile-time checks, making it easier to catch errors early in development. 
	This helps to minimize the number of runtime errors and improve the overall quality of your app. 
	Room also integrates well with other Android architecture components, such as LiveData and ViewModel, making it easier to build robust and maintainable Android apps.

### What is Data Binding?

	Data binding is a technique in Android development that allows you to bind data from your app's logic to its layout, making it easier to keep the UI in sync with the data it displays. With data binding, you can write expressions that reference variables and values from your code directly in the XML layout file, eliminating the need to write boilerplate code to update the UI. The data binding library then generates the code needed to update the UI automatically, freeing you from the manual labor of updating the UI every time the data changes.

	For example, you can bind a text view to a string value in your code, and the data binding library will take care of updating the text view whenever the value changes. This can make your code more readable, maintainable, and easier to test, as well as reducing the amount of code you need to write. Data binding also supports two-way binding, allowing you to update values in the code whenever the user interacts with the UI, making it easier to build interactive apps. Overall, data binding is a powerful tool for simplifying the process of updating the UI in Android development.

### What is LiveData in Android?

LiveData is a data holder class that is part of the Android Architecture Components library. It's a lifecycle-aware data holder class that holds data and notifies the observers when the data changes.

	One of the main advantages of using LiveData is that it is aware of the lifecycle of the observing component, for example, an Activity or a Fragment, and will automatically remove itself as an observer when the component is destroyed. This helps to prevent memory leaks and ensures that the data is updated only when the component is in an active state.

	Additionally, LiveData can be observed on the main thread or on a background thread, making it easy to update the UI based on the data changes. Overall, LiveData is a convenient way to handle data in Android that integrates well with the Android architecture and helps to promote good architecture practices.

### How LiveData is different from ObservableField?

	LiveData and ObservableField are both part of the Android Architecture Components library and are used for observing data changes in an Android app, but they have some important differences:

		1.Lifecycle Awareness: LiveData is lifecycle aware, meaning it automatically removes itself as an observer when the observing component (e.g., an Activity or a Fragment) is destroyed. ObservableField does not have this feature and the developer must manually remove the observer when the component is destroyed to prevent memory leaks.

		2.Data Type: LiveData can hold any type of data, while ObservableField is limited to holding a single value of a specific type, such as ObservableField<String> or ObservableField<Integer>.

		3.Update Notification: LiveData notifies its observers of updates when the data changes and it only updates its observers if the data has actually changed. ObservableField always notifies its observers of updates, even if the new value is the same as the previous value.

		4.Threading: LiveData can be observed on the main thread or on a background thread, making it easy to update the UI based on data changes. ObservableField can only be observed on the main thread.

	In general, LiveData is a more robust and flexible data holder class compared to ObservableField and is recommended for most use cases. ObservableField can still be useful in simple cases where a single value needs to be observed, but for more complex data structures, LiveData is the better choice.


### What is the difference between setValue and postValue in LiveData?

	setValue() and postValue() are methods used to update the value of a LiveData object in Android. The main difference between them is the way they update the value and how the observers are notified:

	setValue(): This method is used to update the value of a LiveData object and must be called from the main thread. It immediately notifies all the active observers of the change.

	postValue(): This method is used to update the value of a LiveData object from a background thread. It will post the value to the main thread and then notify all the active observers. This is useful when you want to update the LiveData value from a background thread without blocking the main thread.

	So, in general, if you want to update the value of a LiveData object from the main thread, you should use setValue(), and if you want to update it from a background thread, you should use postValue().


### How to share ViewModel between Fragments in Android?

	Using SharedViewModel, we can communicate between fragments. 
	If we consider two fragments, both the fragments can access the ViewModel through their activity. 
	Here, one fragment updates the data within the ViewModel which is shared between both the fragments and another fragment observes the changes on that data.
	
	
	Here is how to do it:

	1.Create a ViewModel: Create a ViewModel class that will hold the data you want to share between fragments.

	2.Initialize the ViewModelStore: Initialize the ViewModelStore in your activity. You can do this in the onCreate() method of your activity.

	3.Create a ViewModelProvider: In each fragment, create a ViewModelProvider instance, passing in the activity's ViewModelStore and a factory method to instantiate the ViewModel.

	4.Get the ViewModel instance: Call the get() method on the ViewModelProvider instance to get the shared ViewModel instance.
	
	class MyActivity : AppCompatActivity() {

		  private val viewModelStore = ViewModelStore()

		  override fun onCreate(savedInstanceState: Bundle?) {
			super.onCreate(savedInstanceState)
			setContentView(R.layout.activity_main)
		  }
		}

	class MyFragment : Fragment() {

		  private lateinit var sharedViewModel: SharedViewModel

		  override fun onCreateView(
			inflater: LayoutInflater,
			container: ViewGroup?,
			savedInstanceState: Bundle?
		  ): View? {
			sharedViewModel = ViewModelProvider(requireActivity().viewModelStore, ViewModelProvider.NewInstanceFactory())
			  .get(SharedViewModel::class.java)
			// Use the ViewModel
			return inflater.inflate(R.layout.fragment_main, container, false)
		  }
		}


	Now, both fragments can access and modify the same instance of the SharedViewModel.


### Explain Work Manager in Android

	WorkManager is part of Android Jetpack. WorkManager helps us to execute our tasks immediately or an appropriate time.
	
	WorkManager is basically a task scheduler, It makes it easy to specify the asynchronous task and when they should run. 
	The Work Manager API helps create the task and hand it to the Work Manager to run immediately or at an appropriate time as mentioned.
	For example, you might point your app to download new resources from the network from time to time and now the downloading is a task and you can set up this task to run at an appropriate time depending on the availability of the WIFI network or when the device is charging. 
	So this way you can schedule a task using WorkManager.
	
	https://androidwave.com/android-workmanager-tutorial/

### Use-cases of WorkManager in Android

	WorkManager is a part of Android Jetpack and it is used for the following use-cases:

		1.Deferred & Background Work: It allows you to schedule one-off or periodic tasks that are executed in the background, even if the app is not running.

		2.Chained & Sequential Tasks: It allows you to chain multiple tasks together and run them in a specific order.

		3.Guaranteed Task Execution: WorkManager guarantees task execution, even if the device restarts, by using a combination of JobScheduler, AlarmManager, and broadcast receivers.

		4.Battery-Friendly: WorkManager is optimized for battery efficiency, and it will not run tasks if the device is in low-power mode or not connected to a power source.

		5.Simplified Task Scheduling: WorkManager provides a simple and easy-to-use API for scheduling tasks, which makes it a great choice for developers who want to avoid the complexity of handling task scheduling on their own.

		6.Cancellation & Chaining Support: It allows you to cancel tasks, or chain them with other tasks, based on specific criteria.

		7.Safe & Automatic Task Processing: WorkManager automatically manages the execution of tasks, ensuring that they are run in a safe and predictable manner.

### How ViewModel work internally?

	The ViewModel is part of the Android Architecture Components and is designed to store and manage UI-related data in a lifecycle-conscious way.
	
	Benefits:
	Lifecycle awared
		Hold and share UI data
		Survives in rotation and retains data

### Why do we use bundles?

	Bundles in Android are used to pass data between activities, fragments, services, and other components of an Android app. 
	A Bundle is essentially a map of key-value pairs, where the keys are strings and the values can be of various types such as primitive data types, arrays, or custom objects that implement the Parcelable interface.

### What is the difference between Serializable and Parcelable? Which is the best approach in Android?

	Serializable and Parcelable are two mechanisms for serializing objects in Android to be passed between activities, services, or stored in memory.
	
	Serializable is a simple Java interface that provides a standard way of serializing objects to be saved and restored. Objects that implement the Serializable interface can be saved to disk or passed between activities using intents.
	
	Parcelable is an Android-specific interface that provides a more optimized and efficient way of serializing and deserializing objects. Parcelable is faster and more memory-efficient than Serializable because it directly writes the object's data to a Parcel, rather than creating a temporary copy of the object like Serializable does.

### What is AAPT?

	In the context of Android, AAPT stands for "Android Asset Packaging Tool". 
	It's a tool used by Android developers to compile resources for Android applications. 
	AAPT is responsible for generating the R.java file, which is a reference to all the resources used in the app, 
	and for packaging the compiled resources into the final APK (Android Package) file that can be installed on an Android device.

### What is the best way to update the screen periodically in android?

	In Android, the best way to update the screen periodically is to use a combination of event-driven programming and multithreading. Here's how you can do this:

		1.Use the Android View framework to display the data on the screen. The framework provides a way to bind the data to the screen and update it automatically when the data changes.

		2.Use the Handler and Looper classes to create a background thread to periodically update the data. The Handler class can be used to send messages to the main thread to update the UI.

		3.Use the AsyncTask class to run a background task that periodically updates the data. The AsyncTask class automatically runs the task on a background thread and allows you to easily update the UI when the data changes.

		4.Use the Runnable interface and Thread class to create a separate thread that periodically updates the data. The runOnUiThread method can be used to update the UI from the background thread.

	It's important to note that updating the UI too frequently can lead to lower performance, so it's recommended to update the screen only when necessary. Additionally, it's recommended to use postInvalidate instead of invalidate for smooth and efficient screen updates.


### What is RxJava in Android?

	RxJava is a Java-based reactive programming library used in Android development. 
	It allows developers to write asynchronous, event-based, and concurrent code in a more concise, readable, and expressive way.
	RxJava helps to manage multi-threading and handle data streams, making it a popular choice for developing complex, data-driven apps in Android.

### image loading library glide advantages:

	Glide is an image loading library for Android that provides several advantages over other libraries or built-in solutions:

		1.Performance: Glide uses a custom memory and disk cache to efficiently load images, even for large sizes.

		2.Easy to use: Glide provides a simple API to load and display images with a few lines of code.

		3.Flexibility: Glide can handle a wide range of image sources and can easily display images from different sources, such as network, local storage, or resources.

		4.Resource Management: Glide automatically manages and reuses resources to avoid memory leaks and improve performance.

		5.Image Transformation: Glide provides several built-in transformations, such as cropping, resizing, and rounded corners, that can be applied to images easily.

		6.Error handling: Glide provides a customizable error placeholder that can be displayed when an image fails to load.

		7.Support for GIFs and Video Frames: Glide supports loading and displaying GIFs and video frames as images.

	Overall, Glide provides a comprehensive solution for loading and displaying images in Android, making it a popular choice among developers.


### What is Dagger in Android?

	Dagger is a dependency injection framework for Android and Java. 
	It allows developers to manage the dependencies between objects in their applications by automatically constructing objects and satisfying the dependencies required by other objects. 
	This helps to increase code reuse and modularity, making applications easier to maintain and test.
	Dagger uses annotations and code generation to provide an efficient, type-safe, and readable way to manage dependencies in an Android app.

### design pattern in android

	In software engineering, a design pattern is a general repeatable solution to a commonly occurring problem in software design.

	In the context of Android development, some common design patterns include:

		1.Model-View-Controller (MVC) - Separates the application into three components: the model (data), the view (user interface), and the controller (logic)

		2.Model-View-Presenter (MVP) - An evolution of MVC, separates the view and the model into separate components and introduces a presenter to act as the middleman.

		3.Model-View-ViewModel (MVVM) - A variation of MVP, uses the data-binding library to bind the view and the model.

		4.Singleton - Enforces a single instance of a class across the entire application.

		5.Factory Method - Defines an interface for creating objects, but lets subclasses decide which class to instantiate.

	These design patterns help developers to write organized, reusable, and maintainable code for their Android applications.

### MVC vs MVP vs MVVM architecture.

	MVC (Model-View-Controller), MVP (Model-View-Presenter), and MVVM (Model-View-ViewModel) are all architectural patterns used in software development to separate the different concerns of an application and make it easier to develop, test, and maintain.

		1.MVC is the simplest of the three, with a clear separation between the Model (data), View (user interface), and Controller (logic to control the View and Model).

		2.MVP extends MVC by adding a separate layer called the Presenter, which handles the communication between the Model and View, making the View less dependent on the Model.

		3.MVVM goes further by using data-binding to automatically update the View when the Model changes, reducing the need for the Presenter to manually manage updates. This makes MVVM particularly useful for building dynamic and responsive user interfaces.

	In summary, the choice between MVC, MVP, or MVVM will depend on the specific requirements of your project, including the complexity of the user interface, the need for testing and maintainability, and the use of data-binding.



	MVC:It is a Model-View-Controller. The most commonly used architecture. These are the three components used in MVC.
		Model- It is business logic and Data State. Getting and manipulating the data, communicates with the controller, interacts with the database, sometimes update the views.
		View- What we see. User Interface consists of HTML/CSS/XML. It communicates with the controller and sometimes interacts with the model. It passed some dynamic views through the controller.
		Controller- It is Activity/Fragment. It communicates with view and model. It takes the user input from view/REST services. Process request Get data from the model and passes to the view.
		Advantages
			It keeps business logic separate in the model.
			Support asynchronous techniques
			The modification does not affect the entire model
			Faster development process
		Disadvantages
			Due to large code controller is unmanageable.
			Hinders the Unit testing
			Increased Complexity	
	MVP:It as Model-View-Presenter. For the phase of developing time or for the phase of developers it is vital to divide the architecture into layers. It breaks the dependency on what we have on view.
		Model- It is business logic and Data State. Getting and manipulating the data, communicates with the presenter, interacts with the database. It doesn't interact with the view.
		View - Consists of UI, activity, and fragment. It interacts with the presenter.
		Presenter- It presents the data from the model. Control all the behavior that want to display from the app. It drives the view. It tells view what to do. 
		Any interaction between the model and the view is handled by the presenter. Saves the data back to the model.
		Advantages
			It makes view dumb so that you can swap the view easily.
			Reusable of View and Presenter
			Code is more readable and maintainable
			Easy testing as business logic separated from UI
		Disadvantages
			Tight coupling between View and Presenter
			Huge amount of interfaces for interaction between layers.
			The code size is quite excessive.
	MVVM:It is a Model-View-ViewModel. It losses the tight coupling between each component and reduces the glue classes. 
		Works on the concept of observables. Children don't have reference to the parent, they only have reference by observables.
		Model-It has business logic, local and remote data source and repository.Repository: communicate with local or remote data sources according to the request from ViewModel.
		View -Only user interaction i.e.XML, no business logic. Direct send user action to view model but does not directly get a response. 
			  To get a response view observes some data which ViewModel exposes.
		ViewModel- Most of the user interface logic center it here. It is a bridge between a view and a business logic. 
			  It does not have any clue which view has to use it. As it does not have a direct reference to the view. Thus, good in testing and has loose coupling. 
			  But still, it needs to update the UI this interaction done by observables. When data changes observable notifies.



### Android Unit Testing





### What is ADB?

	ADB stands for Android Debug Bridge, it is a command-line tool used to communicate with an Android device for the purpose of debugging and performing advanced operations. 
	It allows developers to access the device's file system, make changes to it, transfer files, and run shell commands, among other things.


### What is DDMS and what can you do with it?

	DDMS stands for Dalvik Debug Monitor Server, it is a debugging tool that provides a graphical user interface to perform various actions on an Android device. It is part of the Android SDK (Software Development Kit) and is integrated with the ADB (Android Debug Bridge).
	With DDMS, you can:
		Inspect and control processes running on an Android device
		Monitor logcat output and process detail information
		Simulate incoming calls and SMS messages
		View heap and thread updates in real-time
		Browse file systems on the device
		Take screenshots of the device
		Manage port-forwarding and set breakpoints in the code.


### Firebase.

	Firebase is a Backend-as-a-Service (BaaS) platform that provides developers with a host of services and tools for building web and mobile applications.
	It offers features like real-time databases, authentication, storage, hosting, and more, all backed by Google infrastructure. 
	This allows developers to focus on building their applications without having to worry about the underlying infrastructure and server management. 
	Firebase is a popular choice for building real-time, collaborative applications and can be integrated into web, Android, and iOS projects.

### What are things that we need to take care while using Proguard?

	So, the Proguard will help you in reducing the size of your APK, remove the unused classes and methods and also make your application difficult to reverse engineer.
	Things to care while using Proguard in Android application
	Minify the code.
	Obfuscate the code.
	Optimize the code.

### Multidex in Android

	Multidex is a feature in Android that enables the creation of apps with more than the 64k method limit imposed by the Android runtime.
	This limit can be exceeded when an app includes many libraries or a large number of code. 
	To enable Multidex, the main class of the application must extend MultiDexApplication and the android:name attribute in the application element in the AndroidManifest.xml file must be set to "android.support.multidex.MultiDexApplication".

### How to use Firebase realtime database in your app?

	To use Firebase Realtime Database in your app, you can follow these steps:

		1.Create a Firebase project: Go to the Firebase console, create a new project, and register your app.

		2.Add the Firebase Realtime Database to your app: You can do this by using the Firebase Assistant in Android Studio or manually adding the dependencies to your build.gradle file.

		3.Initialize Firebase in your app: In your app's main Activity, you need to call FirebaseApp.initializeApp() to initialize the Firebase SDK.

		4.Read and write data to the database: Use the Firebase Database API to read and write data to the database. You can use setValue() and addValueEventListener() methods to write and read data, respectively.

		5.Security rules: You can secure your data by defining security rules for your Firebase Realtime Database. These rules define who can access your data and what they can do with it.

	This is a high-level overview of using Firebase Realtime Database in your app. You can find more details and examples in the Firebase documentation.

### About multiple apk for android application.

	Multiple APKs is a feature in the Google Play Store that allows developers to publish multiple versions of their app, each targeting different device configurations. This is useful when different parts of your app require different configurations or when you want to create separate APKs for different regions, for example.

	Each APK has its own unique version code, which allows the Google Play Store to determine which version is appropriate for a particular device. The Google Play Store will then download and install the appropriate APK on the device.

	There are a few key things to keep in mind when creating multiple APKs:

		1.Each APK must have a unique version code, so the Google Play Store can determine which APK to install on a particular device.

		2.You must ensure that each APK is signed with the same signing key.

		3.Each APK must have the same package name.

		4.You can specify the devices that each APK should target by using filters based on things like screen size, API level, and more.

	By using multiple APKs, you can create a better user experience for your users by delivering the right version of your app to their devices.


### What is obfuscation? What is it used for? What about minification?

	Obfuscation is the process of making code difficult to understand or reverse-engineer. 
	It's often used to protect intellectual property or to conceal malicious behavior. Minification, on the other hand, is the process of removing unnecessary characters from source code without changing its functionality.
	Minification is commonly used to reduce the size of code, which can lead to improved website performance by reducing load times.

### How to change some parameters in an app without app update?

	Some ways to change parameters in an app without updating the app include:

		1.Remote configuration: You can store the configuration parameters on a remote server and fetch them at runtime. This way, you can change the parameters without pushing an update.

		2.In-app settings: You can provide in-app settings for the user to change certain parameters.

		3.Use of a third-party library: There are libraries that can help you manage the configuration of your app dynamically, such as Firebase Remote Config.

	It's important to note that these methods may not be suitable for all cases, and the best approach depends on the specifics of the app and the parameters you want to change.


### Agile model v/s Waterfall model

	https://www.javatpoint.com/agile-vs-waterfall-model#:~:text=Agile%20model%20is%20flexible%20as,4.&text=In%20Agile%20model%2C%20there%20is%20a%20high%20customer%20interaction.
	Agile Model:
		1.The Agile methodology promotes the continuous interaction of the development and testing during the SDLC process of any project.
		2.Agile methodology allows much communication between the customers, developers, testers, and managers.					
			plan,design,develop,test,deploy,review,  launch
		
		3.Agile model is flexible as there is a possibility of changing the requirements even after starting the development process.
		4.In Agile model, there is a high customer interaction.
		5.It has a small team size. As smaller is the team, the fewer people work on it so that they can move faster.
		6.The test plan is reviewed after each sprint.
		7.Testing team can take part in the requirements change phase without problems.
		
	
	Waterfall model:
		1.The waterfall model is a universally accepted SDLC model. 
			Requirements,design,development,testing,delpoyment,maintenance
	
		2.On the other hand, the waterfall model is rigid as it does not allow to modify the requirements once the development process starts.
		3.Customer interaction in waterfall model is very less.
		4.In the waterfall model, the team may consist more members.
		5.Test plan is reviewed after complete development.
		6.It is difficult for the testing team to initiate any change in needs.


### Dagger2	:

	1.dagger2 is a dependency injection framework for android
	2.@inject annotation is used by a component to declare it wants certain injections.
	3.Three injection are availble
		1.constructor injection is used class constructor
		2.field injection is used with the fields in the class
		3.method injection is used to funtion/method
	4.@model annotation defins a component that can provide object to be injected
	5.@provides annotation tells dagger that the return type can be injected into a component.
	6.@component annotation ties together the previous  elements providing elements which will inject those dependencies wherever needed



### What is Retrofit?

	Retrofit is a type safe HTTP client library for Android and Java which makes it relatively easy to retrieve and upload JSON (or other structured data) via a REST based webservice
		What is REST?
			REpresentational State Transfer (REST) is an architectural style for providing standards between computer system on the web, making it easier for systems to communicate with each other
		What is an @GET call?
			An @Get call is used to request data from a specified resource.
		What is an @POST call?
			An @POST call is used to send data to a server to create/update a resource
		What is OAuth?
			OAuth is an open standard for access delegation, commonly used as a way for Internet users to grant websites or applications access to their information on other websites but without giving them the passwords.		
	
	Using RetroFit is very easy.

		Add dependecy in build.gradle.

			compile 'com.squareup.retrofit:retrofit:1.9.0'

			compile 'com.squareup.okhttp:okhttp:2.4.0' 
		Make an Interface for all http methods.

		Copy your json output and create pojo class to recieve json of your
		response, you can make pojo from JsonSchema2pojo site .

		make an adapter and call your method
		
		Refer: https://stackoverflow.com/questions/26500036/using-retrofit-in-android



### What are Design Patterns?

	In software engineering a design pattern is a general repeatable solution to a commonly occuring problem in software design. A design pattern is a description or template for how to solve a problem that can be used in many different situations.

	Why are Design Patterns useful?
		Design patterns can speed up the development process by providing tested, proven developmment paradigms. Reusing design patterns helps to prevent subtle issues that can cause major problems and improves code readability for coders and architects familiar with the patterns

	What are the main categories of Design patterns?
		There are 4 main categories
		Creational Design Patterns
		Structural Design Patterns
		Behavioural Design Patterns
		Concurrency Design Patterns

	What is the Singleton pattern?
		The singleton pattern is a design pattern that restricts the instantiation of a class to one. This is useful when exactly one object is needed to coordinate actions across the system.

	What is the Builder pattern?
		The builder pattern separates the construction of a complex object from its representation so that the same construction process can create different representations

	What is the Abstract Factory pattern?
		The Abstract Factory patterns provides an interface for creating families of related or dependent objects without specifying their concrete classes.

	What is the Adapter pattern?
		The Adapter pattern converts the interface of a class into another interface the client expects. Adapter lets classes work together that could not otherwise because of incompatible interfaces

	What is the Iterator pattern?
		The Iterator patterns provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

	What is the Observer pattern?
		The Observer patterns defines a one to many dependency between objects so that when one object changes state all its dependents are notified and updated automatically.


### What is Firebase?


Firebase is a set of online services developed by Google that provide different tools and utilities for application such as hosting messaging monitoring etc.

	What are some of the services provided by Firebase?
		Firebase provides a wide range of services, among which are
		File Storage
		Authentication
		Hosting
		Performance monitoring
		A/B testing
		Messaging
		Analytics

	How do you integrate Firebase into your app?
		Add the latest firebase library to the build.gradle file in your app

	What is Crashytics?
		Its an online service that provides crash reporting, application logging, online review and statistical analysis of application logs.

	What is Admob?
		Admob is an online service provided by Google that supply ads to mobile applications.

	What is CloudMessaging?
		Firebase Cloud Messaging (FCM) is a cross platform messaging solution that lets you reliably deliver messages at no cost.




### What is RxJava?

RxJava is a reactive programming library for Java. Reactive programming is a paradigm in which Objects react to events generated by other objects.

	What is the Reactive Manifesto?
		The Reactive Manifesto is an online document that lays out a high standard for application within the software development industry
		Responsive - Systems should respond in a timely manner
		Message Driven - System should use async message passing between components
		Elastic - System should stay responsive under high load
		Resilient - System should stay responsive when some components fail.


	What are Observables?
		Observable represents any object that can get data from a data source and whose state may be of interest in a way that other objects may register an interest.

	What are Observers?
		An observer is any object that wishes to be notified when the state of another object changes.

	What are the 3 methods of the Observer interface?
		OnNext - is called on our observer each time a new event is published to the attached Observable
		OnCompleted - is called when the sequence of events associated with an Observable is complete
		OnError - is called when an unhandled exception is thrown.

	What is the difference between blocking and non blocking Observables?
	 Non Blocking means asynchronous execution is supported and an observable is allowed to unsubscribe at any point in the event stream. Blocking means an observer is not allowed to unsubscribe in the middle of an event stream

	What are Operators?
		An operator is a function that takes one Observable (the source) as its first argument and returns another Observable (the destination)

	What are Subjects?
		A Subject is simultaneously two elements, a subscriber and an observable. As a subscriber, a subject can be used to publish the events coming from more than one observable.

	What is RxAndroid?
		RxAndroid is a library that wraps asynchronous UI events to be more RxJava like


### What patterns have you seen in the Android system and where?

	The Android system uses multiple patterns.Here is a list of some of them
	Adapter - ListAdapter, CursorAdapter
	Builder - AlertDialog.Builder()
	Singleton - R.java class
	Observer - RxJava	


### SharedPreferences

	Create SharedPreferences:
		SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE); 
		Editor editor = pref.edit();
	Storing data as KEY/VALUE pair
		editor.putBoolean("key_name1", true);           // Saving boolean - true/false
		editor.putInt("key_name2", "int value");        // Saving integer
		editor.putFloat("key_name3", "float value");    // Saving float
		editor.putLong("key_name4", "long value");      // Saving long
		editor.putString("key_name5", "string value");  // Saving string
		// Save the changes in SharedPreferences
		editor.apply(); // commit changes
	Get SharedPreferences data
		boolean userFirstLogin= pref.getBoolean("key_name1", true);  // getting boolean
		int pageNumber=pref.getInt("key_name2", 0);             // getting Integer
		float amount=pref.getFloat("key_name3", null);          // getting Float
		long distance=pref.getLong("key_name4", null);          // getting Long
		String email=pref.getString("key_name5", null); 
	Deleting Key value from SharedPreferences
		editor.remove("key_name3"); // will delete key key_name3
		editor.remove("key_name4"); // will delete key key_name4
		// Save the changes in SharedPreferences
		editor.apply(); // commit changes	
	Clear all data from SharedPreferences
		editor.clear();
		editor.apply(); // commit changes



### Kotlin

	https://github.com/MindorksOpenSource/from-java-to-kotlin
	https://gist.github.com/paulfranco/4453383cc6df064d03087ce7aa5a0c8c
	https://github.com/vamsitallapudi/Android-Interview-Questions-And-Answers/blob/master/kotlin/README.md
	https://github.com/MindorksOpenSource/android-interview-questions


### Tell some advantages of Kotlin

	1.Interoperable with Java: Kotlin code can easily be integrated with existing Java codebases, allowing for a gradual transition to the language.

	2.Concise and expressive: Kotlin's syntax is concise, reducing the amount of code required to perform the same tasks as Java, making it easier to read and maintain.

	3.Null safety: Kotlin has built-in null safety features that help prevent null pointer exceptions, a common source of crashes in Java.

	4.Higher-order functions: Kotlin supports functional programming, making it easier to write clean and readable code.

	5.Improved type inference: Kotlin's type inference system reduces the amount of boilerplate code required, making the code more readable and maintainable.

	6.Android development: Kotlin is a first-class language for Android development, with Google officially supporting it as a preferred language for Android app development.

	7.Growing community: Kotlin has a growing community of developers and companies who are adopting the language, providing a wealth of resources and support.

### What is the difference between val and var?

	The difference between val and var is that val makes a variable immutable — like final in Java — and var makes a variable mutable. 

### What is the difference between const and val?

	Both val and const are immutable.
	const is used to declare compile-time constants, whereas val for run-time constants.

### How to ensure null safety in Kotlin?

	In Kotlin, null safety can be ensured by using nullable and non-nullable types and by using safe calls, non-null assertions, and the Elvis operator.

	Here are a few ways to ensure null safety in Kotlin:

		1.Use nullable and non-nullable types: By default, variables in Kotlin are non-nullable. You can make a variable nullable by adding a "?" after the type.

		2.Safe calls: Use the "?." operator to access properties or call methods on an object that might be null. This will return null if the object is null, instead of throwing a NullPointerException.

		3.Non-null assertions: Use the "!!" operator to force a nullable reference to a non-null reference. This will throw a NullPointerException if the reference is null.

		4.Elvis operator: Use the "?:" operator to provide a default value if a nullable reference is null.

	By using these techniques, you can write safer, more readable code that is less prone to null pointer exceptions.
	
	Kotlin has a safe call operator (?.) to handle null references.
		To use or set some variable to null value, we need to append a ? sign to the type of the variable.
		var name1: String? = "MindOrks" //no error
		name1 = null //no error
		var name2: String? = null //no error

### When to use lateint keyword used in Kotlin?

	lateinit means late initialization,we are sure that the variable will be initialized before using it.
	If we don't initialize a lateinit variable before using it gives an error of “lateinit property has not been initialized”.
	i) Use it with mutable variable[var]
		lateinit var name: String       //Allowed
		lateinit val name: String       //Not Allowed
	ii) Allowed with only non-nullable data types
		lateinit var name: String       //Allowed
		lateinit var name: String?      //Not Allowed



### How to check if a lateinit variable has been initialized?

	In Kotlin, you can check if a "lateinit" variable has been initialized using the :: operator followed by the name of the variable.
	The :: operator returns a KProperty object that provides access to information about the property, including its status.
	
	class Example {
    lateinit var name: String

		fun init() {
			name = "John Doe"
		}

		fun displayName() {
			if (!::name.isInitialized) {
				println("Name has not been initialized")
				return
			}
			println("Name: $name")
		}
	}


### How to do lazy initialization of variables in Kotlin?

	Lazy initialization was designed to prevent unnecessary initialization of objects.
	Your variable will not be initialized unless you use it.
	It is initialized only once. Next time when you use it, you get the value from cache memory.
	It is thread safe.
	The variable can only be val and non-nullable.

	val lazyValue: String by lazy {
    println("Initializing lazy value")
    "Hello, Lazy World!2"
	}

	fun main() {
		println(lazyValue)
		println(lazyValue)
	}
	
	outPut:
		Initializing lazy value
		Hello, Lazy World!2
		Hello, Lazy World!2


### What are companion objects in Kotlin? or What is the equivalent of Java static methods in Kotlin?

	In Kotlin, companion objects provide a way to define static methods and properties, which are similar to static methods and fields in Java. A companion object is a singleton object that is associated with a class and can be accessed using the name of the class.

	Here is an example of how to define a companion object in Kotlin:
		class MyClass {
			companion object {
				fun staticMethod() {
					println("This is a static method")
				}
			}
		}
	
	In this example, the staticMethod function is defined inside the companion object. You can call this function from other parts of the code using the following syntax:
	
	MyClass.staticMethod()

	Companion objects can also be used to define static properties, just like in Java:
	
	class MyClass {
    companion object {
        var staticProperty = 42
		}
	}
	
	In this example, the staticProperty variable is defined inside the companion object. You can access this property from other parts of the code using the following syntax:
	
	println(MyClass.staticProperty)



### What are the visibility modifiers in Kotlin?

	In Kotlin, visibility modifiers control the visibility and accessibility of classes, objects, interfaces, constructors, functions, properties, and their setters. The following are the visibility modifiers in Kotlin:

	1.private: The member is only accessible within the same class.
	2.protected: The member is only accessible within the same class and its subclasses.
	3.internal: The member is accessible within the same module. A module is a set of Kotlin files compiled together.
	4.public: The member is accessible everywhere. This is the default visibility for top-level declarations.
	
	Here is an example of how to use the visibility modifiers in Kotlin:
	
		class MyClass {
			private val privateProperty = 42
			protected val protectedProperty = 43
			internal val internalProperty = 44
			public val publicProperty = 45

			private fun privateMethod() {
				println("This is a private method")
			}

			protected fun protectedMethod() {
				println("This is a protected method")
			}

			internal fun internalMethod() {
				println("This is an internal method")
			}

			public fun publicMethod() {
				println("This is a public method")
			}
		}
	In this example, the privateProperty, protectedProperty, internalProperty, and publicProperty variables are declared with different visibility modifiers. 
	The privateMethod, protectedMethod, internalMethod, and publicMethod functions are declared with different visibility modifiers as well. 
	The accessibility of these members depends on their visibility modifiers, as described above.


### What is a data class in Kotlin?

	Data classes are specifically designed to hold the data. (it's similar in Getters and Setters in java)
	
	data class Person(val name: String, val age: Int)
	
	In this example, Person is a data class with two properties name and age. 
	By marking the class as data, the compiler automatically generates a number of functions for us, including toString(), hashCode(), and equals().
	We can also access the properties of the class directly, like this:
	
	val person = Person("John Doe", 30)
	println(person.name)  // Output: John Doe
	println(person.age)    // Output: 30

### How to create a Singleton class in Kotlin? or Singleton Object

	In Kotlin, there are two ways to create a singleton class:
		1.Using an object keyword
			object SingletonObject {
				fun doSomething() = println("Singleton object doing something")
			}
		2.Using a companion object inside a class
			class SingletonClass {
				companion object {
					fun doSomething() = println("Singleton class doing something")
				}
			}
		
	In both cases, you can access the singleton instance without having to explicitly instantiate the class. 
	Just call the methods directly on the class/object name, e.g. SingletonObject.doSomething() or SingletonClass.doSomething().	


### What is the difference between open and public in Kotlin?

	In Kotlin, open and public are both visibility modifiers that control the accessibility of a class, function, property, or constructor.

	The difference between open and public is that open allows a class, function, or property to be subclassed or overridden in other classes, while public only allows access within the same module.

	By default, classes, functions, and properties in Kotlin are final and cannot be overridden. To allow them to be subclassed or overridden, you need to use the open keyword.
	
	class Car{....}
	class Supercar:Car{....} : // give an error

	open Car2{....}
	class Supercar:Car2{....} : // ok
	
	and 
	 
		open class Parent {
		open fun doSomething() = println("Parent doing something")
		}

		class Child : Parent() {
			override fun doSomething() = println("Child doing something")
		}

	Note that the public keyword is redundant in Kotlin as it is the default visibility level. It is usually omitted.


### Explain the use-case of let, run, with, also, apply in Kotlin.(or) scope functions

	Kotlin provides a set of scope functions, also known as "extension functions," that can be used to structure code and simplify common operations on objects. These functions include:

	1.let: Used to execute a block of code on an object, with the object passed as an argument to the block. The result of the block is returned, allowing you to chain multiple operations.
		Example:
		val name = "John Doe"
		val result = name.let {
			it.toUpperCase()
		}
		println(result)  // Output: JOHN DOE
	2.run: Similar to let, but the receiver object is accessible as this within the block, rather than being passed as an argument.
		Example:
		val name = "John Doe"
		val result = name.run {
			toUpperCase()
		}
		println(result)  // Output: JOHN DOE
	3.with: Similar to run, but the receiver object is passed as the only argument to the block.
		Example:
		val name = "John Doe"
		val result = with(name) {
			toUpperCase()
		}
		println(result)  // Output: JOHN DOE
	4.apply: Similar to run, but the receiver object is returned after the block is executed, allowing you to modify the object and chain multiple operations.
		Example:
		val name = "John Doe"
		val result = name.apply {
			this + " Jr."
		}.toUpperCase()
		println(result)  // Output: JOHN DOE JR.
	5.also: Used to execute a block of code on an object, with the object passed as an argument to the block, but the original object is returned after the block is executed.
		Example:
		val name = "John Doe"
		val result = name.also {
			println(it.toUpperCase())
		}
		println(result)  // Output: JOHN DOE
						 // Output: JOHN DOE



### Difference between List and Array types in Kotlin

	In Kotlin, both List and Array are used to represent a collection of elements, but they have some key differences:

	1.Immutability: List is an immutable collection, which means that once you create a List, you cannot change its elements. On the other hand, Array is a mutable collection, so you can change its elements after creation.

	2.Type: List is a generic type, which means that its elements can have any type. An Array, on the other hand, has a fixed type for its elements, specified when the Array is created.

	3.Syntax: 
		Creating an instance of a List in Kotlin is straightforward, as it can be created using the listOf function:
			val names = listOf("John", "Jane", "Jim")
		An Array can be created using the arrayOf function, or by using the Array class:
			val numbers = arrayOf(1, 2, 3)
			val numbers2 = Array(3) { 0 }
		
	Performance: Array is generally faster than List in terms of access time, since it's an array at the underlying level, but it may have a higher overhead when it comes to resizing the collection.
	In general, you should choose List if you need an immutable collection and Array if you need a mutable one. The choice between the two types will depend on your specific requirements and the particular use case.

### What are Labels in Kotlin?

Labels in Kotlin are custom names given to a specific point in the code. They can be used to control the flow of execution in loops and when working with nested structures.
Labels in Kotlin are prefixed with the '@' symbol, followed by the label name.

	Here's an example:
		outerLoop@ for (i in 1..3) {
			innerLoop@ for (j in 1..3) {
				if (i == 2 && j == 2) {
					break@outerLoop
				}
				println("i = $i; j = $j")
			}
		}
		Output:
			i = 1; j = 1
			i = 1; j = 2
			i = 1; j = 3
			
			
	outerLoop@ is just a label with the name "outerLoop"
	whereas @outerLoop is a reference for the labeled loop or block.

	In this example, the two loops are labeled outerLoop and innerLoop. The break statement with the @outerLoop label will transfer control out of the entire outerLoop, rather than just breaking out of the inner loop. The output of the code will be:
	
	You can use the continue keyword with a label in a similar manner, to transfer control to a specific point in the code.

### What is an Init block in Kotlin?

	An init block in Kotlin is a block of code that is executed when an instance of a class is created. 
	The init block is used to initialize the state of an object, perform some setup, or run some logic when an object is created. 
	In Kotlin, you can have multiple init blocks in a class and they are executed in the order in which they appear. 
	The init block is executed before the constructor is called.
	Here's an example:
		class Example {
			var variable: Int

				init {
					variable = 0
					println("First init block")
				}

				init {
					variable = 1
					println("Second init block")
				}

				constructor() {
					println("Constructor")
				}
			}

		fun main() {
			val example = Example()
			println("Variable: ${example.variable}")
		}
	The output of this code will be:
		First init block
		Second init block
		Constructor
		Variable: 1
		
	In this example, two init blocks are defined and they are executed in the order in which they appear. 
	The init blocks are used to initialize the state of the variable property.
	The constructor is then called, which prints the "Constructor" message to the console.

### Explain pair and triple in Kotlin.

	Pair
		Pair is a predefined class in Kotlin that is used to store and return two variables at a time.Those two variables can be of the same type or of a different type.
			val variable1 = "Declaring String variable"
			val variable2 = 1 // declaring integer value
			val variableName = Pair (variable1, variable2) // using declared variable in Pair class
			println(variableName.first) // will print the value of variable1
			println(variableName.second) // will print the value of variable2
	Triple
		Triple class in Kotlin, you can return 3 variables of same or different type from one function.
			val variable1 = "Declaring String variable"
			val variable2 = 1 // declaring integer value
			val variable3 = "Declaring second string value"
			val variableName = Triple (variable1, variable2, variable3) // using declared variable in Triple class
			println(variableName.first) // will print the value of variable1
			println(variableName.second) // will print the value of variable2
			println(variableName.third) // will print the value of variable3


### How to choose between apply and with?




### How to choose between switch with when?


	In Kotlin, when replaces the switch operator of other languages like Java. A certain block of code needs to be executed when some condition is fulfilled. 
	when(lb) {
			"Sun" -> println("Sun is a Star")
			"Moon" -> println("Moon is a Satellite")
			"Earth" -> println("Earth is a planet")
			 else -> println("I don't know anything about it")
		}

### What are Coroutines in Kotlin?

	Coroutine are light-weight threads. A light weight thread means it doesn’t map on native thread, so it doesn’t require context switching on processor, so they are faster.
	Coroutines and the threads both are multitasking. But the difference is that threads are managed by the OS and coroutines by the users.
	Basically, there are two types of Coroutines:
		Stackless
		Stackful
	Kotlin implements stackless coroutines — it’s mean that the coroutines don’t have own stack, so they don’t map on native thread.
		These are the functions to start the coroutine:
			launch{}
			async{}




### What is Coroutine Scope?

	Coroutine scope is a tool in the Kotlin programming language for managing the lifecycle of coroutines. Coroutines are a lightweight form of concurrency that can be used to perform tasks in the background, without blocking the main thread. The CoroutineScope class provides a way to organize and manage these background tasks by grouping them together under a common scope.

	When you create an instance of CoroutineScope, you define a boundary for the coroutines that will be launched within it. This boundary can be used to control the lifecycle of the coroutines. For example, you can cancel all coroutines in the scope when the scope is cancelled, which is useful for cleaning up resources or stopping background tasks when they are no longer needed.

	Additionally, the CoroutineScope class provides methods for launching coroutines, such as launch and async, and it also integrates with the Dispatchers class to control the execution context of the coroutines it launches.

	Overall, CoroutineScope provides a convenient way to manage the lifecycle and execution of coroutines, and it is a crucial part of the coroutine ecosystem in Kotlin.


#### What is Coroutine Context?

	Coroutine Context is a concept in the Kotlin programming language that refers to the set of elements that provide the environment in which a coroutine runs. 
	It includes information such as the dispatcher (which determines the thread or threads on which a coroutine runs), 
	the Job (which represents the lifecycle of a coroutine), and elements that can be used to store additional data such as custom attributes or error handling functions. 
	The coroutine context is important for controlling the behavior of a coroutine, and it can be used to communicate information between coroutines or to manage the lifecycle of a coroutine.

### Launch vs Async in Kotlin Coroutines

	Launch:
		The launch is basically fire and forget.
		launch{} does not return anything.
		launch{} cannot be used when you need the parallel execution of network calls.
		launch{} will not block your main thread.
	Async
		Async is basically performing a task and return a result.
		async{ }, which has an await() function returns the result of the coroutine.
		Use async only when you need the parallel execution network calls.
		Async will block the main thread at the entry point of the await() function.


### What is inline function in Kotlin?

	An inline function is declare with a keyword inline. The use of inline function enhances the performance of higher order function. 
	The inline function tells the compiler to copy parameters and functions to the call site.
	The virtual function or local function cannot be declared as inline.

### When to use Kotlin sealed classes?

	Sealed classes are similar to enum classes which also has restrictive set of types allowed, 
	except that Sealed classes can contains additional data to be propagated(which we cannot achieve with enum classes)
		sealed class Result {
			data class Success(val data: T): Result()
			data class Error(val exception: Exception): Result()
		}
	Sealed classes can contain any other clases like data class, pojo class, or even other sealed classes.


### What is the use of infix in Kotlin?

	infix functions are used for declaring a short form notation of a function.
	
	For example, consider the following code:
		infix fun Int.plus(other: Int): Int = this + other
		val result = 3 plus 4
	Here, the plus function is defined as an infix function and can be called using the infix notation, 3 plus 4.
	This makes the code more readable and concise, compared to the regular function call notation 3.plus(4).

### Explain function literals with receiver in Kotlin?

	A Function literal is a function that is not declared but that is passed in as an expression. 
	Lambdas and anonymous functions are function literals. In Kotlin, we can call a function literal with a receiver object, 
	and we can call methods on the receiver object inside the body of the function literal, quite like extension functions. 
	fun main() {
    val sum = { a: Int, b: Int -> a + b }
		println(sum(1, 2)) // 3
	}

Tell about Kotlin DSL(Domain-Specific Languages).



### What are higher-order functions in Kotlin?

	Higher-order functions in Kotlin are functions that take functions as parameters and/or return functions.

	For example, consider the following Kotlin code:

		fun apply(f: (Int) -> Int, x: Int): Int {
			return f(x)
		}

		fun square(x: Int): Int {
			return x * x
		}

		val result = apply(::square, 5)
		println(result) // 25
		
	In this example, the apply function takes two parameters: f, which is a function that takes an Int and returns an Int, and x, which is an Int. The apply function then calls f with x as the argument and returns the result.
	The square function is an example of a function that fits the required signature of f, so it can be passed as an argument to apply. When apply is called with square and 5, it returns 25.

### What are Lambdas in Kotlin

	Lambdas are anonymous functions in Kotlin that can be passed as values to higher-order functions.

	For example, consider the following code:

		fun apply(f: (Int) -> Int, x: Int): Int {
			return f(x)
		}

		val result = apply({ x: Int -> x * x }, 5)
		println(result) // 25
		
	In this example, a lambda expression { x: Int -> x * x } is passed as the first argument to the apply function. The lambda expression takes an Int parameter x and returns the square of x.
	When the apply function is called with this lambda and 5, it returns 25. The lambda expression is equivalent to the square function in the previous example.

### Tell about the Collections in Kotlin

	Collections in Kotlin are used to store group of related objects in a single unit. By using collection, we can store, retrieve manipulate and aggregate data.
		Immutable Collection (or Collection)
			Immutable collection also called Collection supports read only functionalities. Methods of immutable collection that supports read functionalities are:
				List-listOf(),listOf()
				Map-mapOf()
				Set-setOf()
			
		Mutable Collection
			Mutable collections supports both read and write functionalities. Methods of mutable collections that supports read and write functionalities are:
				List-ArrayList(),arrayListOf(),mutableListOf()
				Map-HashMap,hashMapOf(),mutableMapOf()
				Set-hashSetOf(),mutableSetOf()


### When would you use Elvis operator in Kotlin?

	The Elvis operator ?: in Kotlin is used as a null check operator, and it returns the expression on its left side if it's not null, or the expression on its right side if the left-side expression is null.

	For example, consider the following code:
	val a: String? = "hello"
	val b = a ?: "world"
	Here, a is a nullable string with the value "hello". The expression a ?: "world" returns "hello", because a is not null.

	So, you would use the Elvis operator when you want to assign a default value to a nullable variable, to prevent a NullPointerException from being thrown.
	
	The Elvis operator is the ternary operator.

### Notes

	https://www.youtube.com/watch?v=tDYZBSSgp1c