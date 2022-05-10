function Aluno(nome, idade, turma, sexo){
    this.nome = nome
    this.idade = idade
    this.turma = turma
    this.sexo = sexo

    return {
        exibeAluno: () => {
            const aluno = document.createElement("span");
        aluno.innerText = `\nNome: ${nome}\nIdade: ${idade}\nTurma: ${turma}\nSexo: ${sexo}\n`

        const pai = document.querySelector('body');
        pai.appendChild(aluno)
        }
    }
}

const aluno1 = new Aluno('Antonio', 40, '2B', 'M');
const aluno2 = new Aluno('Ruth', 20, '3B', 'M');
const aluno3 = new Aluno('Maria', 28, '4B', 'F');

aluno1.exibeAluno()
aluno2.exibeAluno()
aluno3.exibeAluno()