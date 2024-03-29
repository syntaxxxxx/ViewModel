
package com.syntax.android.creaturemon.model

import android.arch.lifecycle.LiveData

interface CreatureRepository {
  fun saveCreature(creature: Creature)
  fun getAllCreatures(): LiveData<List<Creature>>
  fun clearAllCreatures()
}