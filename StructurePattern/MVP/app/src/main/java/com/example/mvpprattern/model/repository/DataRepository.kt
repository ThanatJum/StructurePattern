package com.example.mvpprattern.model.repository

import android.arch.lifecycle.LiveData
import com.example.mvpprattern.model.api.APIManager
import com.example.mvpprattern.model.api.GetSomethingResponse
import com.example.mvpprattern.model.api.utility.TriggerEmpty
import com.example.mvpprattern.model.database.dao.SomethingDao
import com.example.mvpprattern.model.database.entity.DataEntity
import com.example.mvpprattern.model.repository.utility.NetworkBoundResource
import com.example.mvpprattern.utility.AppExecutors
import com.example.mvpprattern.utility.Resource
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import retrofit2.Response
import javax.inject.Inject

class DataRepository @Inject constructor(
    private val somethingDao: SomethingDao,
    private val appExecutors: AppExecutors,
    private val apiManager: APIManager
) {


     fun getProductList(request: TriggerEmpty.Data): LiveData<Resource<DataEntity>> {
        return object : NetworkBoundResource<DataEntity, GetSomethingResponse>(appExecutors) {


            override fun convertToResultType(response: GetSomethingResponse): DataEntity {
                return DataEntity(
                    null,
                    response.idApi,
                    response.NameApi,
                    response.priceApi
                )
            }

            override fun createCall(): Deferred<Response<GetSomethingResponse>> = GlobalScope.async {
                apiManager.getProductList().getSomething().execute()
            }

            override fun saveCallResult(item: DataEntity) {
                somethingDao.insertData(item)
            }

            override fun loadFromDb(): LiveData<DataEntity> {
                return somethingDao.getAlldata()
            }

            override fun shouldFetch(data: DataEntity?): Boolean {
                return data == null &&
                        request.needFresh
            }

            override fun onFetchFailed(errorMessage: String) {
                //  Do nothing
            }

        }.asLiveData()
    }


}