package com.ilusr.budgapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class CategoryItemAdapter : ArrayAdapter<CategoryModel> {
    private var categories: ArrayList<CategoryModel>

    constructor(items: ArrayList<CategoryModel>, context: Context) : super(context, R.layout.category_configuration_item, items) {
        this.categories = items
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return CategoryConfigurationItemView(categories[position], this.context)
    }
}