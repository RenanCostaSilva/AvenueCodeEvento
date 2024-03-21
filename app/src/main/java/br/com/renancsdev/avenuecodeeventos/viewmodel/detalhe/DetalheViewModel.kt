package br.com.renancsdev.avenuecodeeventos.viewmodel.detalhe

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.renancsdev.avenuecodeeventos.api.call.CallEvento
import br.com.renancsdev.avenuecodeeventos.api.sealed.Resultado
import br.com.renancsdev.avenuecodeeventos.model.Evento
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class DetalheViewModel(private val api: CallEvento): ViewModel() {

    private val _eventoID = MutableLiveData<LiveData<Resultado<Evento?>>>()
    private val _checkIn = MutableLiveData<LiveData<Resultado<Evento?>>>()

    val id = 0
    private val nome = ""
    private val email = ""

    init {
        viewModelScope.launch(IO) {
            _eventoID.postValue(api.buscarEventosPorID(id))
            _checkIn.postValue(api.fazerCheckIn(nome , email , id))
        }
    }

    fun buscarEventosPorID(id: Int): LiveData<Resultado<Evento?>> =
        api.buscarEventosPorID(id)

    fun fazerCheckIN(nome: String , email: String , id: Int): LiveData<Resultado<Evento?>> =
        api.fazerCheckIn(nome , email ,id)
}