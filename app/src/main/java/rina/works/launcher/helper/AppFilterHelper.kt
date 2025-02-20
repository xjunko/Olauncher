package rina.works.launcher.helper

import rina.works.launcher.data.AppModel

interface AppFilterHelper {
    fun onAppFiltered(items: List<AppModel>)
}