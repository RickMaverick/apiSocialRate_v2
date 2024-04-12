[response4.json](https://github.com/RickMaverick/apiSocialRate_v2/files/14964408/response4.json)[response3.json](https://github.com/RickMaverick/apiSocialRate_v2/files/14964292/response3.json)[responseGetEventos2.json](https://github.com/RickMaverick/apiSocialRate_v2/files/14964275/responseGetEventos2.json)# SOCIAL RATE

## INTEGRANTES DO GRUPO:

- RM99721 - Ricardo Correia Temple
- RM550268 - Thábata Orbeteli Viotto Santos 
- RM97827 - Yago Taguchi Ruksenas
- RM99530 - Mateus Viana Batista
- RM99409 - Michael José Bernardi

RESPONSABILIDADES DE CADA MEMBRO:
- Ricardo será responsável pelo desenvolvimento do projeto Java com SpringBoot e da apresentação do Pitch;
- Michael, será responsável pela criação do escopo e documentação do Projeto;
- Thabata também será responsável pela documentação do Projeto;
- Yago, será responsável pelo desenvolvimento do Protótipo front-end, assim como as telas do figma;
- Mateus, será responsável pelo Projeto de Banco de Dados;

## DIAGRAMAS DO PROJETO JAVA
### DIAGRAMA ENTIDADE RELACIONAMENTO
![image](https://github.com/RickMaverick/apiSocialRate_v2/assets/122487111/3fd5fd08-9a74-40ca-abfd-a70931a069f3)

### DIAGRAMA DE CLASSES
![image](https://github.com/RickMaverick/apiSocialRate_v2/assets/122487111/ca3d4661-75e0-495f-835c-7afa76877e88)

## ARQUITETURA DO PROJETO
![image](https://github.com/RickMaverick/apiSocialRate_v2/assets/122487111/c06ea351-7e33-489c-b488-f1e2f6b495dc)

## ENDPOINTS DA API
ENDPOINTS DA CLASSE EVENTO:
- GET http://localhost:8080/api/eventos
- POST http://localhost:8080/api/eventos
- DELETE http://localhost:8080/api/eventos/{id}
- PUT http://localhost:8080/api/eventos/{id}

ENDPOINTS DA CLASSE TWEET:
- GET http://localhost:8080/api/tweet
- POST http://localhost:8080/api/tweet
- DELETE http://localhost:8080/api/tweet/{id} 

## ANEXOS
JSONS PARA TESTE:
### Criando 2 eventos distintos:

- {
  "nomeEvento": "Amazing Tech Conference",
  "setorEvento": "Technology",
  "tweetsEvento": [
    {
      "textTweet": "Great presentations and workshops at #TechConf2024!",
      "likeCountTweet": 120,
      "replyCountTweet": 15,
      "retweetsCountTweet": 28,
      "langTweet": "en"
    },
    {
      "textTweet": "Learning a lot about AI and machine learning here.",
      "likeCountTweet": 45,
      "replyCountTweet": 3,
      "retweetsCountTweet": 6,
      "langTweet": "en"
    },
    {
      "textTweet": "Met some inspiring people in the tech industry.",
      "likeCountTweet": 32,
      "replyCountTweet": 2,
      "retweetsCountTweet": 4,
      "langTweet": "en"
    }
  ]
}
- {
  "nomeEvento": "Global E-sports Championship",
  "setorEvento": "Gaming",
  "tweetsEvento": [
    {
      "textTweet": "Can't wait to see the finals of the GEC! #GEC2024",
      "likeCountTweet": 5200,
      "replyCountTweet": 780,
      "retweetsCountTweet": 1450,
      "langTweet": "en"
    },
    {
      "textTweet": "Who do you think will win the championship? #TeamFire  #TeamStorm",
      "likeCountTweet": 2100,
      "replyCountTweet": 425,
      "retweetsCountTweet": 870,
      "langTweet": "en"
    },
    {
      "textTweet": "Amazing atmosphere at the event! So much energy from the crowd. #GECRocks",
      "likeCountTweet": 1800,
      "replyCountTweet": 120,
      "retweetsCountTweet": 350,
      "langTweet": "en"
    }
  ]
}

LISTANDO OS EVENTOS
- [responseGetEventos.json](https://github.com/RickMaverick/apiSocialRate_v2/files/14964211/responseGetEventos.json)
[{"idEvento":1,"nomeEvento":"Amazing Tech Conference","setorEvento":"Technology","tweetsEvento":[{"idTweet":1,"textTweet":"Great presentations and workshops at #TechConf2024!","likeCountTweet":120,"replyCountTweet":15,"retweetsCountTweet":28,"langTweet":"en"},{"idTweet":2,"textTweet":"Learning a lot about AI and machine learning here.","likeCountTweet":45,"replyCountTweet":3,"retweetsCountTweet":6,"langTweet":"en"},{"idTweet":3,"textTweet":"Met some inspiring people in the tech industry.","likeCountTweet":32,"replyCountTweet":2,"retweetsCountTweet":4,"langTweet":"en"}]},{"idEvento":2,"nomeEvento":"Global E-sports Championship","setorEvento":"Gaming","tweetsEvento":[{"idTweet":4,"textTweet":"Can't wait to see the finals of the GEC! #GEC2024","likeCountTweet":5200,"replyCountTweet":780,"retweetsCountTweet":1450,"langTweet":"en"},{"idTweet":5,"textTweet":"Who do you think will win the championship? #TeamFire  #TeamStorm","likeCountTweet":2100,"replyCountTweet":425,"retweetsCountTweet":870,"langTweet":"en"},{"idTweet":6,"textTweet":"Amazing atmosphere at the event! So much energy from the crowd. #GECRocks","likeCountTweet":1800,"replyCountTweet":120,"retweetsCountTweet":350,"langTweet":"en"}]}]

ATUALIZANDO (PUT) NOME DO EVENTO DE ID 1 PELO ID
- {
  "nomeEvento": "Global Counter Strike 2 Championship",
  "setorEvento": "Gaming",
  "tweetsEvento": []
}

LISTAR EVENTOS E CONFERIR A ATUALIZAÇÃO
- [Uploading[{"idEvento":1,"nomeEvento":"Global Counter Strike 2 Championship","setorEvento":"Gaming","tweetsEvento":[{"idTweet":1,"textTweet":"Great presentations and workshops at #TechConf2024!","likeCountTweet":120,"replyCountTweet":15,"retweetsCountTweet":28,"langTweet":"en"},{"idTweet":2,"textTweet":"Learning a lot about AI and machine learning here.","likeCountTweet":45,"replyCountTweet":3,"retweetsCountTweet":6,"langTweet":"en"},{"idTweet":3,"textTweet":"Met some inspiring people in the tech industry.","likeCountTweet":32,"replyCountTweet":2,"retweetsCountTweet":4,"langTweet":"en"}]},{"idEvento":2,"nomeEvento":"Global E-sports Championship","setorEvento":"Gaming","tweetsEvento":[{"idTweet":4,"textTweet":"Can't wait to see the finals of the GEC! #GEC2024","likeCountTweet":5200,"replyCountTweet":780,"retweetsCountTweet":1450,"langTweet":"en"},{"idTweet":5,"textTweet":"Who do you think will win the championship? #TeamFire  #TeamStorm","likeCountTweet":2100,"replyCountTweet":425,"retweetsCountTweet":870,"langTweet":"en"},{"idTweet":6,"textTweet":"Amazing atmosphere at the event! So much energy from the crowd. #GECRocks","likeCountTweet":1800,"replyCountTweet":120,"retweetsCountTweet":350,"langTweet":"en"}]}] responseGetEventos2.json…]()

LISTAR OS EVENTOS APÓS DELETAR O EVENTO ID 1
- [Upload[{"idEvento":1,"nomeEvento":"Global Counter Strike 2 Championship","setorEvento":"Gaming","tweetsEvento":[{"idTweet":1,"textTweet":"Great presentations and workshops at #TechConf2024!","likeCountTweet":120,"replyCountTweet":15,"retweetsCountTweet":28,"langTweet":"en"},{"idTweet":2,"textTweet":"Learning a lot about AI and machine learning here.","likeCountTweet":45,"replyCountTweet":3,"retweetsCountTweet":6,"langTweet":"en"},{"idTweet":3,"textTweet":"Met some inspiring people in the tech industry.","likeCountTweet":32,"replyCountTweet":2,"retweetsCountTweet":4,"langTweet":"en"}]}]ing response3.json…]()

LISTAR TODOS OS TWEETS DOS EVENTOS (Obs: como apagamos um dos eventos, teremos apenas os tweets de 1 evento)
- [Upload[{"idTweet":1,"textTweet":"Great presentations and workshops at #TechConf2024!","likeCountTweet":120,"replyCountTweet":15,"retweetsCountTweet":28,"langTweet":"en"},{"idTweet":2,"textTweet":"Learning a lot about AI and machine learning here.","likeCountTweet":45,"replyCountTweet":3,"retweetsCountTweet":6,"langTweet":"en"},{"idTweet":3,"textTweet":"Met some inspiring people in the tech industry.","likeCountTweet":32,"replyCountTweet":2,"retweetsCountTweet":4,"langTweet":"en"}]ing response4.json…]()
