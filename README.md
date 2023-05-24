# Android E04: ActionBar

Professor: João Eduardo Montandon

## Lidando com a ActionBar

A `ActionBar` é um dos componentes mais importantes do Android, pois permite ao desenvolvedor
fornecer as ações disponíveis na tela para o usuário de forma consistente e adequada aos conceitos
de design da Google.

Essa atividade tem como objetivo compreender as principais funcionalidades existentes no `ActionBar`
através da customização de uma barra de tarefas de nosso aplicativo.

### Entendendo o Up Navigation

Crie uma nova tela chamada `SecondActivity` que será aberta a partir de um botão presente na
`MainActivity`. Adicione o recurso de **UpNavigation** à `SecondActivity` de forma que o usuário
possa retornar para a tela anterior através da ActionBar.

#### UpNavigation != Back

Customize o recurso de **UpNavigation** criado anteriormente para que ele admita um comportamento
diferente da ação de voltar do Android. É possível que, para fazer essa tarefa, você precise criar
uma terceira `Activity`.

### Adicionando Ações a ActionBar

Adicione à ActionBar tela `SecondActivity` as seguintes ações:

* Atualizar (Sempre visível)
* Buscar (Sempre visível)
* Compartilhar (Visível se houver espaço)
* Configurações (Nunca visível)
* About (Nunca visível)
* Sair (Nunca visível)

Os botões de buscar e atualizar devem ser representados, obrigatóriamente, por ícones para melhor
identificação das ações pelo usuário. Utilize este [site](https://material.io/icons/) para fazer o
download das imagens que serão utilizadas no menu.

Você ainda deverá implementar o comportamento das seguintes ações da ActionBar:

* Atualizar: Mostrar `Toast` na tela
* About: Mostrar `Dialog` com informações do aplicativo e Desenvolvedor
* Sair: Sair do aplicativo

### Reaproveitando o que já existe

Nem todas as ações você precisa implementar do zero! O Android disponibiliza algumas ações que
recorrentemente são utilizadas pelos aplicativos existentes. Esse reaproveitamente é ofertado
por meio de `ActionView`s e `ActionProvider`s.

Você deverá implementar a ação de busca utilizando o `SearchView` disponível no Android. Você também
deverá implementar sua ação de forma que um `Toast` seja disparado quando o usuário realizar a busca.

Além disso, você deverá utilizar o `ShareActionProvider` para fazer o compartilhamento do aplicativo
com seus amigos. Seu Provider deverá permitir que o conteúdo seja compartilhado preferencialmente
via WhatsApp.




