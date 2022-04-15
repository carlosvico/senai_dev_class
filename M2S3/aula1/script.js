var btn = document.querySelector('button');
var txt = document.querySelector('p');
btn.addEventListener('click', updateBtn);
var txt = document.querySelector('p')

function updateBtn() {
    if (btn.textContent === 'Iniciar máquina') {
        btn.textContent = 'Para máquina';
        txt.textContent = 'A maquina iniciou';
    } else {

        btn.textContent = 'Inicar máquina';
        txt.textContent = 'A maquina esta parada';
        
    }

    
}