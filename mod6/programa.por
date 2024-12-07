algoritmo "AcordarPessoa"
var
    pessoa_dormindo: logico
    tentativa: inteiro

inicio
    // Inicializando variáveis
    pessoa_dormindo <- verdadeiro
    tentativa <- 0

    // Início do processo de acordar
    enquanto pessoa_dormindo faca
        tentativa <- tentativa + 1
        escreva("Tentativa ", tentativa, ": Verificando se a pessoa está dormindo...")

        // Simulando ações para acordar
        escolha tentativa
            caso 1:
                escreva("\n- Chamar pelo nome.\n")
            caso 2:
                escreva("\n- Tocar no ombro levemente.\n")
            caso 3:
                escreva("\n- Aumentar a intensidade da voz.\n")
            caso 4:
                escreva("\n- Abrir as cortinas para a luz entrar.\n")
            caso 5:
                escreva("\n- Sacudir um pouco mais forte.\n")
            caso 6:
                escreva("\n- Usar estratégias mais criativas como cheirar café.\n")
            caso contrario:
                escreva("\n- Procurar alternativas mais drásticas!\n")
        fim escolha

        // Simular se a pessoa acordou
        escreva("\nA pessoa acordou? (1 para Sim, 0 para Não): ")
        leia(pessoa_dormindo)
        pessoa_dormindo <- nao (pessoa_dormindo = 1)
    fim enquanto

    escreva("\nA pessoa finalmente acordou na tentativa ", tentativa, "!\n")
fimalgoritmo
