public class Principal{
    public static void main(String[] args){
        int Escolha = 0;
        
        while (Escolha != 3){
        System.out.println("Escolha uma opção:\n\n(1) criar uma loja\n(2) criar um produto\n(3) sair");
        Escolha = Teclado.leInt();
        
        switch(Escolha){
            case 1: //CRIA A LOJA
                //criação de info básico da loja
                String nomeLoja = Teclado.leString("Digite o nome da loja: ");
                int nFuncionarios = Teclado.leInt("Número de funcionários");
                double salarioBase = Teclado.leDouble("Salário base: ");

                //Leituras e criação do Endereço
                System.out.println("\nInformações de endereço da loja");
                String rua = Teclado.leString("Rua: ");
                String cidade = Teclado.leString("Cidade: ");
                String estado = Teclado.leString("Estado: ");
                String pais = Teclado.leString("Pais: ");
                String cep = Teclado.leString("cep: ");
                String numero = Teclado.leString("numero: ");
                String complemento = Teclado.leString("complemento: ");

                Endereco endLoja = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);
                
                //Leituras e criação de Data
                System.out.println("\nData de fundação da loja");
                int dia = Teclado.leInt("Dia: ");
                int mes = Teclado.leInt("mes: ");
                int ano = Teclado.leInt("ano: ");

                Data fundData = new Data(dia, mes, ano);

                //cria loja com nome, número e salário de funcionário, endereço e data de fundação1
                Loja loja = new Loja(nomeLoja, nFuncionarios, salarioBase, endLoja, fundData);
                
                System.out.println("Loja criada com sucesso!");
                System.out.println("Dados da loja\n" + loja.toString());
                break;

            case 2: //CRIA O PRODUTO
                System.out.println("\nCriando um produto novo!");
                //info base
                String nomeProduto = Teclado.leString("Nome: ");
                double preco = Teclado.leDouble("Preco: ");
                //validade
                System.out.println("\nAdicione as informações da validade!");
                int diaValidade = Teclado.leInt("Dia: ");
                int mesValidade = Teclado.leInt("Mes: ");
                int anoValidade = Teclado.leInt("Ano: ");
                
                //cria objeto de Data chamado validade
                Data validade = new Data(diaValidade, mesValidade, anoValidade);

                //cria produto com validade
                Produto produto = new Produto(nomeProduto, preco, validade);
                
                Data dataAtual = new Data(20, 10, 2023);
                
                //Checa se o produto está vencido
                
                if (produto.estaVencido(dataAtual) == true){
                    System.out.println("PRODUTO VENCIDO");
                } else System.out.println("PRODUTO NÃO VENCIDO"); 
                //System.out.println(produto.testeValor(dataAtual));

                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
        }
    
    }
}