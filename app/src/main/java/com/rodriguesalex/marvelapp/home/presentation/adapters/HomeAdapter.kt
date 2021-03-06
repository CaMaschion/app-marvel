package com.rodriguesalex.marvelapp.home.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rodriguesalex.marvelapp.R
import com.rodriguesalex.marvelapp.home.data.HomeCharacterVO
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.view_home_item.view.*

class HomeAdapter(
    private val list: List<HomeCharacterVO>,
    private val callback: ((HomeCharacterVO) -> Unit)
) : RecyclerView.Adapter<HomeAdapter.HomeItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeItemViewHolder =
        HomeItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.view_home_item, parent, false)
        )

    override fun onBindViewHolder(holder: HomeItemViewHolder, position: Int) {
        holder.bind(list[position], onClick = callback)
    }

    override fun getItemCount(): Int = list.size

    class HomeItemViewHolder(
        private val view: View
    ) : RecyclerView.ViewHolder(view) {

        fun bind(vo: HomeCharacterVO, onClick: (HomeCharacterVO) -> Unit) {

            val url = vo.urlImage.replace("http", "https")

            view.setOnClickListener { onClick(vo) }

            Picasso.get()
                .load(url)
                .into(view.ivHomeItem)

            view.tvHomeTitle.text = vo.name

        //    view.tvHomeDescription.text =
        //        vo.description.ifEmpty { view.resources.getString(R.string.lorem_ipsum) }
        }
    }
}
