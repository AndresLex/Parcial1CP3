fun main() {
    var opc: Int?
    val listaEstudiantes = arrayListOf<Estudiante>()
    val listaEmpleados = arrayListOf<Empleado>()
    val listaProfesor = arrayListOf<Profesor>()
    do {
        println("""
            MENU GESTION FACULTAD
            
            1. Ingresar Estudiante
            2. Mostrar Estudiantes
            
            3. Ingresar Personal de Servicio
            4. Mostrar el Personal de servicio
            
            5. Ingresar Profesor
            6. Mostrar profesores inscritos
            
            7. Cambiar estado Civil
            8. Reasignacion despacho empleado
            9. Matricular estudiante en nuevo curso
            10. Cambiar departamento profesor
            
            11. Salir
                        
        """.trimIndent())
        opc = readln().toIntOrNull();
        when(opc){
            1 -> {
                println("Ingresar estudiante")
                println("Digite el nombre")
                var nombre = readln().toString()
                println("Digite el apellido")
                var apellido = readln().toString()
                println("Digite la identificacion")
                var identifica = readln().toString()
                println("Digite el estado civil")
                var estadoCivil = readln().toString()
                println("Digite el curso")
                var curso = readln().toInt()
                var estudiante = Estudiante(nombre,apellido,identifica,estadoCivil,curso)

                listaEstudiantes.add(estudiante)
            }
            2 -> {
                listaEstudiantes.forEach{
                    println(it.mostrarInfo())
                }
            }
            3 -> {
                println("Ingresar Personal de servicio")
                println("Digite el nombre")
                var nombre = readln().toString()
                println("Digite el apellido")
                var apellido = readln().toString()
                println("Digite la identificacion")
                var identifica = readln().toString()
                println("Digite el estado civil")
                var estadoCivil = readln().toString()
                println("Digite el año incorporacion")
                var año = readln().toInt()
                println("Digite el numero de despacho")
                var despacho = readln().toInt()
                println("Digite la Seccion a Asignar (Biblioteca, decatato, Secretaria)")
                var seccion = readln().toString()

                var empleado = Empleado(nombre,apellido,identifica,estadoCivil,año,despacho,seccion)
                listaEmpleados.add(empleado)
            }
            4 -> {
                listaEmpleados.forEach{
                    println(it.mostrarInfo())
                }
            }
            5 -> {
                println("Ingresar Profesor")
                println("Digite el nombre")
                var nombre = readln().toString()
                println("Digite el apellido")
                var apellido = readln().toString()
                println("Digite la identificacion")
                var identifica = readln().toString()
                println("Digite el estado civil")
                var estadoCivil = readln().toString()
                println("Digite el departamento (Lenguajes, Matematicas, Arquitectura)")
                var departamento = readln().toString()

                var profesor = Profesor(nombre,apellido,identifica,estadoCivil,departamento)
                listaProfesor.add(profesor)
            }
            6 -> {
                listaProfesor.forEach{
                    println(it.mostrarInfo())
                }
            }
            7 -> {
                println("Cambio de estado civil")
                println("Digite el nombre del estudiante")
                var nombre = readln().toString()
                var estudiante = listaEstudiantes.find { it.nombre == nombre }
                println("Digite el estado")
                var estado = readln().toString()
                if (estudiante != null) {
                    estudiante.cambiarEstado(estado)
                }else{
                    println("No se encuentra el nombre")
                }
            }
            8 -> {
                println("Reasignacion despacho empleado")
                println("Digite el nombre del empleado")
                var nombre = readln().toString()
                var empleado = listaEmpleados.find { it.nombre == nombre }
                println("Digite el nuevo numero de despacho")
                var despacho = readln().toInt()
                if (empleado != null) {
                    empleado.reasignacionDespacho(despacho)
                }else{
                    println("No se encuentra el nombre")
                }
            }
            9 -> {
                println("Cambio de curso estudiante")
                println("Digite el nombre del estudiante")
                var nombre = readln().toString()
                var estudiante = listaEstudiantes.find { it.nombre == nombre }
                println("Digite el nuevo curso")
                var curso = readln().toInt()
                if (estudiante != null) {
                    estudiante.cambiarCurso(curso)
                }else{
                    println("No se encuentra el nombre")
                }
            }
            10 -> {
                println("Cambio departamento profesor")
                println("Digite el nombre del profesor")
                var nombre = readln().toString()
                var estudiante = listaProfesor.find { it.nombre == nombre }
                println("Digite el nuevo departamento")
                var depa = readln().toString()
                if (estudiante != null) {
                    estudiante.cambiarDepartamento(depa)
                }else{
                    println("No se encuentra el nombre")
                }
            }

        }

    }while (opc != 11)
}