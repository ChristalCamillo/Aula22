package ex02

abstract class Forma {
    protected abstract fun calcularArea(): Float
    protected abstract fun calcularPerimetro(): Float
    internal abstract fun mostrarArea()
    internal abstract fun mostrarPerimetro()
}