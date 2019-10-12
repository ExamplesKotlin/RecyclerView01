package com.raywenderlich.android.creatures.ui

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.raywenderlich.android.creatures.R
import com.raywenderlich.android.creatures.app.inflate
import com.raywenderlich.android.creatures.model.Creature

class CreatureAdapter(private val creatures: List<Creature>) : RecyclerView.Adapter<CreatureAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
    return ViewHolder(parent.inflate(R.layout.list_item_creature))
  }

  override fun getItemCount() = creatures.size

  override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {

  }
}