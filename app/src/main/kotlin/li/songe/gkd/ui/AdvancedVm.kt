package li.songe.gkd.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import li.songe.gkd.db.DbSet

class AdvancedVm : ViewModel() {
    val snapshotCountFlow =
        DbSet.snapshotDao.count().stateIn(viewModelScope, SharingStarted.Eagerly, 0)
}