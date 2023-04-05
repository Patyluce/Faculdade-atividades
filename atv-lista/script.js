// vetor de objetos para os campos : descrição , nome , item e preço
let listaCompras = []

function adicionarItens() {

  let nome = document.getElementById("nome").value
  let descricao = document.getElementById("des").value
  let quantidade = document.getElementById("qtd").value
  let preco = document.getElementById("preco").value
  
  // criar objeto com os valores e adicionar na lista 
  let item = {
    nome: nome, removido: false ,
    des: descricao,
    qtd: quantidade,
    preco: preco
  }
  listaCompras.push(item)
  

  atualizarTabela()
  
  // limpar os inputs
  document.getElementById("nome").value = "";
  document.getElementById("des").value = "";
  document.getElementById("qtd").value = "";
  document.getElementById("preco").value = "";
}

function limpar() {
  
  listaCompras = []
  atualizarTabela()
}

/*
function remover() {
  -Não deu muito certo
  const tabela = document.getElementById('tabela');
  const colunaItem= tabela.rows[0];
  colunaItem.textContent = ''
  
}
*/
function remover(indice){

  const tabela = document.getElementById('tabela')
  const colunaItem= tabela.rows[indice + 1]
  colunaItem.remove()
 item.splice(indice, 1)

}


image.pngimage.png
function atualizarTabela() {

  let tabela = document.getElementById("tabela");
  

  tabela.innerHTML = "";
  
  // adicionar os cabeçalhos nas colunas
  let cabecalho = tabela.insertRow();
  let Item = cabecalho.insertCell();
  let Descricao = cabecalho.insertCell();
  let Quantidade = cabecalho.insertCell();
  let Preco = cabecalho.insertCell();
   Item.innerHTML = "<b>Item</b>";
  Descricao.innerHTML = "<b>Descrição</b>";
  Quantidade.innerHTML = "<b>Quantidade</b>";
  Preco.innerHTML = "<b>Preço</b>";
  
  // adicionar os itens da lista 
  for (let i = 0; i < listaCompras.length; i++) {
    let item = listaCompras[i];
    let linha = tabela.insertRow();
    let  Item = linha.insertCell();
    let Descricao = linha.insertCell();
    let Quantidade = linha.insertCell();
    let  Preco = linha.insertCell();
     Item.innerHTML = item.nome;
     Descricao.innerHTML = item.des;
     Quantidade.innerHTML = item.qtd;
     Preco.innerHTML = item.preco;
  }
}
