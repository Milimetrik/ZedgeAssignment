package com.engin.zedgeassignment.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.engin.zedgeassignment.adapters.FavouriteImagesAdapter
import com.engin.zedgeassignment.databinding.FragmentFavouriteImagesBinding
import com.engin.zedgeassignment.util.Constants
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FavouriteImagesFragment : Fragment() {

    private var _binding: FragmentFavouriteImagesBinding? = null
    private val binding get() = _binding!!

    lateinit var viewModel: ImagesViewModel

    @Inject
    lateinit var favouriteImagesAdapter: FavouriteImagesAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFavouriteImagesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[ImagesViewModel::class.java]

        subscribeToObservers()
        setupRecyclerView()
    }

    private fun subscribeToObservers() {
        viewModel?.favouriteImages?.observe(viewLifecycleOwner, Observer {
            favouriteImagesAdapter.images = it
        })
    }

    private fun setupRecyclerView() {
        binding.rvFavouriteImages.apply {
            adapter = favouriteImagesAdapter
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        }

        favouriteImagesAdapter.setOnItemClickListener { favouriteImage ->
            Intent(requireContext(), ImageDetailActivity::class.java).also {
                it.putExtra(Constants.IMAGE_ID, favouriteImage.id)
                it.putExtra(Constants.PREVIEW_URL, favouriteImage.previewURL)
                it.putExtra(Constants.LARGE_IMAGE_URL, favouriteImage.largeImageURL)
                it.putExtra(Constants.USER_NAME, favouriteImage.user)
                startActivity(it)
            }
        }
    }
}