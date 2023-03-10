

const btCalcular = document.getElementById("btCalcular")

    function somaRetorno (){

        const valor1 = Number(document.getElementById("valor1").value)
        const valor2 = Number(document.getElementById("valor2").value )
        let resultado = (valor1 + valor2) / 2

         alert(`A Média entre ${valor1} e ${valor2} é igual a ${resultado}`)
        
    
    }


    btCalcular.onclick= somaRetorno

