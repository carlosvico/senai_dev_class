// Seletores
const todoInput = document.querySelector('.todo-input');
const todoButton = document.querySelector('.todo-button');
const todoList = document.querySelector('.todo-list');// ul


// Events
todoButton.addEventListener('click', addTodo)

// Functions
function addTodo(event){

    // impede a ação padrão 
    event.preventDefault()
    
    // Cria o div do Todo
    const todoDiv = document.createElement('div');
    todoDiv.classList.add('todo');

    // Cria as Li's
    const newTodo = document.createElement('li');
    newTodo.innerText = todoInput.value;
    newTodo.classList.add('todo-item')

    todoDiv.appendChild(newTodo);

    // Botão de marcar
    const completeButton = document.createElement('button');
    completeButton.innerHTML = '<i class="fas fa-check"></i>';
    completeButton.classList.add('complete-btn');
    todoDiv.appendChild(completeButton);

    // Botão
    const trashButton = document.createElement('button');

    // botao apagar
    trashButton.innerHTML = '<i class="fas fa-trash"></i>';
    trashButton.classList.add('trash-btn');
    todoDiv.appendChild(trashButton)

    // Append to list
    todoList.appendChild(todoDiv);

    // Clear Todo Input Value
    todoInput.value = '';

    // função para apagar a tarefa
    trashButton.addEventListener('click',  (apagar) => {
             
            setInterval(function () {
                apagar.target.parentNode.parentNode.remove();
            }, 200);
        });





   

}