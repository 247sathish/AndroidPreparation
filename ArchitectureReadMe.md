https://en.proft.me/2017/01/7/understanding-mvc-mvp-mvvm-patterns-android/

https://en.proft.me/2017/01/7/understanding-mvc-mvp-mvvm-patterns-android/


MVC::::
- app
    - src
        - main
            - java/com/example/myapp
                - controllers
                    - UserController.kt
                    - PostController.kt
                    - ...
                - models
                    - User.kt
                    - Post.kt
                    - ...
                - views
                    - activities
                        - MainActivity.kt
                        - CreateUserActivity.kt
                        - EditUserActivity.kt
                        - ...
                    - fragments
                        - UserListFragment.kt
                        - PostListFragment.kt
                        - ...
                    - adapters
                        - UserAdapter.kt
                        - PostAdapter.kt
                        - ...
                    - ...
            - res
                - layout
                    - activity_main.xml
                    - activity_create_user.xml
                    - activity_edit_user.xml
                    - fragment_user_list.xml
                    - fragment_post_list.xml
                    - ...
                - drawable
                    - icon.png
                    - ...
                - values
                    - strings.xml
                    - colors.xml
                    - ...
                - ...
        - test
            - java/com/example/myapp
                - controllers
                    - UserControllerTest.kt
                    - PostControllerTest.kt
                    - ...
                - models
                    - UserTest.kt
                    - PostTest.kt
                    - ...
                - ...
- build.gradle
- ...



