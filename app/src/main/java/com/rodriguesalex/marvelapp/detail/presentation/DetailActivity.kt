package com.rodriguesalex.marvelapp.detail.presentation

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.rodriguesalex.commoms.base.BaseActivity
import com.rodriguesalex.marvelapp.R
import com.rodriguesalex.marvelapp.databinding.ActivityDetailBinding
import com.rodriguesalex.marvelapp.detail.viewmodel.DetailViewModel
import com.rodriguesalex.marvelapp.detail.viewmodel.DetailViewModelState

class DetailActivity : BaseActivity() {

    private lateinit var binding: ActivityDetailBinding
    private val viewModel by lazy { appViewModel<DetailViewModel>() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView<ActivityDetailBinding>(this, R.layout.activity_detail).apply {
            lifecycleOwner = this@DetailActivity
            vm = viewModel
        }

        setupObservers()
    }

    private fun setupObservers() {
        viewModel.state.observe(this, Observer { state ->
            when (state) {
                is DetailViewModelState.Loaded ->
                binding.descriptionTextView.apply {
                    text = state.description.toString()
                }
            }
        })
    }

}
