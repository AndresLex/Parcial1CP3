class Empleado(nombre: String,apellido: String, identificacion: String, estaoCivil: String, var añoIncorpora: Int, var numeroDespacho: Int, var seccion: String): Persona(nombre,apellido,identificacion, estaoCivil){

    fun reasignacionDespacho(despacho: Int){
        this.numeroDespacho = despacho
    }

    fun trasladoSeccion(seccion: String){
        this.seccion = seccion
    }

    fun mostrarInfo(): String{
        return """
            Empleado: $nombre $apellido
            Identificacion: $identificacion            
            Estado Civil: $estaoCivil
            Año de incorporacion: $añoIncorpora 
            Numero del despacho: $numeroDespacho
            Seccion: $seccion
        """.trimIndent()
    }
}