package com.raywenderlich.android.creatures.ui

import android.support.v7.widget.RecyclerView
import android.view.View
import com.raywenderlich.android.creatures.model.Creature

class CreatureAdapter(private val creatures: List<Creature>) : RecyclerView.Adapter<CreatureAdapter.ViewHolder>() {

  class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {

  }
}