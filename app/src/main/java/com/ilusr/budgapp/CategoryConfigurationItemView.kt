package com.ilusr.budgapp

import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.*

class CategoryConfigurationItemView: LinearLayout {
    private lateinit var categoryName: TextView
    private lateinit var categoryAmount: EditText
    private lateinit var rollover: CheckBox
    private var model: CategoryModel

    constructor(model: CategoryModel, context: Context) : super(context) {
        this.model = model
        init()
    }

    constructor(model: CategoryModel, context: Context, attrs: AttributeSet) : super(context, attrs) {
        this.model = model
        init()
    }

    constructor(model: CategoryModel, context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        this.model = model
        init()
    }

    private fun init() {
        LayoutInflater.from(context).inflate(R.layout.category_configuration_item, this)
        categoryName = findViewById(R.id.categoryNameField)
        categoryName.text = model.categoryName

        categoryAmount = findViewById(R.id.categoryAmount)
        categoryAmount.setText(model.amount.toString())
        categoryAmount.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                model.amount = p0.toString().toInt()
            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) { }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) { }
        })

        rollover = findViewById(R.id.rolloverCheckbox)
        rollover.isChecked = model.rollover
    }
}