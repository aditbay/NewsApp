package Interface

import android.view.View

interface ItemClickListener {
    fun View.onClick(view: View,position:Int)
    fun onClick(v: View?, adapterPosition: Int)
}