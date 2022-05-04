package ex01

abstract class ItensLoja(val nome: String,
                         val preco: Double,
                         val codigoDebarra: Long) {

    abstract fun detalhesDoitem()

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }


}