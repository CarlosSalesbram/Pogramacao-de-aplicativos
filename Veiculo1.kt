open class Veiculo(val modelo : String, val ano : Int, val cor : String){
    
    init{
        println("")
    }
    
    open fun acelerarVeiculo(){
        println("Acelerar veiculo generica")
    }
}

class Carro (val cavalaria : Int, modelo : String, ano : Int, cor : String) : Veiculo(modelo, ano, cor){
    init{
        println("Criando novo obj da classe carro")
    }

    fun exibirObjCarro(){
        println("Objeto carro criado, modelo: $modelo, ano: $ano, cor: $cor")
    }

    override fun acelerarVeiculo(){
        println("Acelerando $modelo, vrum! vrum! vrum!")
    }
    
}

fun main (){
    val carro1 = Carro(400, "Fusca", 2020, "azul")
    val carro2 = Carro(200, "Onix", 2022, "preto")
    
    val moto1 = Moto(300, "Super Moto", 2020, "azul")
    val moto2 = Moto(120, "Mega moto", 2022, "preto")

    carro1.exibirObjCarro()
    carro2.exibirObjCarro()
    
    moto1.exibirObjMoto()
    moto2.exibirObjMoto()
    
    carro1.acelerarVeiculo()
    carro2.acelerarVeiculo()
    
    moto1.acelerarVeiculo()
    moto2.acelerarVeiculo()
}

class Moto (val cilindrada : Int, modelo : String, ano : Int, cor : String) : Veiculo(modelo, ano, cor){
    init{
        println("Criando novo obj da classe moto")
    }

    fun exibirObjMoto(){
        println("Objeto moto criado, modelo: $modelo, ano: $ano, cor: $cor")
    }

    override fun acelerarVeiculo(){
        println("Acelerando $modelo, vrum! vrum! vrum!")
    }
    
}