package com.engin.zedgeassignment.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.engin.zedgeassignment.data.remote.ImagesAPI
import com.engin.zedgeassignment.data.remote.responses.ImageResponse
import com.engin.zedgeassignment.data.remote.responses.ImageResult
import javax.inject.Inject

private const val TMDB_STARTING_PAGE_INDEX = 1

class ImagesDataSource @Inject constructor(
    private val imagesApi: ImagesAPI
) : PagingSource<Int, ImageResult>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ImageResult> {
//        val pageIndex = params.key ?: TMDB_STARTING_PAGE_INDEX
//        try {
//            // Start refresh at page 1 if undefined.
//            val nextPage = params.key ?: 1
//            val response = imagesApi.getImageList(nextPage)
//
//            val list = response.body().let { it?.hits }
//
//            val nextKey =
//                if (list!!.isEmpty()) {
//                    null
//                } else {
//                    // By default, initial load size = 3 * NETWORK PAGE SIZE
//                    // ensure we're not requesting duplicating items at the 2nd request
//                    pageIndex + (params.loadSize / NETWORK_PAGE_SIZE)
//                }
//
//            return LoadResult.Page(
//                data = list,
//                prevKey = if (nextPage == 1) null else nextPage - 1,
//                nextKey = nextKey
//            )
//        } catch (e: Exception) {
//            return LoadResult.Error(e)
//        }

//        return try {
//            val page = params.key ?: 1
//            val response = imagesApi.getImageList(page)
//
//            val repos = response.body().let { it?.hits }
//            if (repos != null) {
//                var next: Int? = null
//                // Check if there is next page
//                response.headers()["Link"]?.let { link ->
//                    val regex = Regex("rel=\"next\"")
//                    if (regex.containsMatchIn(link)) {
//                        next = page + 1
//                    }
//                }
//                LoadResult.Page(
//                    data = repos,
//                    prevKey = null,
//                    nextKey = next
//                )
//            } else {
//                LoadResult.Page(
//                    data = emptyList(),
//                    prevKey = null,
//                    nextKey = null
//                )
//            }
//        } catch (e: Exception) {
//            LoadResult.Error(e)
//        }

        return try {
            val nextPageNumber = params.key ?: 1
            val response = imagesApi.getImageList(nextPageNumber)

            LoadResult.Page(
                data = response.body()!!.hits,
                prevKey = null,
                nextKey = nextPageNumber.plus(1)
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, ImageResult>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

}