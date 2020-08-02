# Android React Native app

This repo serves as a reference for integrating React Native into a brand new Android app.

## Setup Android app

- Create a new Android app using the "No Activity" template.
- Set the minimum SDK version to 23
- Delete the un-used tests.

The app won't run intially as it doesn't have the `MainApplication` and/or `MainActivity` files. This serves as a starting point for the app and so it will fail with *"Default Activity not found"*.

Next go ahead and create the `MainApplication.java` and `MainActivity.java` classes. This commit adds it.

Go ahead and build and run the app and you should see a simple Android app with a navigation bar title that says "**Android React Native App**".

You now have a working Android application. :clap:

### Add Native UI and Screens


