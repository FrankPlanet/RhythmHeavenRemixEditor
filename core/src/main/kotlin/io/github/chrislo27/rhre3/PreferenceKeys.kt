package io.github.chrislo27.rhre3


object PreferenceKeys {

    private val DATABASE_VERSION = "databaseVersion"
    val DATABASE_VERSION_BRANCH = "${DATABASE_VERSION}_${RHRE3.DATABASE_BRANCH}"
    val THEME_INDEX = "themeIndex"
    val LANG_INDEX = "languageIndex"
    val WINDOW_STATE = "windowState"
    val MIDI_NOTE = "midiNote"

    // settings
    val SETTINGS_MINIMAP = "settings_minimap"
    val SETTINGS_AUTOSAVE = "settings_autosave"
    val SETTINGS_CHASE_CAMERA = "settings_chaseCamera"
    val SETTINGS_SUBTITLE_ORDER = "settings_subtitleOrder"
    val SETTINGS_REMIX_ENDS_AT_LAST = "settings_remixEndsAtLast"
    val SETTINGS_SMOOTH_DRAGGING = "settings_smoothDragging"
    val SETTINGS_SOUND_SYSTEM = "settings_soundSystem"

    val FILE_CHOOSER_MUSIC = "fileChooser_musicSelect"
    val FILE_CHOOSER_SAVE = "fileChooser_save"
    val FILE_CHOOSER_LOAD = "fileChooser_load"
    val FILE_CHOOSER_EXPORT = "fileChooser_export"

    val FAVOURITES = "favourites"
    val RECENT_GAMES = "recentGames"
    val LAST_VERSION = "lastVersion"
    val TIMES_SKIPPED_UPDATE = "timesSkippedUpdate"

}