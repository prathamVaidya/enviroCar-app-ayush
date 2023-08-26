package org.envirocar.app.views.modeldasboard

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.envirocar.app.R
import org.envirocar.voicecommand.model.VoiceModel

class ModelAdapter() : RecyclerView.Adapter<ModelAdapter.ViewHolder>() {

    var models : List<VoiceModel> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView = view.findViewById<TextView>(R.id.model_name_tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.model_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = models.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTextView.text = models[position].name
    }


}