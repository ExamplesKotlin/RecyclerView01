package com.raywenderlich.android.creatures.ui

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.android.creatures.R
import com.raywenderlich.android.creatures.app.inflate
import com.raywenderlich.android.creatures.model.Creature
import kotlinx.android.synthetic.main.list_item_creature.view.*

class CreatureAdapter(private val creatures: List<Creature>) : RecyclerView.Adapter<CreatureAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
    return ViewHolder(parent.inflate(R.layout.list_item_creature))
  }

  override fun getItemCount() = creatures.size

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(creatures[position])
  }

  class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    private lateinit var creature: Creature

    init {
      itemView.setOnClickListener(this)
    }

    fun bind(creature: Creature) {
      this.creature = creature
      val context = itemView.context
      itemView.creatureImage.setImageResource(context.resources.getIdentifier(creature.uri, null, context.packageName))
      itemView.txtFullName.text = creature.fullName
      itemView.txtNickName.text = creature.nickname
    }

    override fun onClick(view: View) {
      val context = view.context
      val intent = CreatureActivity.newIntent(context, creature.id)
      context.startActivity(intent)
    }

  }
}