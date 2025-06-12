class Biblioteca (val nome : String, val endereco : String, val cnpj : String){  
    
    val usuarios: MutableList<Usuario> = mutableListOf()
    
    val livros: MutableList<Livro> = mutableListOf()
    
    fun exibirObjBiblioteca(){
        println ("Bem vindo ao sistema da biblioteca $nome.")
    }

    fun cadastrarUsuario(usuario: Usuario){
        usuarios.add(usuario)
        println("Usuario $nome cadastrado!")
    }
}

class Usuario (val nome : String, val cpf : String, val dataNascimento : String,){
    fun exibirObjUsuario (){
        println("Bem vindo usuario $nome")
    }
}

class Livro (val nome : String, val autor : String, val tema : String,){
    fun exibirObjLivro (){
        println("Esse eh o livro $nome")
    }
}

fun main (){
    val biblioteca1 = Biblioteca("Super Biblioteca", "Rua secreta 123", "0123.123.123-12")

    biblioteca1.exibirObjBiblioteca()

    val usuario1 = Usuario("Carlos", "153.026.349-29", "28/03/2007")
    val usuario2 = Usuario("Carlos", "153.026.349-29", "28/03/2007")

    biblioteca1.cadastrarUsuario(usuario1)
    biblioteca1.cadastrarUsuario(usuario2)
    
    val livro1 = Livro("Otimo livro", "Carlos", "Alto nivel de gameplay")
    val livro2 = Livro("Otimo livro", "Carlos", "Alto nivel de gameplay")

    biblioteca1.cadasastrarLivros(livro1)
    biblioteca1.cadasastrarLivros(livro2)

    biblioteca1.listarUsuarios()
    biblioteca1.listarLivros()
}