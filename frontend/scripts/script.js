// Utilizando DOM

const formulario  = document.querySelector("form");  // acessei uma tag 


// estou acessando classes
const nomeProduto = document.querySelector(".nome");
const tipoProduto = document.querySelector(".tipo");
const precoProduto = document.querySelector(".preco");
const route = "http://localhost:8080/produtos"






function cadastrarProduto() {
  
  fetch(route,
    {
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      method: "POST", // ENVIAR ALGO 
      body: JSON.stringify({nomeProduto: nomeProduto.value, 
        tipoProduto: tipoProduto.value,
        precoProduto: precoProduto.value})
    })
    .then(function (res) {console.log(res)})  
    .catch(function (res) {console.log(res)}) 
};

function limparCadastro() {
  nomeProduto.value = "",
  tipoProduto.value = "",
  precoProduto.value = ""
}


// criação do objeto em JSON
formulario.addEventListener('submit', function(event) { 
  event.preventDefault();  // ESTUDAR ISSO
  cadastrarProduto();
  limparCadastro();
});

