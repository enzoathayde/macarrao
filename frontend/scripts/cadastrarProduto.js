const formulario = document.getElementById("form"); // Access the form element

// Access form input elements
const nomeProduto = document.getElementById("nome")
const tipoProduto = document.getElementById("tipo")
const precoProduto = document.getElementById("preco")


function cadastrarProduto() {
  event.preventDefault(); 

  
  const novoProduto = {
    nome: nomeProduto.value,
    tipo: tipoProduto.value,
    preco: Number(precoProduto.value, 10) 
  };


  fetch("http://localhost:8080/produtos", {
    method: "POST",
    headers: {
      "content-type": "application/json"
    }, 
    body: JSON.stringify(novoProduto)
  })
    .then(response => {
      console.log('Response',response);
    })
    .catch(error => {
      console.error('Error', error);
    });
    console.log(novoProduto)
}

