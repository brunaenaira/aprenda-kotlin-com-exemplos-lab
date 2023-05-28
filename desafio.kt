// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val conte1 = ConteudoEducacional("Python")
    val conte2 = ConteudoEducacional("C#")
    val user1 = Usuario()
    val user2 = Usuario()
    val formacao = Formacao("Android", listOf(conte1, conte2))
    formacao.matricular(user1)
    formacao.matricular(user2)
}
