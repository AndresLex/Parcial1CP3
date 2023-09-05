class Profesor(nombre: String,apellido: String, identificacion: String, estaoCivil: String, var departamento: String): Persona(nombre,apellido,identificacion, estaoCivil) {
    fun cambiarDepartamento(departamento: String){
        this.departamento = departamento
    }

    fun mostrarInfo(): String{
        return """
            Profesor: $nombre $apellido
            Identificacion: $identificacion            
            Estado Civil: $estaoCivil
            Departamento: $departamento
        """.trimIndent()
    }
}