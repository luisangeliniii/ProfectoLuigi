package com.example.proyectoluis

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MainViewModelTest {

    private lateinit var viewModel: MainViewModel

    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @Test
    fun testTextComparison() {
        viewModel.text1 = "Hello"
        viewModel.text2 = "Hello"
        assertEquals("Texts are equal", viewModel.text1, viewModel.text2)
    }
}