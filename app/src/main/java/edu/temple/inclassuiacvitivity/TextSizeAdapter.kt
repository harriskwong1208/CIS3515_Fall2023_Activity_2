package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, _textSizes : Array<Int>) : BaseAdapter(){

    val context = _context
    val textSizes = _textSizes

    override fun getCount(): Int {
       return textSizes.size
    }

    override fun getItem(p0: Int): Any {
        return textSizes[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        return (getDropDownView(p0,p1,p2) as TextView).apply{
            textSize = 22f
        }
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView

        if(position == null){
            textView = TextView(context)
            textView.setPadding(10,20,0,20)
        }
        else{
            textView = convertView as TextView
        }
        textView.textSize = textSizes[position].toFloat()
        textView.text = textSizes[position].toString()

        return textView
    }

}