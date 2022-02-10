# Codebrain-backend
Backend api for CodeBrain



Recursos disponiveis

Add new product:
method:POST
URL:https://codebrain-backend.herokuapp.com/api/novo-produto
ex.:
{"nome":"Laranja",
"preco":3.55,
"image":"https://conteudo.imguol.com.br/c/entretenimento/13/2018/05/02/laranja-1525294392211_v2_750x421.jpg"
}

Get All products:
method:GET
URL:https://codebrain-backend.herokuapp.com/api/produtos
ex.:
[{"nome":"Laranja",
"preco":3.55,
"image":"https://conteudo.imguol.com.br/c/entretenimento/13/2018/05/02/laranja-1525294392211_v2_750x421.jpg"
}]

Checkout:
method:POST
URL:https://codebrain-backend.herokuapp.com/api/novo-produto
ex.:
{"listaVenda":[{
"id":1,
"nome":"Laranja",
"preco":3.55,
"image":"https://conteudo.imguol.com.br/c/entretenimento/13/2018/05/02/laranja-1525294392211_v2_750x421.jpg"
}]}

Get All Checkouts:
method:GET
URL:https://codebrain-backend.herokuapp.com/api/produtos
ex.:
[{"nome":"Laranja",
"preco":3.55,
"image":"https://conteudo.imguol.com.br/c/entretenimento/13/2018/05/02/laranja-1525294392211_v2_750x421.jpg"
}]
