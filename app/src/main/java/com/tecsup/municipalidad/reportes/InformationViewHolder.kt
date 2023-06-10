package com.tecsup.municipalidad.reportes

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tecsup.municipalidad.R


class InformationViewHolder (inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_information, parent, false))
{
    private var textTitle : TextView? = null
    private var textPlace : TextView? = null
    private var textCommet: TextView? = null


    init {
        textTitle = itemView.findViewById(R.id.textTitle)
        textPlace = itemView.findViewById(R.id.textPlace)
        textCommet = itemView.findViewById(R.id.textContext)


    }

    fun bind(information: Information){
        textTitle?.text = information.title
        textPlace?.text = information.place
        textCommet?.text = information.comment

    }


}