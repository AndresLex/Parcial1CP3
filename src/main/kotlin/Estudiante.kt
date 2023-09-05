class Estudiante(nombre: String,apellido: String, identificacion: String, estaoCivil: String, var curso: Int): Persona(nombre,apellido,identificacion, estaoCivil) {
    fun matricularEstudiante(nombre: String, apellido: String, identificacion: String, estaoCivil: String,curso: Int){
        this.nombre = nombre
        this.apellido = apellido
        this.identificacion = identificacion
        this.estaoCivil = estaoCivil
        this.curso = curso
    }

    fun cambiarCurso(curso: Int){
        this.curso = curso
    }

    fun mostrarInfo(): String{
        return """
            Estudiante: $nombre $apellido
            Identificacion: $identificacion            
            Estado Civil: $estaoCivil
            Curso: $curso
        """.trimIndent()
    }
}