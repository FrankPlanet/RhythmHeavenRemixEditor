package io.github.chrislo27.rhre3.registry.datamodel.impl

import io.github.chrislo27.rhre3.entity.model.ModelEntity
import io.github.chrislo27.rhre3.registry.datamodel.Datamodel
import io.github.chrislo27.rhre3.registry.Game
import io.github.chrislo27.rhre3.track.Remix


class KeepTheBeat(game: Game, id: String, deprecatedIDs: List<String>, name: String,
                  val duration: Float,
                  val cues: List<CuePointer>)
    : Datamodel(game, id, deprecatedIDs, name) {

    override fun createEntity(remix: Remix): ModelEntity<*> {
        TODO()
    }

    override fun dispose() {
    }

}