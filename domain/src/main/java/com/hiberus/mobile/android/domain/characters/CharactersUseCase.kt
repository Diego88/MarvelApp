package com.hiberus.mobile.android.domain.characters

import com.hiberus.mobile.android.model.characters.bo.CharacterBo
import com.hiberus.mobile.android.repository.util.AsyncResult
import kotlinx.coroutines.flow.Flow

interface CharactersUseCase {

    suspend operator fun invoke(
        offset: Int,
        pageSize: Int,
        forceRefresh: Boolean = false
    ): Flow<AsyncResult<List<CharacterBo>>>
}