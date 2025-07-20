# TollMapNavigator-Java
🛰️ Android Java app to visualize tolling gantries and access their map location.
# TollSiteLocatorApp (Android Java)

This app allows tolling team members to:
- View toll site locations on map
- Upload new site entries
- Navigate to specific ramps, gantries, or shelters

## Features
- View all sites
- View on Google Map
- Upload form
- Firebase or JSON-based data

## Folder Structure
See `/app/src/main/java/com/example/tollsiteapp/` for:
- Activities
- Upload logic
- JSON utilities

## Run the App
1. Clone the repo
2. Open in Android Studio
3. Set up Firebase (optional)
4. Build & Run on emulator/device

## Demo Data
See `assets/sites.json`

## License
MIT


📱 1. Core Screens
✅ MainActivity.java
Splash or intro screen → Redirects to Site List.

✅ SiteListActivity.java
Loads site list from JSON or Firebase.

Displays in RecyclerView with name + lat/lng.

Button: "Details" → SiteDetailActivity.

✅ SiteDetailActivity.java
MapView (Google Maps)

Marker of site

Details: name, coordinates, type, route info, etc.

✅ UploadActivity.java
Upload form with fields:

Site Name

Coordinates (lat/lng)

Type: OnRamp, OffRamp, Gantry, Tech Shelter

Route Info

Submit: Append to JSON or push to Firebase

✅ JsonUtils.java
Read/write to JSON in assets/sites.json

