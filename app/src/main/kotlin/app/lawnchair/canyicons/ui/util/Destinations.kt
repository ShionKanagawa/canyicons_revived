package app.lawnchair.canyicons.ui.util

import kotlinx.serialization.Serializable

@Serializable
object Home

@Serializable
object About

@Serializable
object Acknowledgements

@Serializable
object Contributors

@Serializable
data class Acknowledgement(val id: String)
