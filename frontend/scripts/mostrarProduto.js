const loadingElement = document.querySelector("#loading")
const produtosContainer = document.querySelector("#produtos-container")
const rotaExibirProdutos = "http://localhost:8080/mostrarProdutos"
const tableStyle = document.createElement('style');
tableStyle.textContent = `
  table {
    border-collapse: collapse; /* Ensures borders don't overlap cells */
    width: 100%; /* Adjust as needed */
  }
  th, td {
    padding: 8px; /* Adjust padding for spacing */
    border: 1px solid #ddd; /* Add borders */
    text-align: left; /* Align content to the left */
  }
  th {
    background-color: #f2f2f2; /* Light background for headers */
  }
`;

async function exibirProdutos() {
  const response = await fetch(rotaExibirProdutos)
  // console.log(response)
  const data = await response.json()
  console.log(data)

  // loadingElement.classList.add("hide")
  data.map((produtos) => {
    const tabela = document.createElement("table")
    const linha = document.createElement("tr")
    const nome = document.createElement("td")
    const tipo = document.createElement("td")
    const preco = document.createElement("td")
    

    nome.innerText = produtos.nome
    tipo.innerText = produtos.tipo
    preco.innerText = produtos.preco

    tabela.appendChild(nome) 
    tabela.appendChild(tipo)
    tabela.appendChild(preco)

    produtosContainer.append(tabela)
  })

}

exibirProdutos()