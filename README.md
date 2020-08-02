# Android React Native app

This repo serves as a reference for integrating React Native into a brand new Android app.

The official React Native docs to integrate in an Android app are outdated and inaccurate. I have created a issue to get them updated here: https://github.com/facebook/react-native-website/issues/2118

## Setup Android app

- Create a new Android app using the "No Activity" template.
- Set the minimum SDK version to 23
- Delete the un-used tests.

The app won't run intially as it doesn't have the `MainApplication` and/or `MainActivity` files. This serves as a starting point for the app and so it will fail with *"Default Activity not found"*.

Next go ahead and create the `MainApplication.java` and `MainActivity.java` classes. This commit https://github.com/Monte9/android-react-native-app/commit/de1cca2fd293e3103e3538ec0e0400370bc0dd08 adds it.

Go ahead and build and run the app and you should see a simple Android app with a navigation bar title that says "**Android React Native App**".

You now have a working Android application. :clap:

### Add Native UI and Screens

Our Android app serves as a **Property Guide**. The user will land on the **Property** screen, which will be a **native Java screen**.

This screen will have two buttons:

- The first button **Property Details** will navigate the user to the Property Details screen. This will be a **native Java screen**.
- The second button **RN Property Details** will also navigate the user to the Property Details screen. This will be a **fully React Native screen**.

Let's start by getting the native Property and Property Details screen setup. You can checkout this commit which adds it.

Here's what the completed native screens look like:

<div style="display: flex; flex-direction: row">
<img src="./docs/property-screen.png" width="320" />
<img src="./docs/property-details-screen.png" width="320" />
</div>
