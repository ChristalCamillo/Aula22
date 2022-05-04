package ex01

class Livros(nome: String, preco: Double, codigoDebarra: Long, val autor: String) : ItensLoja(nome, preco, codigoDebarra) {
    override fun detalhesDoitem() {
        TODO("Not yet implemented")
    }
}