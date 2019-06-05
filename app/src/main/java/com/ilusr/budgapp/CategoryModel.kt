package com.ilusr.budgapp

class CategoryModel {
    var categoryName: String
    var amount: Int
    var rollover: Boolean

    constructor(categoryName: String, amount: Int, rollover: Boolean) {
        this.categoryName = categoryName
        this.amount = amount
        this.rollover = rollover
    }
}