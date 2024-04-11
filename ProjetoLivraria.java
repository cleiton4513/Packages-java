package br.unipar.ads.projetolivraria;

import br.unipar.ads.projetolivraria.Endereco;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.JOptionPane;
import br.unipar.ads.projetolivraria.Cliente;



public class ProjetoLivraria {

    

    public static void main(String[] args) {
        
        String nome;
        String entradaNome;
        
        Cliente clientesCadastrados = new Cliente();//objeto do arrayList
        Cliente clienteProcurado = new Cliente();//objeto para encontrar cliente
        //clientes
        Cliente cliente01 = new Cliente();
        Cliente cliente02 = new Cliente();
        
        //criando objeto endereco do cliente02
        Endereco endCliente02 = new Endereco();
        endCliente02.setNomeRua("Eduardo domaraski");
        endCliente02.setCidade("toledo");
        endCliente02.setNumRua(354);
        endCliente02.setUf("Pr");
        
        //cliente02 setando valores no cadastro
        cliente02.setNome("Gilberto");
        cliente02.setCpf("045.287.258-45");
        cliente02.setEndereco(endCliente02);
        cliente02.setCadastrado(true);
        cliente02.setNumId(455);
        
        //adicionando o cliente 02 a lista de cadastro
        clientesCadastrados.addClientes(cliente02);
        
        // verificacao para saber se o cliente está cadastrado ou não.
        JOptionPane.showMessageDialog(null, "VERIFICAR "
                + "CADASTRO DE CLIENTE");
        //informa o nome para verificação
        entradaNome = JOptionPane.showInputDialog("Informe o nome");
        nome = entradaNome.toUpperCase();
        
       
        //aqui esta o cliente que ai ser procurado, ira ser pelo nome do cliente
        clienteProcurado.setNome(nome.toUpperCase());
     
        boolean clienteEcontrado = false;
               /*for vai percorrer a lista clientes cadastrados e 
                verificar se contem cliente(nome) nela.*/
               
            for(Cliente cliente : clientesCadastrados.getClientesCadastrados()){
                if(cliente.getNome().toUpperCase().equals(nome))
            {
                String atualizarDados;
                clienteEcontrado = true;
                JOptionPane.showMessageDialog(null, "Cliente já "
                        + "possui cadastro");
                /*se cliente possui cadastro, aqui vai verificar e atualizar os
                dados*/
                atualizarDados =  JOptionPane.showInputDialog(null,
                        "Desea atualizar seus dados?");
                if(atualizarDados.toUpperCase().equals("SIM")){
                    /*se o cliente estiver algum dado para atualizar entao 
                    chama o metodo do objeto cliente e atualiza os dados 
                    necessarios.
                    */
                    cliente.atualizarCliente();
                }

                break;
            }
                /*verificacao, se o cliente nao for encontrado na lista de 
                clientes cadastrados, entao realizar o cadastro abaixo...
                */
            if(!clienteEcontrado){
               
                String inputCadastro;
                String cadastrar = null;
                JOptionPane.showMessageDialog(null, "Cliente não "
                        + "possui cadastro");
                //verificar se quer realizar cadastro
                inputCadastro = JOptionPane.showInputDialog(null, 
                        "Realizar cadastro?");
                if(inputCadastro != null){/*se a entrada for diferente de null
                    entao variavel cadastrar recebe a entrada em maiusculo.*/
                cadastrar = inputCadastro.toUpperCase();
                }
                /*verificando se a entrada foi sim, quer cadastrar. abaixo 
                realizar cadastro do cliente.*/
                if("SIM".equals(cadastrar)){/*se cadastrar for igual a 
                    "SIM", segue comandos abaixo.*/
                    String nomeRua;
                    int cep = 0;
                    String cidade;
                    String uf; 
                    String input;
                    int numRua;
                    int numId = 0; 
                    Endereco endereco; 
                    String telefone;
                    String cpf;
                    Date inicioCadastro;

                    Random numIdent = new Random();//gera numero aleatorio
                    Date dataHoraAtual  = new Date();//gera data atual e hora

                     /*realizando cadastro de cliente, recebendo as entradas
                     dos dados do cliente*/
                    nome = JOptionPane.showInputDialog(null
                            ,"informe o nome");
                    telefone = JOptionPane.showInputDialog(null
                            ,"informe o telefone");
                    cpf = JOptionPane.showInputDialog(null
                            ,"informe o cpf");
                    nomeRua = JOptionPane.showInputDialog(null
                            ,"informe o nome da rua");
                    input = JOptionPane.showInputDialog(null,
                            "informe o numero do complemento");
                    numRua = Integer.parseInt(input);
                    input = JOptionPane.showInputDialog(null,
                            "informe o cep");
                    cep = Integer.parseInt(input);
                    cidade = JOptionPane.showInputDialog(null,
                            "informe a cidade");
                    uf = JOptionPane.showInputDialog(null,
                            "informe o estado");
                    numId = numIdent.nextInt(1000);
                    inicioCadastro = dataHoraAtual ;

                    /*instanciando um objeto, é o endereço do cliente01,
                    passando por parametros os atributos*/
                    Endereco endCliente01 = new Endereco(nomeRua,numRua,cep,
                    cidade,uf);

                    endereco = endCliente01;/*adicionando objeto endereco*/

                    /*setando os dados, aos atributos que foram recebidos 
                    pelo cliente
                    */
                    cliente01.setNome(nome);
                    cliente01.setCpf(cpf);
                    cliente01.setEndereco(endereco);
                    cliente01.setInicioCadastro(inicioCadastro);
                    cliente01.setNumId(numId);
                    cliente01.setTelefone(telefone);
                    
                    //adicionando cliente a lista de cadastrados
                    clientesCadastrados.addClientes(cliente01);
                    

                }else{
                    JOptionPane.showMessageDialog(null, "Cadastro do "
                            + "cliente não realizado");
                }
                
            }
        
        }
            System.out.println(clientesCadastrados.getClientesCadastrados());
    }
}
