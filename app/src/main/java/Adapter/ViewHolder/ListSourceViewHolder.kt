package Adapter.ViewHolder

import Interface.ItemClickListener
import android.view.View
import androidx.recyclerview.widget.RecyclerView


class ListSourceViewHolder (itemView:View):RecyclerView.ViewHolder(itemView) ,View.OnClickListener {
    private lateinit var itemClickListener: ItemClickListener

    val source_title=itemView.source_news_name

    fun setItemClickListener(itemClickListener: ItemClickListener)

    {
        this.itemClickListener=itemClickListener
    }

    override fun onClick(v: View?) {
        itemClickListener.onClick(v!!,adapterPosition)
    }

}