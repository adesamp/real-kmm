package id.adeds.shared.datalayer.sources.local

import com.russhwolf.settings.Settings
import id.adeds.shared.viewmodel.characterslist.MenuItem

class MySettings (s : Settings) : SettingsClient(s) {

    // here we put all the values we want to save in MultiplatformSettings,
    // we can custom our types, by using Kotlin's delegated properties: https://kotlinlang.org/docs/delegated-properties.html
    // we wrote our types definition in the SettingClient class

    var selectedMenuItem by MenuItemType(MenuItem.ALL)
    var favoriteCharacters by TrueMapType()
    //var selectedString by StringType("mytext")

}