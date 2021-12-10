package com.example.tienda.view.adapter

import com.example.tienda.model.Products

interface ProductsListener {
    fun OnProductsClick(product:Products, position: Int)
}