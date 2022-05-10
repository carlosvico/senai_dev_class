class Professor{

    constructor(nome, idade, sexo, disciplina ){

        this.nome = nome
        this.idade = idade
        this.sexo  = sexo
        this.disciplina = disciplina
        
    }

}

// Professor.prototype.exibir (nome, idade, sexo, disciplina) {
    
    



    
    function exibir(nome, idade, sexo, disciplina){
        
        
        const span = document.getElementById("ispan");
        span.innerText = `\nNome: ${nome}\nIdade: ${idade}\nSexo: ${sexo}\nDisciplina: ${disciplina}\n`
        
        const pai = document.querySelector('body');
       return  pai.appendChild(span)
    }
        
        
    const professor1 = new Professor('Marcos', 42, 'M', 'Ciências');
    const professor2 = new Professor('Silvia', 35, 'F', 'Inglês');
    const professor3 = new Professor('Cintia', 19, 'F', 'Matemática');


professor1.exibir()
professor2.exibir()
professor3.exibir()
