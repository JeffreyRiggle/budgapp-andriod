package com.ilusr.budgapp

import android.content.Context
import android.util.AttributeSet
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ListView

class CategoryConfigurationView : LinearLayout {
    private lateinit var categories: ArrayList<CategoryModel>
    private lateinit var listView: ListView
    private lateinit var addCategory: Button
    private lateinit var categoryName: EditText

    constructor(context: Context) : super(context) {
        init(null, 0)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init(attrs, defStyle)
    }

    private fun init(attrs: AttributeSet?, defStyle: Int) {
        categories = ArrayList()
        setupCategories()

        inflate(context, R.layout.category_configuration_view, this)
        listView = findViewById(R.id.categoryList)
        listView.adapter = CategoryItemAdapter(categories, context)

        categoryName =findViewById(R.id.newCategoryName)
        addCategory = findViewById(R.id.addCategoryBtn)
        addCategory.setOnClickListener {
            categories.add(CategoryModel(categoryName.text.toString(), 0, false))
            categoryName.setText("")
        }
    }

    private fun setupCategories() {
        categories.add(CategoryModel("Test", 100, false))
        categories.add(CategoryModel("Foo", 1100, false))
        categories.add(CategoryModel("Bar", 1200, true))
        categories.add(CategoryModel("Wow", 1300, false))
    }
}
