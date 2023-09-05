open class Persona (
    var nombre: String,
    var apellido: String,
    var identificacion: String,
    var estaoCivil: String) {


    open fun cambiarEstado(estado: String){
        this.estaoCivil = estado
    }
}