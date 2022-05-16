package com.engin.zedgeassignment.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.engin.zedgeassignment.adapters.ImageAdapter
import com.engin.zedgeassignment.databinding.FragmentImageListBinding
import com.engin.zedgeassignment.util.Constants
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class ImageListFragment : Fragment() {

    private var _binding: FragmentImageListBinding? = null
    private val binding get() = _binding!!

    lateinit var viewModel: ImagesViewModel

    @Inject
    lateinit var imageAdapter: ImageAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentImageListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[ImagesViewModel::class.java]

        setupRecyclerView()
        setupList()
    }

    private fun setupRecyclerView() {
        binding.rvImages.apply {
            adapter = imageAdapter
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        }

        imageAdapter.setOnItemClickListener { imageDetail ->
            viewModel.setSelectedImage(imageDetail)

            Intent(requireContext(), ImageDetailActivity::class.java).also {
                it.putExtra(Constants.IMAGE_ID, imageDetail.id)
                it.putExtra(Constants.PREVIEW_URL, imageDetail.previewURL)
                it.putExtra(Constants.LARGE_IMAGE_URL, imageDetail.largeImageURL)
                it.putExtra(Constants.USER_NAME, imageDetail.user)
                startActivity(it)
            }
        }
    }

    private fun setupList() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.allImages.collectLatest { pagedData ->
                imageAdapter.submitData(pagedData)
            }
        }
    }
}